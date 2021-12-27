

public class main {

    public static void main(String[] args) {

        Items[] items = new Items[] {new Items(3, 150, "banana"), new Items(1, 250000, "ring"),
                new Items(5, 500000, "notebook"), new Items(2, 10000, "powerbank"),
                new Items(3, 350000, "iphone")};

        Bag bag = new Bag();

        bag.setMaxCost(findBestRes(items, items.length-1, bag.getMaxMass()));
        System.out.println(bag.getMaxCost());
    }

    private static int findBestRes(Items[] items, int i, int mass) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getMass() > mass) {
            return findBestRes(items, i-1, mass);
        }
        else {
            return Math.max(findBestRes(items, i-1, mass), findBestRes(items, i-1, mass - items[i].getMass()) + items[i].getCost());
        }
    }
}
