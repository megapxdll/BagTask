

public class Items {

    private String name;

    private int mass;

    private int cost;

    public Items(int mass, int cost, String name) {
        this.name = name;
        this.mass = mass;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
