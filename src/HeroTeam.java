import java.util.ArrayList;

public class HeroTeam extends Team {

    private static ArrayList<HeroTeam> heroTeamList = new ArrayList<>();
    private ArrayList<Hero> heroes;

    public HeroTeam(int id, String name, ArrayList<Hero> heroes) {
        super(id, name);
        this.heroes = new ArrayList<>(heroes);
        heroTeamList.add(this);
    }

    public static ArrayList<HeroTeam> getHeroTeamList() {
        return heroTeamList;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public String getHeroMembersList() {
        StringBuilder result = new StringBuilder();
        for (Hero hero : this.heroes) {
            result.append("H-(").append(hero.getId()).append(") ").append(hero.getName()).append("\n");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Hero Team ID= (HT-" + id + ")" +
                "\nHero Team Name='" + name + '\'' +
                "\nHeroes Members:\n" + getHeroMembersList();
    }
}
