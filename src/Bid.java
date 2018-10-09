import java.util.ArrayList;

public class Bid implements Observer{
    Auctioneer auctioneer;
    Item bidItem;
    public ArrayList<Item> itemList;
    double bidAmount;

    public Bid(Auctioneer auctioneer, Item bid, double bidAmount) {
        this.auctioneer = auctioneer;
        this.auctioneer.register(this);
        this.bidAmount = bidAmount;
        this.bidItem = bid;
        this.bidItem.currPrice += bidAmount;
    }

    @Override
    public void update(ArrayList<Item> itemList) {
        this.itemList = itemList;
        display();
    }
    public void display() {
        for(Item I: itemList) {
            if (I.itemName == bidItem.itemName) {
                System.out.println(bidItem.currBidder + " bids " + this.bidAmount + " on the " + bidItem.itemName + "!\nCurrent Price: " + bidItem.currPrice);
                break;
            }
        }
    }
}