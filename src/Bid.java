public class Bid implements Observer, BiddingInterface{
    Auctioneer auctioneer;
    Item bidItem;
    double bidAmount;

    public Bid(Auctioneer auctioneer, String itemName, String bidder, double bidAmount) {
        this.auctioneer = auctioneer;
        this.auctioneer.register(this);
        this.bidAmount = bidAmount;
        //this.bidItem.currPrice += bidAmount;
    }

    @Override
    public void update(Item item) {
        this.bidItem = item;
        display();
    }
    public void display() {
        if (bidItem.currPrice == 0) {
            System.out.println("Auction Begins!\n" + "Current Item: " + bidItem.itemName + "\nInitial Price: " + bidItem.initPrice + "\n");
        }
        else {
            System.out.println(bidItem.currBidder + " bids " + this.bidAmount + " on the " + bidItem.itemName + "!\nCurrent Price: " + bidItem.currPrice);
        }
    }
    public void BidBehavior() {

    }
    public void bid() {

    }
}
