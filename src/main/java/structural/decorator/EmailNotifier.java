package structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class EmailNotifier implements INotifier{

    private Map<String, Map<String, String>> databaseService;

    @Override
    public void sendNotification(String user, String message) {
        String email = getDatabaseService().get(user).get("email");
        System.out.println("Sending email notification to: "+email);
    }
}
