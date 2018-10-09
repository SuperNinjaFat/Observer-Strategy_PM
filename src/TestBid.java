public class TestBid {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.setItem(new Item(10,"Bag of Garbage"));

        Bid bid1 = new Bid(auctioneer, "Bag of Garbage", "Calibrator", 10);
        auctioneer.setItem(bid1);

        Bid bid2 = new Bid(auctioneer, "Bag of Garbage", "Trainee", 15);
        auctioneer.setItem(bid2);


    }
}
