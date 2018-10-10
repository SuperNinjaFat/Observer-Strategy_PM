
public interface Subject {
    public void register(Observer O);
    public void remove(Observer O);
    public void notifyObservers();
}
