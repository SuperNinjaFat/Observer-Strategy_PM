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
