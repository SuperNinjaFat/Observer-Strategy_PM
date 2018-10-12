
public class Item {

	public String itemName;
	public String currBidder;
	public String lastBidder;
	public double currPrice;
	public double initPrice;

	// Item Constructor
	public Item(double initPrice, String itemName) {
		this.initPrice = initPrice;
		this.itemName = itemName;
	}
}
