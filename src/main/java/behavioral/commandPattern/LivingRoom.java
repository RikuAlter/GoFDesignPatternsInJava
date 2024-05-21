package behavioral.commandPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivingRoom extends Room{

    private Window window;
    private Light light;
    private FloorLamp floorLamp;
}
