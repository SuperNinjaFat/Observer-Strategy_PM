import java.util.ArrayList;

public class ItemAdd implements Observer{
    Auctioneer auctioneer;
    Item bidItem;
    public ArrayList<Item> itemList;

    public ItemAdd(Auctioneer auctioneer, Item bid) {
        this.auctioneer = auctioneer;
        this.auctioneer.register(this);
        this.bidItem = bid;
        this.bidItem.currPrice = bid.initPrice;
    }

    @Override
    public void update(ArrayList<Item> itemList) {
        this.itemList = itemList;
        display();
    }
    public void display() {
        for(Item I: itemList) {
            if (I.itemName == bidItem.itemName) {
                I.currPrice = bidItem.currPrice;
                System.out.println("Auction Begins!\n" + "Current Item: " + bidItem.itemName + "\nInitial Price: " + bidItem.initPrice + "\n");
                break;
            }
        }
    }
}
