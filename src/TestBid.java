public class TestBid {
	public static void main(String[] args) {
		Auctioneer auctioneer = new Auctioneer();
		auctioneer.setItem(new Item(10.00, "Bag of Garbage"));

		new Bid(auctioneer, "Bag of Garbage", "Calibrator", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new BidRandom());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid20());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new Bid10());
		new Bid(auctioneer, "Bag of Garbage", "Trainee", new BidRandom());

	}
}
