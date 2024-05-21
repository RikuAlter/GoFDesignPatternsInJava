package structural.decorator;

import java.util.Map;

public class WhatsappNotifierDecorator extends BaseNotifierDecorator{

    public WhatsappNotifierDecorator(INotifier notifier, Map<String, Map<String, String>> databaseService) {
        super(notifier, databaseService);
    }

    @Override
    public void sendNotification(String user, String message) {
        super.sendNotification(user, message);
        String whatsappContact = getDatabaseService().get(user).get("whatsapp");
        System.out.println("Sending whatsapp notification to: "+whatsappContact);
    }
}
