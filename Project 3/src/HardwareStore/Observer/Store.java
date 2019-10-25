package Observer;

public interface Store {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
