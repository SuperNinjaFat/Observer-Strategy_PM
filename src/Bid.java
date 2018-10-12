/**
 * Lab-03 Observer Pattern-Auction
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindberg@mymail.champlain.edu Class : CSI-340 Assignment: Lab 03
 * Observer Pattern-Action Date Assigned: October 4, 2018 Due Date: October 11, 2018
 * 
 * Description:
 * 
 * This code represents the Observer Pattern using strategy patterns and UML for an Auction House/
 **/

public class Bid implements Observer, BiddingInterface {

	Item item = new Item(0, null);
	private double bidAmount;
	int bidsLeft;

	public Bid() {
	}

	public Bid(Auctioneer auctioneer, String iName, String BidderName, BiddingInterface biddingInterface) {
		if (auctioneer.item.lastBidder == null || auctioneer.item.lastBidder != BidderName) {
			auctioneer.item.lastBidder = BidderName;
			auctioneer.item.currBidder = BidderName;

			// Accrues currPrice during bidding
			if (auctioneer.AuctionCountdown == 10) {
				auctioneer.currPrice += auctioneer.initPrice;
			}
			this.bidAmount = biddingInterface.BidBehavior();
			auctioneer.currPrice += this.bidAmount;
			auctioneer.item.currPrice = auctioneer.currPrice;

			auctioneer.item.itemName = iName;
			auctioneer.item.initPrice = auctioneer.initPrice;

			auctioneer.AuctionCountdown--;
			bidsLeft = auctioneer.AuctionCountdown;

			update(auctioneer.item);
		} else {
			System.out.println("Transaction Invalid! You just made a bid\n");
		}
	}

	@Override
	public void update(Item items) {
		this.item = items;
		display();
	}

	public void display() {
		if (item.currPrice == 0) {
			System.out.println("Auction Begins!\n" + "Current Item: " + item.itemName + "\nInitial Price: "
					+ item.initPrice + "\n" + "Bids Left: " + this.bidsLeft + "\n");
		} else {
			System.out.println(item.currBidder + " bids " + this.bidAmount + " on the " + item.itemName
					+ "!\nCurrent Price: " + item.currPrice + "\nBids Left: " + bidsLeft + "\n");
		}
		if (item.currPrice >= 100 || bidsLeft == 0) {
			System.out.println(item.currBidder + " wins " + item.itemName + " for " + item.currPrice + "!\n");
			System.exit(0);
		}
	}

	@Override
	public double BidBehavior() {
		return 0.0;
	}
}
