import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TeamFight extends Root implements Fight {

    static Scanner sc = new Scanner(System.in);

    private static final ArrayList<TeamFight> teamFightList = new ArrayList<>();
    private final HeroTeam heroTeam;
    private final VillainTeam villainTeam;
    private Team winnerTeam;
    private Team loserTeam;

    public TeamFight(int id, String name, HeroTeam heroTeam, VillainTeam villainTeam) {
        super(id, name);
        this.heroTeam = heroTeam;
        this.villainTeam = villainTeam;
        teamFightList.add(this);
    }

    public static void startTeamFight() {
        System.out.println("----- Start a New Team Fight -----");
        HeroTeam heroTeam = selectHeroTeam();
        VillainTeam villainTeam = selectVillainTeam();
        TeamFight teamFight = new TeamFight(ObjRepository.createNewId(), "Team Fight " + (teamFightList.size() + 1), heroTeam, villainTeam);
        System.out.println("a. Choose winner manually");
        System.out.println("b. Calculate winner automatically");

        String input;
        do {
            input = sc.nextLine();
            switch (input) {
                case "a":
                    teamFight.choiceWinner();
                    break;
                case "b":
                    teamFight.calculateWinner();
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

    @Override
    public void choiceWinner() {
        System.out.println("Choose the winner:");
        System.out.println("1. " + heroTeam.getName());
        System.out.println("2. " + villainTeam.getName());

        String input = sc.nextLine();


        switch (input) {
            case "1":
                winnerTeam = heroTeam;
                loserTeam = villainTeam;
                break;
            case "2":
                winnerTeam = villainTeam;
                loserTeam = heroTeam;
                break;
            default:
                System.out.println("Invalid choice. No winner selected.");
                return;
        }
        displayWinnerAndLoserTeams(winnerTeam, loserTeam);
        System.out.println("After this hard fight do you want to play again? (y/n)");
        String supInput = sc.nextLine();
        if (supInput.equals("n")) {
            Main.mainMenu();
        } else if (supInput.equals("y")) {
            startTeamFight();
        } else {
            System.out.println("Invalid input. Please enter 'y' to play again or 'n' to return to the main menu.");
        }
    }

    @Override
    public void calculateWinner() {
        Random random = new Random();
        boolean heroWins = random.nextBoolean();

        if (heroWins) {
            winnerTeam = heroTeam;
            loserTeam = villainTeam;
        } else {
            winnerTeam = villainTeam;
            loserTeam = heroTeam;
        }

        displayWinnerAndLoserTeams(winnerTeam, loserTeam);
        System.out.println("After this hard fight do you want to play again? (y/n)");
        String input = sc.nextLine();
        if (input.equals("n")) {
            Main.mainMenu();
        } else if (input.equals("y")) {
            startTeamFight();
        } else {
            System.out.println("Invalid input. Please enter 'y' to play again or 'n' to return to the main menu.");
        }
    }


    protected static HeroTeam selectHeroTeam() {
        try {
            Methods.displayHeroTeamList();
            System.out.println("Choose one HeroTeam by entering their ID number:");
            int heroTeamId = sc.nextInt();
            sc.nextLine();
            for (HeroTeam heroTeam : HeroTeam.getHeroTeamList()) {
                if (heroTeam.getId() == heroTeamId) {
                    return heroTeam;
                }
            }
            System.out.println("Invalid Hero Team ID. Please try again!");
            return selectHeroTeam();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID.");
            sc.nextLine();
            return selectHeroTeam();
        }
    }

    protected static VillainTeam selectVillainTeam() {
        try {
            Methods.displayVillainTeamList();
            System.out.println("Choose one VillainTeam by entering their ID number:");
            int villainTeamId = sc.nextInt();
            sc.nextLine();
            for (VillainTeam villainTeam : VillainTeam.getVillainTeamList()) {
                if (villainTeam.getId() == villainTeamId) {
                    return villainTeam;
                }
            }
            System.out.println("Invalid Villain Team ID. Please try again!");
            return selectVillainTeam();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID.");
            sc.nextLine();
            return selectVillainTeam();
        }
    }

    public static void displayAllTeamFights() {
        if (teamFightList.isEmpty()) {
            System.out.println("No Team fights have been recorded.");
        } else {
            System.out.println("----- All Team's Fights -----");
            for (TeamFight teamFight : teamFightList) {
                System.out.println(teamFight);
            }
        }
    }

    public void displayWinnerAndLoserTeams(Team winnerTeam, Team loserTeam) {
        System.out.println("===============================================");
        System.out.println(winnerTeam.getName() + " wins!🏆 " + loserTeam.getName() + " loses!🤡");
        System.out.println("===============================================");
    }

    @Override
    public String toString() {
        return "🥊🥊 Fight ID: " + getId() +
                " Fight Name: " + getName() +
                " The Hero Team😇" + heroTeam.getName() + " And " +
                " The Villain Team: 😈" + villainTeam.getName() + " And " +
                " The Winner: 🏆" + winnerTeam.getName() + " And " +
                " The Loser: 🤡" + loserTeam.getName() + " 🥊🥊";
    }
}