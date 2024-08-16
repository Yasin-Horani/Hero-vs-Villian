import java.util.ArrayList;

public class Fan extends Root {
    private static ArrayList<Fan> fanList = new ArrayList<>();
    private ArrayList<Fighter> fanOf;

    public Fan(int id, String name, ArrayList<Fighter> fanOf) {
        super(id, name);
        this.fanOf = fanOf;
        fanList.add(this);
    }

    public static ArrayList<Fan> getFanList() {
        return fanList;
    }

    public String getFanOf() {
        String result = "";
        for (Fighter fighter : this.fanOf) {
            result += "-(" + fighter.getId() + ") " + fighter.getName() + "\n";
        }
        return result;
    }

    public ArrayList<Fighter> getFanOfList() {
        return fanOf;
    }

    @Override
    public String toString() {
        return "\n F-id: (" + id + ")" +
                "\n -Fan name: '" + name + '\'' +
                "\n -Fan Of: \n" + getFanOf();
    }
}
