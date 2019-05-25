package observable.delegate;

import java.util.HashMap;
import java.util.Map;

public class EventHandler {
    private Map<Object, Event> events = new HashMap<>();

    public void addEvent(Object observer, String methodName, Object... params) {
        events.put(observer, new Event(observer, methodName, observer));
    }

    public void removeEvent(Object observer) {
        events.remove(observer);
    }

    public void notifyChanged() throws Exception {
        for (Event event : events.values()) {
            event.invoke();
        }
    }
}
