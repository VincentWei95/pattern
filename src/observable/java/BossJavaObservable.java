package observable.java;

import java.util.Observable;

public class BossJavaObservable extends Observable {

    public void notifyChanged(Object arg) {
        setChanged();
        notifyObservers(arg);
    }
}
