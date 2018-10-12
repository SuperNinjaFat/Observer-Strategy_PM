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

public class TestBid {
	public static void main(String[] args) {
		Auctioneer auctioneer = new Auctioneer();
		auctioneer.setItem(new Item(10.00, "Bag of Garbage"));

		new Bid(auctioneer, "Bag of Garbage", "Calibrator", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new BidRandom());
		new Bid(auctioneer, "Bag of Garbage", "Calibrator", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Calibrator", new Bid20());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Calibrator", new BidRandom());

	}
}
