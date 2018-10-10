
public class Bid implements Observer {

	Item item = new Item(0, null);
	private double bidAmount;
	int bidsLeft;
	
	public Bid() {
		
	}

	public Bid(Auctioneer auctioneer, String iName, String BidderName, double iPrice) {
		this.bidAmount = iPrice;
		this.bidsLeft = auctioneer.AuctionCountdown;

		// Accrues currPrice during bidding
		item.currBidder = BidderName;
		if(bidsLeft == 10)
			auctioneer.currPrice += auctioneer.initPrice;
		auctioneer.currPrice += iPrice;
		item.currPrice = auctioneer.currPrice;
		
		item.itemName = iName;
		item.initPrice = auctioneer.initPrice;

		auctioneer.AuctionCountdown -= 1;

		update(item);
	}

	@Override
	public void update(Item items) {
		this.item = items;
		display();
	}

	public void display() {
		if (item.currPrice == 0) {
			System.out.println("Auction Begins!\n" + "Current Item: " + item.itemName + "\nInitial Price: "
					+ item.initPrice + "\n" + "Bids Left: " + bidsLeft + "\n");
		} 
		else {
			System.out.println(item.currBidder + " bids " + this.bidAmount + " on the " + item.itemName
					+ "!\nCurrent Price: " + item.currPrice + "\nBids Left: " + bidsLeft + "\n");
		}
		if (item.currPrice >= 100) {
			System.out.println(item.currBidder + " wins " + item.itemName + " for " + item.currPrice + "!\n");
			System.exit(0);
		}
	}
}
