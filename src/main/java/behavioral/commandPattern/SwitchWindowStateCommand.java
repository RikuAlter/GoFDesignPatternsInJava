package behavioral.commandPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwitchWindowStateCommand implements Command{
    
    private Window window;

    public SwitchWindowStateCommand(Window window) {
        this.window = window;
    }

    @Override
    public void execute() {
        this.window.toggleWindow();
    }
}
