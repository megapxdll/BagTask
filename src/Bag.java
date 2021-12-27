public class Bag {
    private int maxMass = 6;
    private int maxCost;
    Items[] items;

    public int getMaxMass() {
        return maxMass;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }
}
