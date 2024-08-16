import java.util.ArrayList;

public class VillainTeam extends Team {

    private static ArrayList<VillainTeam> villainTeamList = new ArrayList<>();
    private ArrayList<Villain> villains;

    public VillainTeam(int id, String name, ArrayList<Villain> villains) {
        super(id, name);
        this.villains = villains;
        villainTeamList.add(this);
    }

    public static ArrayList<VillainTeam> getVillainTeamList() {
        return villainTeamList;
    }
    public ArrayList<Villain> getVillains() {
        return villains;
    }

    public String getVillainMembersList() {
        String result = "";
        for (Villain villain : this.villains) {
            result += "V-(" + villain.getId() + ") " + villain.getName() + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Villain Team ID= (VT-" + id + ")" +
                "\nVillain Team Name='" + name + '\'' +
                "\nVillain Members:\n" + getVillainMembersList();
    }
}
