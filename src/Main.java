import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Methods.title();
        ObjRepository.addObject();
        mainMenu();
    }

    public static void mainMenu() {
        String input;
        do {
            Methods.clearConsole();
            Methods.mainMenuContent();
            input = sc.nextLine();
            switch (input) {
                case "1":
                    peopleAndFightersMenu();
                    break;
                case "2":
                    gadgetsMenu();
                    break;
                case "3":
                    fightsMenu();
                    break;
                default:
                    break;
            }
        } while (!input.equals("0"));
        System.out.println("Exiting...");
    }

    public static void peopleAndFightersMenu() {
        String input;
        do {
            Methods.clearConsole();
            Methods.peopleAndFightersMenuContent();
            input = sc.nextLine();
            switch (input) {
                case "1":
                    Methods.clearConsole();
                    Methods.displayHerosList();
                    break;
                case "2":
                    Methods.clearConsole();
                    Methods.displayVillainList();
                    break;
                case "3":
                    Methods.clearConsole();
                    Methods.displayHeroTeamList();
                    break;
                case "4":
                    Methods.clearConsole();
                    Methods.displayVillainTeamList();
                    break;
                case "5":
                    Methods.clearConsole();
                    Methods.displayFans();
                    break;
                case "6":
                    Methods.clearConsole();
                    Methods.viewAll();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
            if (!input.equals("0")) {
                System.out.println("Press Enter to continue...");
                sc.nextLine();
            }
        } while (!input.equals("0"));
    }

    public static void gadgetsMenu() {
        String input;
        do {
            Methods.clearConsole();
            System.out.println("(1) Display All Gadgets and Owners");
            System.out.println("(0) Back to Main Menu");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    Methods.clearConsole();
                    Methods.displayAllGadgetsAndOwners();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
            if (!input.equals("0")) {
                System.out.println("Press Enter to continue...");
                sc.nextLine();
            }
        } while (!input.equals("0"));
    }

    public static void fightsMenu() {
        String input;
        do {
            Methods.clearConsole();
            System.out.println("(1) Start Single Fight");
            System.out.println("(2) Start Team Fight");
            System.out.println("(3) Display All Single Fights");
            System.out.println("(4) Display All Team Fights");
            System.out.println("(5) Display All Fights");
            System.out.println("(0) Back to Main Menu");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    Methods.clearConsole();
                    SingleFight.startSingleFight();
                    break;
                case "2":
                    Methods.clearConsole();
                    TeamFight.startTeamFight();
                    break;
                case "3":
                    Methods.clearConsole();
                    SingleFight.displayAllSingleFights();
                    break;
                case "4":
                    Methods.clearConsole();
                    TeamFight.displayAllTeamFights();
                    break;
                case "5":
                    Methods.clearConsole();
                    SingleFight.displayAllSingleFights();
                    TeamFight.displayAllTeamFights();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
            if (!input.equals("0")) {
                System.out.println("Press Enter to continue...");
                sc.nextLine();
            }
        } while (!input.equals("0"));
    }
}
