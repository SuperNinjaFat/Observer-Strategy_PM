public class TestBid {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.setItem(new Item(10.00,"Bag of Garbage"));

        new Bid(auctioneer, "Bag of Garbage", "Calibrator", 30.00);
        new Bid(auctioneer, "Bag of Garbage", "Calibrator", 20.00);
        new Bid(auctioneer, "Bag of Garbage", "Trainee", 15.00);
        new Bid(auctioneer, "Bag of Garbage", "Trainee", 5.00);
        new Bid(auctioneer, "Bag of Garbage", "Calibrator", 10.00);
        new Bid(auctioneer, "Bag of Garbage", "Trainee", 10.00);
        new Bid(auctioneer, "Bag of Garbage", "Calibrator", 25.00);
        


    }
}
