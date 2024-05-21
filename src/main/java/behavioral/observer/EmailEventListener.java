package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailEventListener implements EventListener{

    private String email;

    public EmailEventListener(String email){
        this.email = email;
    }

    @Override
    public void sendComms() {
        System.out.println(email+" is being notified!");
    }
}
