import java.util.ArrayList;

public class Auctioneer implements Subject{
    public ArrayList<Observer> observerList;
    public ArrayList<Item> itemList;

    public Auctioneer() {
        observerList = new ArrayList<>();
        itemList = new ArrayList<>();
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
            ob.update(itemList);
        }
    }

    public void itemsChanged() {
        notifyObservers();
    }
    public void addItemList(Item itemAdd) {
        itemList.add(itemAdd);
    }

    public void setItemList(Bid bid){
        for(Item I: itemList) {
            if(I.itemName == bid.bidItem.itemName && I.currPrice >= bid.bidItem.currPrice) {
                I.currPrice += bid.bidAmount;
                itemsChanged();
            }

        }
    }

}
