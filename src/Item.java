public class Item {
    public double initPrice;
    public String itemName;
    public double currPrice;
    public String currBidder;

    //addItem constructor
    public Item(double initPrice, String itemName) {
        this.initPrice = initPrice;
        this.itemName = itemName;
        this.currPrice = initPrice;
    }
    //Bid constructor
    public Item(String itemName, String currBidder) {
        this.itemName = itemName;
        this.currPrice = initPrice;
        this.currBidder = currBidder;
    }
}
