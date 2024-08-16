import java.util.ArrayList;

public class Weapon extends Gadget {

    private int powerlevel;
    private static ArrayList<Weapon> weaponList = new ArrayList<>();

    public Weapon(int id, String name, Fighter owner, String typeOfGadget, String omschrijving, int powerlevel) {
        super(id, name, owner, typeOfGadget, omschrijving);
        this.powerlevel = powerlevel;
        weaponList.add(this);
    }

    public static ArrayList<Weapon> getWeaponList() {
        return weaponList;
    }

    public int getPowerlevel() {
        return powerlevel;
    }




    @Override
    public String toString() {
        return "🚀Weapon: 🩻" +
                " id: " + id +
                " name: " + name + '\'' +
                ", omschrijving: " + omschrijving + '\'' +
                " powerlevel: " + powerlevel +
                " owner: " + owner.getName();
    }
}
