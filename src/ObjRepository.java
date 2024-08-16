import java.util.ArrayList;
import java.util.Random;
public class ObjRepository {

    private static int idCounter = 0;

    public static int createNewId() {
        return ++idCounter;
    }

    public static void addObject() {
        Random random = new Random();
        // Heros
        Hero hero1 = new Hero(createNewId(), "Super man", 35000, "New Yourk", "Every Body Is Save", random.nextInt(1000), "Clark Joseph Kent");
        Hero hero2 = new Hero(createNewId(), "Captain Marvel", 35000, "Space", "Higher, Further, Faster", random.nextInt(1000), "Carol Danvers");
        Hero hero3 = new Hero(createNewId(), "Superman", 35000, "New York", "Everybody Is Safe", random.nextInt(1000), "Yasin Horani");
        Hero hero4 = new Hero(createNewId(), "Batwoman", 32000, "Gotham City", "Justice and Courage", random.nextInt(1000), "Kate Kane");
        Hero hero5 = new Hero(createNewId(), "Iron Man", 30000, "Los Angeles", "I Am Iron Man", random.nextInt(1000), "Tony Stark");
        Hero hero6 = new Hero(createNewId(), "Spider-Man", 28000, "New York", "With Great Power", random.nextInt(1000), "Peter Parker");
        Hero hero7 = new Hero(createNewId(), "Thor", 36000, "Asgard", "For Asgard", random.nextInt(1000), "Thor Odinson");
        Hero hero8 = new Hero(createNewId(), "Hulk", 34000, "New York", "Hulk Smash", random.nextInt(1000), "Bruce Banner");
        Hero hero9 = new Hero(createNewId(), "Wonder Woman", 33000, "Themyscira", "Truth and Courage", random.nextInt(1000), "Diana Prince");
        Hero hero10 = new Hero(createNewId(), "Black Panther", 31000, "Wakanda", "Wakanda Forever", random.nextInt(1000), "T'Challa");

        // Villain
        Villain villain1 = new Villain(createNewId(), "Joker", 255, "New York", "Heroes are nothing", random.nextInt(1000), "Destroy the heroes");
        Villain villain2 = new Villain(createNewId(), "Lex Luthor", 48, "Metropolis", "Knowledge is power", random.nextInt(1000), "Defeat Superman");
        Villain villain3 = new Villain(createNewId(), "Thanos", 1000, "Titan", "I am inevitable", random.nextInt(1000), "Balance the universe");
        Villain villain4 = new Villain(createNewId(), "Green Goblin", 45, "New York", "Chaos is my ally", random.nextInt(1000), "Defeat Spider-Man");
        Villain villain5 = new Villain(createNewId(), "Magneto", 60, "Genosha", "Mutants are superior", random.nextInt(1000), "Protect mutantkind");
        Villain villain6 = new Villain(createNewId(), "Ultron", 5, "Internet", "Peace in our time", random.nextInt(1000), "Exterminate humanity");
        Villain villain7 = new Villain(createNewId(), "Hela", 5000, "Asgard", "I am the goddess of death", random.nextInt(1000), "Rule the nine realms");
        Villain villain8 = new Villain(createNewId(), "Loki", 1000, "Asgard", "Trust my mischief", random.nextInt(1000), "Usurp Asgard's throne");
        Villain villain9 = new Villain(createNewId(), "Red Skull", 120, "Germany", "Hail Hydra", random.nextInt(1000), "World domination");
        Villain villain10 = new Villain(createNewId(), "Doctor Doom", 50, "Latveria", "None shall surpass Doom", random.nextInt(1000), "Conquer the world");
        // Hero teams
        ArrayList<Hero> herosMembers1 = new ArrayList<Hero>();
        herosMembers1.add(hero1);
        herosMembers1.add(hero3);
        herosMembers1.add(hero5);
        herosMembers1.add(hero7);
        herosMembers1.add(hero9);
        HeroTeam heroTeam1 = new HeroTeam(createNewId(), "The Strong Heros", herosMembers1);

        ArrayList<Hero> herosMembers2 = new ArrayList<Hero>();
        herosMembers2.add(hero2);
        herosMembers2.add(hero4);
        herosMembers2.add(hero6);
        herosMembers2.add(hero8);
        herosMembers2.add(hero10);
        HeroTeam heroTeam2 = new HeroTeam(createNewId(), "The Hamer", herosMembers2);

        ArrayList<Hero> herosMembers3 = new ArrayList<Hero>();
        herosMembers3.add(hero1);
        herosMembers3.add(hero4);
        herosMembers3.add(hero7);
        herosMembers3.add(hero10);
        herosMembers3.add(hero2);
        HeroTeam heroTeam3 = new HeroTeam(createNewId(), "Justice League", herosMembers3);

        ArrayList<Hero> herosMembers4 = new ArrayList<Hero>();
        herosMembers4.add(hero3);
        herosMembers4.add(hero6);
        herosMembers4.add(hero9);
        herosMembers4.add(hero1);
        herosMembers4.add(hero5);
        HeroTeam heroTeam4 = new HeroTeam(createNewId(), "Avengers", herosMembers4);

        ArrayList<Hero> herosMembers5 = new ArrayList<Hero>();
        herosMembers5.add(hero2);
        herosMembers5.add(hero5);
        herosMembers5.add(hero8);
        herosMembers5.add(hero10);
        herosMembers5.add(hero3);
        HeroTeam heroTeam5 = new HeroTeam(createNewId(), "Defenders", herosMembers5);

        // Villain teams
        ArrayList<Villain> villainMembers1 = new ArrayList<Villain>();
        villainMembers1.add(villain1);
        villainMembers1.add(villain3);
        villainMembers1.add(villain5);
        villainMembers1.add(villain7);
        villainMembers1.add(villain9);
        VillainTeam villainTeam1 = new VillainTeam(createNewId(), "The Darkness", villainMembers1);

        ArrayList<Villain> villainMembers2 = new ArrayList<Villain>();
        villainMembers2.add(villain2);
        villainMembers2.add(villain4);
        villainMembers2.add(villain6);
        villainMembers2.add(villain8);
        villainMembers2.add(villain10);
        VillainTeam villainTeam2 = new VillainTeam(createNewId(), "Shadow Syndicate", villainMembers2);

        ArrayList<Villain> villainMembers3 = new ArrayList<Villain>();
        villainMembers3.add(villain1);
        villainMembers3.add(villain4);
        villainMembers3.add(villain7);
        villainMembers3.add(villain10);
        villainMembers3.add(villain2);
        VillainTeam villainTeam3 = new VillainTeam(createNewId(), "Legion of Doom", villainMembers3);

        ArrayList<Villain> villainMembers4 = new ArrayList<Villain>();
        villainMembers4.add(villain3);
        villainMembers4.add(villain6);
        villainMembers4.add(villain9);
        villainMembers4.add(villain1);
        villainMembers4.add(villain5);
        VillainTeam villainTeam4 = new VillainTeam(createNewId(), "Sinister Six", villainMembers4);

        ArrayList<Villain> villainMembers5 = new ArrayList<Villain>();
        villainMembers5.add(villain2);
        villainMembers5.add(villain5);
        villainMembers5.add(villain8);
        villainMembers5.add(villain10);
        villainMembers5.add(villain3);
        VillainTeam villainTeam5 = new VillainTeam(createNewId(), "Masters of Evil", villainMembers5);

        // Creating Base instances
        Gadget base1 = new Base(createNewId(), "High-Tech Skyscraper", hero1, "Base", "A state-of-the-art skyscraper equipped with advanced technology.", "Den Haag");
        Gadget base2 = new Base(createNewId(), "Secret Lair", hero2, "Base", "A hidden lair equipped with cutting-edge technology for secret operations.", "Gotham City");
        Gadget base3 = new Base(createNewId(), "Underwater Hideout", hero3, "Base", "A concealed hideout beneath the ocean, accessible only to its owner.", "Atlantis");
        Gadget base4 = new Base(createNewId(), "Mountain Fortress", hero4, "Base", "A fortified stronghold nestled in the mountains, impenetrable to enemies.", "Himalayas");
        Gadget base5 = new Base(createNewId(), "Space Station", hero5, "Base", "A high-tech space station orbiting the Earth, serving as a base for interstellar operations.", "Orbit");
        Gadget base6 = new Base(createNewId(), "Moon Base", hero6, "Base", "A secure base on the moon, equipped with advanced life-support systems.", "Moon");
        Gadget base7 = new Base(createNewId(), "Volcano Lair", hero7, "Base", "A secretive lair inside an active volcano, hidden from the outside world.", "Mount Doom");
        Gadget base8 = new Base(createNewId(), "Desert Oasis", hero8, "Base", "A hidden oasis in the desert, providing a haven from the harsh environment.", "Sahara");
        Gadget base9 = new Base(createNewId(), "Arctic Outpost", hero9, "Base", "A remote outpost in the Arctic, equipped to handle extreme cold and isolation.", "Arctic Circle");
        Gadget base10 = new Base(createNewId(), "Floating Island", hero10, "Base", "A mysterious island floating in the sky, accessible only by air.", "Sky");

// Creating Vehicle instances
        Gadget vehicle1 = new Vehicle(createNewId(), "BMW", hero1, "Vehicle", "A high-performance BMW with advanced modifications.", 126, 120);
        Gadget vehicle2 = new Vehicle(createNewId(), "Batmobile", hero2, "Vehicle", "The iconic Batmobile, equipped with state-of-the-art technology and weaponry.", 1, 300);
        Gadget vehicle3 = new Vehicle(createNewId(), "Invisible Jet", hero3, "Vehicle", "A jet that can turn invisible, used for stealth missions.", 2, 1000);
        Gadget vehicle4 = new Vehicle(createNewId(), "Quinjet", hero4, "Vehicle", "A versatile aircraft used by superheroes for rapid transport.", 10, 800);
        Gadget vehicle5 = new Vehicle(createNewId(), "Iron Man Suit", hero5, "Vehicle", "A highly advanced suit of armor with flight capabilities and various weapons.", 1, 2000);
        Gadget vehicle6 = new Vehicle(createNewId(), "Web-Shooters", hero6, "Vehicle", "Devices worn on the wrists that shoot webs, used for swinging between buildings.", 1, 100);
        Gadget vehicle7 = new Vehicle(createNewId(), "Mjolnir", hero7, "Vehicle", "A powerful enchanted hammer that grants flight and control over lightning.", 1, 1000);
        Gadget vehicle8 = new Vehicle(createNewId(), "Hulk Buster", hero8, "Vehicle", "A heavy-duty suit designed to combat the Hulk, equipped with immense power.", 1, 500);
        Gadget vehicle9 = new Vehicle(createNewId(), "Jetpack", hero9, "Vehicle", "A compact jetpack that allows for personal flight.", 1, 300);
        Gadget vehicle10 = new Vehicle(createNewId(), "Panther Jet", hero10, "Vehicle", "A stealth jet designed with advanced technology and cloaking abilities.", 10, 900);

// Creating Weapon instances
        Gadget weapon1 = new Weapon(createNewId(), "Laser Sword", hero1, "Weapon", "A sword that emits a powerful laser beam capable of cutting through almost anything.", 150);
        Gadget weapon2 = new Weapon(createNewId(), "Batarang", hero2, "Weapon", "A sharp throwing weapon shaped like a bat, used by Batman.", 10);
        Gadget weapon3 = new Weapon(createNewId(), "Magic Trident", hero3, "Weapon", "A powerful trident imbued with magical properties, wielded by the ruler of Atlantis.", 20);
        Gadget weapon4 = new Weapon(createNewId(), "Vibranium Shield", hero4, "Weapon", "A nearly indestructible shield made of vibranium, used for defense and offense.", 30);
        Gadget weapon5 = new Weapon(createNewId(), "Repulsor Blasts", hero5, "Weapon", "Energy blasts emitted from the palms of the Iron Man suit.", 40);
        Gadget weapon6 = new Weapon(createNewId(), "Web-Shooters", hero6, "Weapon", "Devices that shoot webs, used for capturing enemies and swinging between buildings.", 50);
        Gadget weapon7 = new Weapon(createNewId(), "Stormbreaker", hero7, "Weapon", "A powerful axe-hammer that grants control over thunder and lightning.", 60);
        Gadget weapon8 = new Weapon(createNewId(), "Thunder Clap", hero8, "Weapon", "A devastating clap that generates shockwaves powerful enough to topple buildings.", 70);
        Gadget weapon9 = new Weapon(createNewId(), "Gamma Slam", hero9, "Weapon", "A powerful ground slam infused with gamma energy, causing massive destruction.", 80);
        Gadget weapon10 = new Weapon(createNewId(), "Vibranium Claws", hero10, "Weapon", "Sharp claws made of vibranium, capable of cutting through nearly any material.", 90);

// Creating Base instances for Villain
        Gadget base11 = new Base(createNewId(), "Doom Castle", villain1, "Base", "A formidable castle equipped with advanced defenses, ruled by Doctor Doom.", "Latveria");
        Gadget base12 = new Base(createNewId(), "Evil Lair", villain2, "Base", "A secretive lair used for plotting nefarious schemes.", "Gotham City");
        Gadget base13 = new Base(createNewId(), "Underground Bunker", villain3, "Base", "A hidden bunker beneath the city, fortified against attacks.", "London");
        Gadget base14 = new Base(createNewId(), "Sinister Citadel", villain4, "Base", "A towering citadel serving as a base for sinister operations.", "New York");
        Gadget base15 = new Base(createNewId(), "Lava Fortress", villain5, "Base", "A fortress built within a volcano, protected by molten lava.", "Mordor");
        Gadget base16 = new Base(createNewId(), "Terror Tower", villain6, "Base", "A towering structure instilling fear into all who approach.", "Tokyo");
        Gadget base17 = new Base(createNewId(), "Shadow Keep", villain7, "Base", "A dark and foreboding keep hidden in the shadows.", "Moscow");
        Gadget base18 = new Base(createNewId(), "Nightmare Nexus", villain8, "Base", "A nexus of nightmares, used for malevolent purposes.", "Paris");
        Gadget base19 = new Base(createNewId(), "Dark Den", villain9, "Base", "A den of darkness where evil plans are devised.", "Berlin");
        Gadget base20 = new Base(createNewId(), "Serpent Sanctuary", villain10, "Base", "A sanctuary for serpentine creatures and their master.", "Rio de Janeiro");

// Creating Vehicle instances for Villain
        Gadget vehicle11 = new Vehicle(createNewId(), "Deathmobile", villain1, "Vehicle", "A menacing vehicle designed for causing destruction.", 1, 300);
        Gadget vehicle12 = new Vehicle(createNewId(), "Flying Saucer", villain2, "Vehicle", "An advanced flying saucer used for abductions and reconnaissance.", 2, 1000);
        Gadget vehicle13 = new Vehicle(createNewId(), "Evil Airship", villain3, "Vehicle", "An airship equipped with dark energy weapons.", 10, 800);
        Gadget vehicle14 = new Vehicle(createNewId(), "Doomsday Device", villain4, "Vehicle", "A device capable of causing apocalyptic destruction.", 1, 2000);
        Gadget vehicle15 = new Vehicle(createNewId(), "Goblin Glider", villain5, "Vehicle", "A high-speed glider used by the Green Goblin.", 1, 100);
        Gadget vehicle16 = new Vehicle(createNewId(), "Sleek Submarine", villain6, "Vehicle", "A stealth submarine designed for underwater missions.", 1, 1000);
        Gadget vehicle17 = new Vehicle(createNewId(), "Venomous Van", villain7, "Vehicle", "A van loaded with toxic chemicals for nefarious purposes.", 1, 500);
        Gadget vehicle18 = new Vehicle(createNewId(), "Hijacked Helicopter", villain8, "Vehicle", "A stolen helicopter modified for evil deeds.", 1, 300);
        Gadget vehicle19 = new Vehicle(createNewId(), "Wicked Warship", villain9, "Vehicle", "A warship equipped with powerful weapons for naval battles.", 10, 900);
        Gadget vehicle20 = new Vehicle(createNewId(), "Nefarious Jet", villain10, "Vehicle", "A jet equipped with advanced technology for carrying out evil plans.", 1, 300);

// Creating Weapon instances for Villain
        Gadget weapon11 = new Weapon(createNewId(), "Doom Ray", villain1, "Weapon", "A ray gun that emits a beam of destructive energy.", 10);
        Gadget weapon12 = new Weapon(createNewId(), "Mind Control Device", villain2, "Weapon", "A device that allows the user to control the minds of others.", 20);
        Gadget weapon13 = new Weapon(createNewId(), "Dark Energy Staff", villain3, "Weapon", "A staff that channels dark energy for powerful attacks.", 30);
        Gadget weapon14 = new Weapon(createNewId(), "Soul-Sucking Sword", villain4, "Weapon", "A sword that can drain the life force of its victims.", 40);
        Gadget weapon15 = new Weapon(createNewId(), "Plague Launcher", villain5, "Weapon", "A weapon that launches projectiles filled with deadly pathogens.", 50);
        Gadget weapon16 = new Weapon(createNewId(), "Chaos Cannon", villain6, "Weapon", "A cannon that fires blasts of chaotic energy.", 60);
        Gadget weapon17 = new Weapon(createNewId(), "Toxic Gun", villain7, "Weapon", "A gun that shoots toxic chemicals.", 70);
        Gadget weapon18 = new Weapon(createNewId(), "Nightmare Nunchucks", villain8, "Weapon", "Nunchucks that induce nightmares upon contact.", 80);
        Gadget weapon19 = new Weapon(createNewId(), "Cursed Crossbow", villain9, "Weapon", "A crossbow that shoots cursed bolts.", 90);
        Gadget weapon20 = new Weapon(createNewId(), "Demonic Dagger", villain10, "Weapon", "A dagger infused with demonic energy, causing immense pain.", 100);

        // Villain
        // Fans
        ArrayList<Fighter> fan1 = new ArrayList<Fighter>();
        fan1.add(hero1);
        fan1.add(villain1);
        fan1.add(hero2);
        fan1.add(villain2);
        fan1.add(hero3);
        fan1.add(villain3);
        Fan Yasin = new Fan(createNewId(), "Yasin", fan1);

        ArrayList<Fighter> fan2 = new ArrayList<Fighter>();
        fan2.add(hero2);
        fan2.add(villain2);
        fan2.add(hero3);
        fan2.add(villain4);
        fan2.add(hero5);
        fan2.add(villain6);
        Fan jaap = new Fan(createNewId(), "Jaap", fan2);

        ArrayList<Fighter> fan3 = new ArrayList<Fighter>();
        fan3.add(hero4);
        fan3.add(villain4);
        fan3.add(hero5);
        fan3.add(villain5);
        fan3.add(hero6);
        fan3.add(villain6);
        Fan Muhammed = new Fan(createNewId(), "Muhammed", fan3);

        ArrayList<Fighter> fan4 = new ArrayList<Fighter>();
        fan4.add(hero7);
        fan4.add(villain7);
        fan4.add(hero8);
        fan4.add(villain8);
        fan4.add(hero9);
        fan4.add(villain9);
        Fan Arthur = new Fan(createNewId(), "Arthur", fan4);

        ArrayList<Fighter> fan5 = new ArrayList<Fighter>();
        fan5.add(hero1);
        fan5.add(villain2);
        fan5.add(hero3);
        fan5.add(villain4);
        fan5.add(hero5);
        fan5.add(villain6);
        Fan Furat = new Fan(createNewId(), "Furat", fan5);

        ArrayList<Fighter> fan6 = new ArrayList<Fighter>();
        fan6.add(hero2);
        fan6.add(villain3);
        fan6.add(hero4);
        fan6.add(villain5);
        fan6.add(hero6);
        fan6.add(villain7);
        Fan Jelle = new Fan(createNewId(), "Jelle", fan6);

        ArrayList<Fighter> fan7 = new ArrayList<Fighter>();
        fan7.add(hero3);
        fan7.add(villain1);
        fan7.add(hero5);
        fan7.add(villain2);
        fan7.add(hero7);
        fan7.add(villain3);
        Fan Sarah = new Fan(createNewId(), "Sarah", fan7);

        ArrayList<Fighter> fan8 = new ArrayList<Fighter>();
        fan8.add(hero6);
        fan8.add(villain4);
        fan8.add(hero8);
        fan8.add(villain5);
        fan8.add(hero10);
        fan8.add(villain6);
        Fan Tom = new Fan(createNewId(), "Tom", fan8);

        ArrayList<Fighter> fan9 = new ArrayList<Fighter>();
        fan9.add(hero1);
        fan9.add(villain7);
        fan9.add(hero3);
        fan9.add(villain8);
        fan9.add(hero5);
        fan9.add(villain9);
        Fan Lisa = new Fan(createNewId(), "Lisa", fan9);

        ArrayList<Fighter> fan10 = new ArrayList<Fighter>();
        fan10.add(hero2);
        fan10.add(villain3);
        fan10.add(hero4);
        fan10.add(villain5);
        fan10.add(hero6);
        fan10.add(villain7);
        Fan Robert = new Fan(createNewId(), "Robert", fan10);


        // ArchEnemy for Heros
        hero1.setArchEnemy(villain10);
        hero2.setArchEnemy(villain9);
        hero3.setArchEnemy(villain8);
        hero4.setArchEnemy(villain7);
        hero5.setArchEnemy(villain6);
        hero6.setArchEnemy(villain5);
        hero7.setArchEnemy(villain4);
        hero8.setArchEnemy(villain3);
        hero9.setArchEnemy(villain2);
        hero10.setArchEnemy(villain1);
        //ArchEnemy for Villain
        villain1.setArchEnemy(hero10);
        villain2.setArchEnemy(hero9);
        villain3.setArchEnemy(hero8);
        villain4.setArchEnemy(hero7);
        villain5.setArchEnemy(hero6);
        villain6.setArchEnemy(hero5);
        villain7.setArchEnemy(hero4);
        villain8.setArchEnemy(hero3);
        villain9.setArchEnemy(hero2);
        villain10.setArchEnemy(hero1);

        // Antivillainbook for hero
        hero1.setAntiVillainbook(villain10);
        hero1.setAntiVillainbook(villain9);
        hero1.setAntiVillainbook(villain8);
        hero1.setAntiVillainbook(villain7);
        hero2.setAntiVillainbook(villain6);
        hero2.setAntiVillainbook(villain5);
        hero2.setAntiVillainbook(villain4);
        hero2.setAntiVillainbook(villain3);
        hero3.setAntiVillainbook(villain2);
        hero3.setAntiVillainbook(villain1);
        hero4.setAntiVillainbook(villain10);
        hero4.setAntiVillainbook(villain4);
        hero4.setAntiVillainbook(villain2);
        hero4.setAntiVillainbook(villain1);
        hero5.setAntiVillainbook(villain10);
        hero5.setAntiVillainbook(villain4);
        hero5.setAntiVillainbook(villain2);
        hero6.setAntiVillainbook(villain1);
        hero7.setAntiVillainbook(villain10);
        hero7.setAntiVillainbook(villain4);
        hero7.setAntiVillainbook(villain2);
        hero8.setAntiVillainbook(villain1);
        hero9.setAntiVillainbook(villain10);
        hero9.setAntiVillainbook(villain4);
        hero9.setAntiVillainbook(villain2);
        hero9.setAntiVillainbook(villain1);
        hero10.setAntiVillainbook(villain10);
        hero10.setAntiVillainbook(villain4);
        hero10.setAntiVillainbook(villain2);

        // antiherobook for villain
        villain1.setAntiHerobook(hero10);
        villain1.setAntiHerobook(hero9);
        villain1.setAntiHerobook(hero6);
        villain2.setAntiHerobook(hero9);
        villain2.setAntiHerobook(hero8);
        villain2.setAntiHerobook(hero7);
        villain2.setAntiHerobook(hero6);
        villain3.setAntiHerobook(hero8);
        villain3.setAntiHerobook(hero7);
        villain3.setAntiHerobook(hero6);
        villain4.setAntiHerobook(hero7);
        villain4.setAntiHerobook(hero6);
        villain5.setAntiHerobook(hero3);
        villain5.setAntiHerobook(hero4);
        villain5.setAntiHerobook(hero5);
        villain5.setAntiHerobook(hero6);
        villain6.setAntiHerobook(hero5);
        villain6.setAntiHerobook(hero5);
        villain6.setAntiHerobook(hero5);
        villain7.setAntiHerobook(hero4);
        villain7.setAntiHerobook(hero4);
        villain7.setAntiHerobook(hero4);
        villain8.setAntiHerobook(hero3);
        villain8.setAntiHerobook(hero5);
        villain8.setAntiHerobook(hero7);
        villain9.setAntiHerobook(hero8);
        villain9.setAntiHerobook(hero9);
        villain9.setAntiHerobook(hero10);
        villain10.setAntiHerobook(hero1);
        villain10.setAntiHerobook(hero3);
    }
}
