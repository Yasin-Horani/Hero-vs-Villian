import java.util.ArrayList;

public class Hero extends Fighter {

    private static ArrayList<Hero> heroList = new ArrayList<>();
    private String realName;
    private Villain archEnemy;
    private ArrayList<Villain> AntiVillainbook = new ArrayList<>();

    public Hero(int id, String name, int age, String location, String oneLiner, int powerLevel, String realName) {
        super(id, name, age, location, oneLiner, powerLevel);
        this.realName = realName;
        heroList.add(this);
    }

    public void setArchEnemy(Villain archEnemy) {
        this.archEnemy = archEnemy;
    }

    public void setAntiVillainbook(Villain antiVillainbook) {
        this.AntiVillainbook.add(antiVillainbook);
    }

    public Villain getArchEnemy() {
        return archEnemy;
    }

    public String getRealName() {
        return realName;
    }

    public void AntiVillainBook() {
        System.out.println("Anti Villains Book for " + this.getName() + ":");
        for (Villain villain : AntiVillainbook) {
            System.out.println("-" + villain.getId() + " " + villain.getName());
        }
    }

    public static ArrayList<Hero> getHeroList() {
        return heroList;
    }

    @Override
    public String toString() {
        return "\n -id = (H-" + id + ")" +
                "\n - name='" + name + '\'' +
                "\n -archEnemy:" + archEnemy + '\'' +
                "\n -realName:'" + realName + '\'' +
                "\n -location:'" + location + '\'' +
                "\n -oneLiner:'" + oneLiner + '\'' +
                "\n -powerLevel:" + powerLevel;
    }
}
