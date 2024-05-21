package behavioral.commandPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Window {
    private int legth;
    private int breadth;
    private String location;
    private boolean open;

    public void toggleWindow(){
        open = !open;
    }
}
