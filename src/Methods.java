import java.util.Scanner;
public class Methods {

    static Scanner sc = new Scanner(System.in);

    public static void title() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|    ##    #   #    #   #   ###   ####   #   #   ###   |");
        System.out.println("|  #   #   ## ##    ##  #    #    #   #  #   #  #      |");
        System.out.println("|  #   #   # # #    # # #    #    ####   #   #   ###   |");
        System.out.println("|  #   #   #   #    #  ##    #    #   #  #   #      #  |");
        System.out.println("|   ##     #   #    #   #   ###   ####    ###   ###    |");
        System.out.println("+------------------------------------------------------+");
    }

    public static void mainMenuContent() {
        System.out.println("Main Menu");
        System.out.println("(1) Menu people & Teams");
        System.out.println("(2) Menu Gadgets");
        System.out.println("(3) Menu Fights");
        System.out.println("(0) Exit");
    }

    public static void peopleAndFightersMenuContent() {
        System.out.println("Menu People & Fighters");
        System.out.println("(1) View Heroes");
        System.out.println("(2) View Villains");
        System.out.println("(3) View Hero Team");
        System.out.println("(4) View Villain Team");
        System.out.println("(5) View Fans");
        System.out.println("(6) View All Details");
        System.out.println("(0) Back to Main Menu");
    }

    public static void displayHerosList() {
        System.out.println("***************");
        System.out.println("* Hero's List *");
        System.out.println("***************");
        for (Hero hero : Hero.getHeroList()) {
            System.out.println("H-(" + hero.id + ") " + hero.getName());
        }
    }

    public static void displayVillainList() {
        System.out.println("******************");
        System.out.println("* Villain's List *");
        System.out.println("******************");
        for (Villain villain : Villain.getVillainList()) {
            System.out.println("V-(" + villain.id + ") " + villain.getName());
        }
    }

    public static void displayHeroTeamList() {
        System.out.println("********************");
        System.out.println("* Hero Team's List *");
        System.out.println("********************");
        for (HeroTeam heroTeam : HeroTeam.getHeroTeamList()) {
            System.out.println("HT-(" + heroTeam.id + ") " + heroTeam.getName());
        }
    }

    public static void displayVillainTeamList() {
        System.out.println("***********************");
        System.out.println("* Villain Team's List *");
        System.out.println("***********************");
        for (VillainTeam villainTeam : VillainTeam.getVillainTeamList()) {
            System.out.println("VT-(" + villainTeam.id + ") " + villainTeam.getName());
        }
    }

    public static void displayFans() {
        System.out.println("*************");
        System.out.println("* Fans List *");
        System.out.println("*************");
        for (Fan fan : Fan.getFanList()) {
            System.out.println("F-(" + fan.id + ") " + fan.getName());
        }
    }

    public static void displayVehcicle() {
        System.out.println("************");
        System.out.println("* Vehicles *");
        System.out.println("************");
        for (Gadget vehicle : Vehicle.getVehicleList()) {
            System.out.println("V-(" + vehicle.id + ") " + vehicle.name);
        }
    }

    public static void displayWeapon() {
        System.out.println("**********");
        System.out.println("* Weapons *");
        System.out.println("**********");
        for (Gadget weapon : Weapon.getWeaponList()) {
            System.out.println("W-(" + weapon.id + ") " + weapon.name);
        }
    }

    public static void displayBase() {
        System.out.println("********");
        System.out.println("* Bases *");
        System.out.println("********");
        for (Gadget base : Base.getBaseList()) {
            System.out.println("B-(" + base.id + ") " + base.name);
        }
    }

    public static void displayAllGadgetsAndOwners() {
        System.out.println("********************");
        System.out.println("* Gadgets and Owners *");
        System.out.println("********************");

        System.out.println("Bases:");
        for (Gadget base : Base.getBaseList()) {
            System.out.println("B-(" + base.id + ") " + base.name + " - Owner: " + base.owner.getName());
        }

        System.out.println("\nVehicles:");
        for (Gadget vehicle : Vehicle.getVehicleList()) {
            System.out.println("V-(" + vehicle.id + ") " + vehicle.name + " - Owner: " + vehicle.owner.getName());
        }

        System.out.println("\nWeapons:");
        for (Gadget weapon : Weapon.getWeaponList()) {
            System.out.println("W-(" + weapon.id + ") " + weapon.name + " - Owner: " + weapon.owner.getName());
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        title();
    }

    public static void viewAll() {
        displayHerosList();
        displayVillainList();
        displayHeroTeamList();
        displayVillainTeamList();
        displayFans();
        displayVehcicle();
        displayWeapon();
        displayBase();

        System.out.println("Enter the ID of the entity to view details, or 0 to return to the menu:");
        String input = sc.nextLine();

        if (!input.equals("0")) {
            showDetails(input);
        }
    }

    public static void showDetails(String id) {
        int entityId;
        try {
            entityId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID format.");
            return;
        }

        if (!showHeroDetails(entityId) && !showVillainDetails(entityId) && !showFanDetails(entityId) &&
                !showHeroTeamDetails(entityId) && !showVillainTeamDetails(entityId) &&
                !showVehicleDetails(entityId) && !showWeaponDetails(entityId) && !showBaseDetails(entityId)) {
            System.out.println("Entity not found.");
        }
    }

    public static boolean showHeroDetails(int id) {
        for (Hero hero : Hero.getHeroList()) {
            if (hero.id == id) {
                System.out.println("H-(" + hero.id + ")");
                System.out.println("Name: " + hero.getName());
                System.out.println("Location: " + hero.getLocation());
                System.out.println("Power Level: " + hero.powerLevel);
                System.out.println("Real Name: " + hero.getRealName());
                System.out.println("One Liner: " + hero.getOneLiner());
                System.out.println("Arch Enemy: " + hero.getArchEnemy().name);
                hero.AntiVillainBook();
                System.out.println("Owned Gadgets:");
                for (Gadget gadget : Gadget.getGadgetList()) {
                    if (gadget.owner == hero) {
                        System.out.println(" - " + gadget.name);
                    }
                }
                System.out.println("Members of Teams:");
                for (HeroTeam team : HeroTeam.getHeroTeamList()) {
                    if (team.getHeroes().contains(hero)) {
                        System.out.println(" - HT-(" + team.id + ") " + team.getName());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean showVillainDetails(int id) {
        for (Villain villain : Villain.getVillainList()) {
            if (villain.id == id) {
                System.out.println("V-(" + villain.id + ")");
                System.out.println("Name: " + villain.getName());
                System.out.println("Location: " + villain.getLocation());
                System.out.println("Power Level: " + villain.getPowerLevel());
                System.out.println("Evil Plan: " + villain.getEvilPlan());
                System.out.println("One Liner: " + villain.getOneLiner());
                System.out.println("Arch Enemy: " + villain.getArchEnemy().name);
                villain.getAntiHerobook();
                System.out.println("Owned Gadgets:");
                for (Gadget gadget : Gadget.getGadgetList()) {
                    if (gadget.owner == villain) {
                        System.out.println(" - " + gadget.name);
                    }
                }
                System.out.println("Members of Teams:");
                for (VillainTeam team : VillainTeam.getVillainTeamList()) {
                    if (team.getVillains().contains(villain)) {
                        System.out.println(" - VT-(" + team.id + ") " + team.getName());
                    }
                }

                return true;
            }
        }
        return false;
    }

    public static boolean showFanDetails(int id) {
        for (Fan fan : Fan.getFanList()) {
            if (fan.id == id) {
                System.out.println("F-(" + fan.id + ")");
                System.out.println("Name: " + fan.getName());
                System.out.println("Fan of:"  + fan.getFanOf());
                return true;
            }
        }
        return false;
    }

    public static boolean showHeroTeamDetails(int id) {
        for (HeroTeam heroTeam : HeroTeam.getHeroTeamList()) {
            if (heroTeam.id == id) {
                System.out.println("HT-(" + heroTeam.id + ")");
                System.out.println("Name: " + heroTeam.getName());
                System.out.println("☯️🥷🏻🤺🦾☯️🥷🏻🤺🦾");
                System.out.println(heroTeam);
                return true;
            }
        }
        return false;
    }

    public static boolean showVillainTeamDetails(int id) {
        for (VillainTeam villainTeam : VillainTeam.getVillainTeamList()) {
            if (villainTeam.id == id) {
                System.out.println("VT-(" + villainTeam.id + ")");
                System.out.println("Name: " + villainTeam.getName());
                System.out.println("👹👿👺😈👹👿👺😈");
                System.out.println(villainTeam);
                return true;
            }
        }
        return false;
    }

    public static boolean showVehicleDetails(int id) {
        for (Gadget vehicle : Vehicle.getVehicleList()) {
            if (vehicle.id == id) {
                System.out.println("V-(" + vehicle.id + ")");
                System.out.println("Name: " + vehicle.name);
                System.out.println(vehicle);
                return true;
            }
        }
        return false;
    }

    public static boolean showWeaponDetails(int id) {
        for (Gadget weapon : Weapon.getWeaponList()) {
            if (weapon.id == id) {
                System.out.println("W-(" + weapon.id + ")");
                System.out.println("Name: " + weapon.name);
                System.out.println(weapon);
                return true;
            }
        }
        return false;
    }

    public static boolean showBaseDetails(int id) {
        for (Gadget base : Base.getBaseList()) {
            if (base.id == id) {
                System.out.println("B-(" + base.id + ")");
                System.out.println("Name: " + base.name);
                System.out.println(base);
                return true;
            }
        }
        return false;
    }
}
