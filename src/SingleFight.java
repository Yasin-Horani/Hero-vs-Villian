import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleFight extends Root implements Fight {
    static Scanner sc = new Scanner(System.in);

    private static ArrayList<SingleFight> singleFightList = new ArrayList<>();
    private final Hero hero;
    private final Villain villain;
    private Fighter winner;
    private Fighter loser;
    private static int totalPoints = 0;

    public SingleFight(int id, String name, Hero hero, Villain villain) {
        super(id, name);
        this.hero = hero;
        this.villain = villain;
        singleFightList.add(this);
    }

    public static void startSingleFight() {
        System.out.println("----- Start a New Single Fight -----");
        Hero hero = selectHero();
        Villain villain = selectVillain();
        SingleFight singleFight = new SingleFight(ObjRepository.createNewId(), "Fight " + (singleFightList.size() + 1), hero, villain);

        System.out.println("a. Choose winner manually");
        System.out.println("b. Calculate winner automatically");

        String input;
        do {
            input = sc.nextLine();
            switch (input) {
                case "a":
                    singleFight.choiceWinner();
                    break;
                case "b":
                    singleFight.calculateWinner();
                    break;
                case "0":
                    Main.mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
        } while (!input.equals("a") && !input.equals("b"));
    }


    protected static Hero selectHero() {
        try {
            Methods.displayHerosList();
            System.out.println("Choose one Hero by entering their ID number:");
            int heroId = sc.nextInt();
            sc.nextLine();

            for (Hero hero : Hero.getHeroList()) {
                if (hero.getId() == heroId) {
                    return hero;
                }
            }

            System.out.println("Invalid Hero ID. Please try again!");
            return selectHero();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID.");
            sc.nextLine();
            return selectHero();
        }
    }


    protected static Villain selectVillain() {
        try {
            Methods.displayVillainList();
            System.out.println("Choose one Villain by entering their ID number:");
            int villainId = sc.nextInt();
            sc.nextLine();

            for (Villain villain : Villain.getVillainList()) {
                if (villain.getId() == villainId) {
                    return villain;
                }
            }

            System.out.println("Invalid Villain ID. Please try again!");
            return selectVillain();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID.");
            sc.nextLine();
            return selectVillain();
        }
    }


    @Override
    public void choiceWinner() {
        System.out.println("Choose the winner:");
        System.out.println("1. " + hero.getName());
        System.out.println("2. " + villain.getName());

        String input = sc.nextLine();


        switch (input) {
            case "1":
                winner = hero;
                loser = villain;
                break;
            case "2":
                winner = villain;
                loser = hero;
                break;
            default:
                System.out.println("Invalid choice. No winner selected.");
                return;
        }

        displayWinnerAndLoser(winner, loser);
        System.out.println("After this hard fight do you want to play again? (y/n)");
        String supInput = sc.nextLine();
        if (supInput.equals("n")) {
            Main.mainMenu();
        } else if (supInput.equals("y")) {
            startSingleFight();
        } else {
            System.out.println("Invalid input. Please enter 'y' to play again or 'n' to return to the main menu.");
        }

    }


    public void calculateWinner() {
        int heroTotalPower = hero.getPowerLevel();
        int villainTotalPower = villain.getPowerLevel();

        for (Weapon heroWeapon : Weapon.getWeaponList()) {
            if (heroWeapon.getOwner() == hero) {
                heroTotalPower += heroWeapon.getPowerlevel();
            }
        }

        for (Weapon villainWeapon : Weapon.getWeaponList()) {
            if (villainWeapon.getOwner() == villain) {
                villainTotalPower += villainWeapon.getPowerlevel();
            }
        }

        int winnerPoints;
        int loserPoints;

        if (heroTotalPower > villainTotalPower) {
            winner = hero;
            loser = villain;
            winnerPoints = 100 + heroTotalPower;
            loserPoints = villainTotalPower - 100;
        } else if (heroTotalPower < villainTotalPower) {
            winner = villain;
            loser = hero;
            winnerPoints = 100 + villainTotalPower;
            loserPoints = heroTotalPower - 100;
        } else {
            System.out.println("It's a draw! No winner.");
            return;
        }


        totalPoints += winnerPoints;
        winner.addPoints(winnerPoints);

        totalPoints -= loserPoints;
        loser.addPoints(loserPoints);

        displayWinnerAndLoser(winner, loser);
        updateFan(loser, winner);
        System.out.println("After this hard fight, do you want to play again? (y/n)");
        String input = sc.nextLine();
        if (input.equals("n")) {
            Main.mainMenu();
        } else if (input.equals("y")) {
            startSingleFight();
        } else {
            System.out.println("Invalid input. Please enter 'y' to play again or 'n' to return to the main menu.");
        }
    }

    public static void displayAllSingleFights() {
        if (singleFightList.isEmpty()) {
            System.out.println("No Single fights have been recorded.");
        } else {
            System.out.println("----- All Single Fights -----");
            for (SingleFight singleFight : singleFightList) {
                System.out.println(singleFight);
            }
        }
    }

    public void displayWinnerAndLoser(Fighter winner, Fighter loser) {
        System.out.println("===============================================");
        System.out.println(winner.getName() + " wins!🏆 " + loser.getName() + " loses!🤡");
        System.out.println("===============================================");
    }

    public void updateFan(Fighter loser, Fighter winner) {
        for (Fan fan : Fan.getFanList()) {
            ArrayList<Fighter> fanOfList = fan.getFanOfList();
            if (fanOfList.contains(loser)) {
                fanOfList.remove(loser);
                if (!fanOfList.contains(winner)) {
                    fanOfList.add(winner);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "🥊🥊 Fight ID: " + super.getId() +
                " Fight Name: " + super.getName() +
                " The Hero: 😇" + hero.getName() + " And " +
                " The Villain: 😈" + villain.getName() + " And " +
                " The Winner: 🏆" + winner.getName() + " And " +
                " The Loser: 🤡" + loser.getName() + " 🥊🥊";
    }
}