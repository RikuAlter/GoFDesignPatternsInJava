package behavioral.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
    private State state;

    public String locked(){
        return "Phone is in locked state!";
    }

    public String off(){
        return "Phone is off!";
    }

    public String unlocked(){
        return "Phone is unlocked and ready to use!";
    }

    public String home(){
        return "Going to home screen!";
    }
}
