package structural.decorator;

import java.util.Map;

public class FacebookNotifierDecorator extends BaseNotifierDecorator{

    public FacebookNotifierDecorator(INotifier notifier, Map<String, Map<String, String>> databaseService) {
        super(notifier, databaseService);
    }

    @Override
    public void sendNotification(String user, String message) {
        super.sendNotification(user, message);
        String facebookContact = getDatabaseService().get(user).get("facebook");
        System.out.println("Sending facebook notification to: "+facebookContact);
    }
}
