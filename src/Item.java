public class Item {
    public double initPrice;
    public String itemName;
    public double currPrice;

    public Item(double initPrice, String itemName, double currPrice) {
        this.initPrice = initPrice;
        this.itemName = itemName;
        this.currPrice = currPrice;
    }

    public Item(String itemName, double currPrice) {
        this.itemName = itemName;
        this.currPrice = currPrice;
    }
}
