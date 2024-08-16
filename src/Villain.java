import java.util.ArrayList;

public class Villain extends Fighter {

    private static ArrayList<Villain> villainList = new ArrayList<>();
    private String evilPlan;
    private Hero archEnemy;
    protected ArrayList<Hero> Antiherobook = new ArrayList<>();

    public Villain(int id, String name, int age, String location, String oneLiner, int powerLevel, String evilPlan) {
        super(id, name, age, location, oneLiner, powerLevel);
        this.evilPlan = evilPlan;
        villainList.add(this);
    }

    public void setArchEnemy(Hero archEnemy) {
        this.archEnemy = archEnemy;
    }

    public void setAntiHerobook(Hero antiherobook) {
        this.Antiherobook.add(antiherobook);
    }


    public String getEvilPlan() {
        return evilPlan;
    }

    public Hero getArchEnemy() {
        return archEnemy;
    }

    public void getAntiHerobook() {   // naam aangepast
        System.out.println("Anti Hero Book for " + this.getName() + ":");
        for (Hero hero : Antiherobook) {
            System.out.println("-" + hero.getId() + " " + hero.getName());
        }
    }

    public static ArrayList<Villain> getVillainList() {
        return villainList;
    }

    @Override
    public String toString() {
        return "\n -id: (V-" + id + ")" +
                ",\n -name: '" + name + '\'' +
                ",\n -archEnemy: " + archEnemy + '\''+
                ",\n -evilPlan: '" + evilPlan + '\'' +
                ",\n -location: '" + location + '\'' +
                ",\n -oneLiner: '" + oneLiner + '\'' +
                ",\n -powerLevel: " + powerLevel;
    }
}
