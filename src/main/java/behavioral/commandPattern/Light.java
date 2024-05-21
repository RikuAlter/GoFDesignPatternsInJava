package behavioral.commandPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Light {
    private boolean switchedOn;

    public void switchLights(){
        this.switchedOn = !switchedOn;
    }
}
