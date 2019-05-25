package observable;

public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyChanged(Object obj);
}
