import java.util.ArrayList;

public class Bid implements Observer{
    Auctioneer auctioneer;
    public ArrayList<Item> itemList;

    public Bid(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
        this.auctioneer.register(this);
    }

    @Override

    public void update(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    public void bid(){

    }
}
