package behavioral.state;

public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        getPhone().setState(new OffState(getPhone()));
        return getPhone().off();
    }

    @Override
    public String onHome() {
        getPhone().setState(new ReadyState(getPhone()));
        return getPhone().unlocked();
    }
}
