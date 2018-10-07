public class TestBid {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        Bid bid = new Bid(auctioneer);

        Auctioneer.setItemList(new Item("Bag of Garbage", 20));
    }
}
