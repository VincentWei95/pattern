package observable;

import java.util.ArrayList;
import java.util.List;

public class BossObservable implements Observable {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChanged(Object obj) {
        for (Observer observer : observerList) {
            observer.update(obj);
        }
    }
}
