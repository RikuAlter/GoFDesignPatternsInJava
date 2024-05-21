package behavioral.commandPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FloorLamp {
    private Light light;
    private Command command;

    public void executeCommand() {
        command.execute();
    }
}
