
public class BidDecreasing implements BiddingInterface{

	int bidsLeft;
	
	public BidDecreasing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double BidBehavior() {
		// TODO Auto-generated method stub
		Auctioneer t = new Auctioneer();
		t.AuctionCountdown -= 1;
		return 0.0;
	}

}
