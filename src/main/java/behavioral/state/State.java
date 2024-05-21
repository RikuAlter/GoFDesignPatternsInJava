package behavioral.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class State {
    private Phone phone;

    protected State(Phone phone){
        this.phone = phone;
    }

    public abstract String onPower();
    public abstract String onHome();
}
