
public class BidDecreasing implements BiddingInterface{

	int bidsLeft;
	
	public BidDecreasing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BidBehavior() {
		// TODO Auto-generated method stub
		Auctioneer t = new Auctioneer();
		t.AuctionCountdown -= 1;
	}

}
