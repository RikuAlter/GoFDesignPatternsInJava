package behavioral.commandPattern;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room {
    private Light light;
    private Command command;

    public void executeCommand() {
        command.execute();
    }
}
