package observable.delegate;

public abstract class Observable {
    protected EventHandler eventHandler = new EventHandler();

    /**
     * 添加被观察者
     */
    public abstract void addEvent(Object object, String methodName, Object... params);

    /**
     * 移除被观察者
     */
    public abstract void removeEvent(Object observer);

    /**
     * 消息通知
     */
    public abstract void notifyChanged();
}
