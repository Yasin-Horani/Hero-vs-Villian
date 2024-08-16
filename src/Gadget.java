import java.util.ArrayList;

public abstract class Gadget {

    protected int id;
    protected String name;
    protected Fighter owner;
    protected String typeOfGadget;
    protected String omschrijving;
    protected static ArrayList<Gadget> gadgetList = new ArrayList<>();

    public Gadget(int id, String name, Fighter owner, String typeOfGadget, String omschrijving) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.typeOfGadget = typeOfGadget;
        this.omschrijving = omschrijving;
        gadgetList.add(this);
    }

    public Fighter getOwner() {
        return owner;
    }

    public static ArrayList<Gadget> getGadgetList() {
        return gadgetList;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", typeOfGadget='" + typeOfGadget + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }
}
