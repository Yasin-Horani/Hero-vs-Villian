import java.util.ArrayList;

public class Base extends Gadget {
    private String location;
    private static ArrayList<Base> baseList = new ArrayList<>();

    public Base(int id, String name, Fighter owner, String typeOfGadget, String omschrijving, String location) {
        super(id, name, owner, typeOfGadget, omschrijving);
        this.location = location;
        baseList.add(this);
    }

    public static ArrayList<Base> getBaseList() {
        return baseList;
    }

    @Override
    public String toString() {
        return "🌍Base: 🏜️" +
                ", id: " + id +
                ", name: " + name + '\'' +
                ", omschrijving: " + omschrijving + '\'' +
                ", location: " + location + '\'' +
                ", owner: " + owner.getName();
    }
}
