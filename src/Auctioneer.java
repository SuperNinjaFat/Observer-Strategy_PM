import java.util.ArrayList;

public class Auctioneer implements Subject {

	public ArrayList<Observer> observerList;
	public double initPrice;
	public double currPrice;
	public Item item = new Item(initPrice, null);
	public int AuctionCountdown = 10;
	
	public Auctioneer() {
		observerList = new ArrayList<>();
	}

    public void register(Observer O) {
        observerList.add(O);
    }

    public void remove(Observer O) {
        observerList.remove(O);
    }

    public void notifyObservers() {
        for(Observer ob : observerList) {
            ob.update(item);
        }
    }

    public void itemsChanged() {
        notifyObservers();
    }
    
	public void setItem(Item item) {
		if(currPrice >= initPrice) {
			initPrice = item.initPrice;
			currPrice = item.currPrice;
			itemsChanged();
		}
	}

}
