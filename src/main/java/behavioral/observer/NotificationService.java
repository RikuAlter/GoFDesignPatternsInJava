package behavioral.observer;

import java.util.*;

public class NotificationService {

    private Map<EventTypes, List<EventListener>> subscribers;

    public NotificationService() {
        this.subscribers = new HashMap<>();
        Arrays.stream(EventTypes.values()).forEach(event -> subscribers.put(event, new ArrayList<>()));
    }

    public void subscribe(EventTypes event, EventListener listener){
        subscribers.get(event).add(listener);
    }

    public void unsubscribe(EventTypes event, EventListener listener){
        subscribers.get(event).remove(listener);
    }

    public void notify(EventTypes event){
        subscribers.get(event).forEach(EventListener::sendComms);
    }
}
