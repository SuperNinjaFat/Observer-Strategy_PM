import java.util.ArrayList;

public class Auctioneer implements Subject{
    public ArrayList<Observer> observerList;
    public Item item;

    public Auctioneer() {
        observerList = new ArrayList<>();
        item = new Item(null, null);
    }

    @Override
    public void register(Observer O) {
        observerList.add(O);
    }

    @Override
    public void remove(Observer O) {
        observerList.remove(O);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : observerList) {
            ob.update(item);
        }
    }

    public void itemsChanged() {
        notifyObservers();
    }

    public void setItem(Item bid){
        if(bid.currPrice >= bid.initPrice) {
            itemsChanged();
        }
    }

}
