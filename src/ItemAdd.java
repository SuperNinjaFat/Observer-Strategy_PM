import java.util.ArrayList;

public class ItemAdd implements Observer{
    Auctioneer auctioneer;
    Item bidItem;
    public item;

    public ItemAdd(Auctioneer auctioneer, Item bid) {
        this.auctioneer = auctioneer;
        this.auctioneer.register(this);
        this.bidItem.currPrice = bid.initPrice;
        this.bidItem = bid;
    }

    @Override
    public void update(ArrayList<Item> itemList) {
        this.item = itemList;
        display();
    }
    public void display() {
        if (itemName == bidItem.itemName) {
            I.currPrice = bidItem.currPrice;
            System.out.println("Auction Begins!\n" + "Current Item: " + bidItem.itemName + "\nInitial Price: " + bidItem.initPrice + "\n");
        }
    }
}
