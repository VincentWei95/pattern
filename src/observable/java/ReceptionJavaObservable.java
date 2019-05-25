package observable.java;

import java.util.Observable;

public class ReceptionJavaObservable extends Observable {

    public void notifyChanged(Object arg) {
        setChanged();
        notifyObservers(arg);
    }
}
