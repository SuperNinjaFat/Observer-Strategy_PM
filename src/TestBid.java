public class TestBid {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        ItemAdd item = new ItemAdd(auctioneer, new Item(10,"Bag of Garbage"));
        auctioneer.addItemList(item.bidItem);

        Bid bid1 = new Bid(auctioneer, new Item("Bag of Garbage", "Calibrator"), 10);
        auctioneer.setItemList(bid1);

        Bid bid2 = new Bid(auctioneer, new Item("Bag of Garbage", "Trainee"), 15);
        auctioneer.setItemList(bid2);


    }
}
