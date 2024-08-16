public abstract class Fighter extends Root {

    protected String location;
    protected String oneLiner = "I will win!";
    protected int powerLevel;
    private int points;

    public Fighter(int id, String name, int age, String location, String oneLiner, int powerLevel) {
        super(id, name);
        this.location = location;
        this.oneLiner = oneLiner;
        this.powerLevel = powerLevel;
    }

    public String getLocation() {
        return location;
    }

    public String getOneLiner() {
        return oneLiner;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "powerLevel=" + powerLevel +
                ", location='" + location + '\'' +
                ", oneLiner='" + oneLiner + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
