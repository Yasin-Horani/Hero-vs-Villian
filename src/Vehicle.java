import java.util.ArrayList;

public class Vehicle extends Gadget {

    private int speed;
    private int capacity;
    private static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public Vehicle(int id, String name, Fighter owner, String typeOfGadget, String omschrijving, int capacity, int speed) {
        super(id, name, owner, typeOfGadget, omschrijving);
        this.capacity = capacity;
        this.speed = speed;
        vehicleList.add(this);
    }

    public static ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    @Override
    public String toString() {
        return "🏎️Vehicle🚒:" +
                ", id:" + id +
                ", name: " + name + '\'' +
                ", omschrijving: " + omschrijving + '\'' +
                "capacity: " + capacity +
                ", speed:" + speed +
                ", owner: " + owner.getName();
    }
}
 