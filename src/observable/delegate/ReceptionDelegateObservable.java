package observable.delegate;

public class ReceptionDelegateObservable extends Observable {

    @Override
    public void addEvent(Object observer, String methodName, Object... params) {
        eventHandler.addEvent(observer, methodName, params);
    }

    @Override
    public void removeEvent(Object observer) {
        eventHandler.removeEvent(observer);
    }

    @Override
    public void notifyChanged() {
        try {
            eventHandler.notifyChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
