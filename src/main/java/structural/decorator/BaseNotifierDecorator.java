package structural.decorator;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Optional;

@Getter
@Setter
public class BaseNotifierDecorator implements INotifier{

    private INotifier notifier;
    private Map<String, Map<String, String>> databaseService;

    public BaseNotifierDecorator(INotifier notifier, Map<String,
            Map<String, String>> databaseService) {
        this.notifier = notifier;
        this.databaseService = databaseService;
    }

    @Override
    public void sendNotification(String user, String message) {
        Optional.ofNullable(getNotifier()).ifPresent( notif -> notif.sendNotification(user, message));
    }
}
