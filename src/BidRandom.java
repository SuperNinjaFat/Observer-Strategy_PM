import java.util.Random;

public class BidRandom implements BiddingInterface {
	@Override
	public double BidBehavior() {
		Random rand = new Random();
		Double result = 10.0;
		result += (100.0 - 10.0) * rand.nextDouble();
		return (double) Math.round(result * 10d) / 10d;
	}
}
