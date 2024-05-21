package behavioral.state;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        getPhone().setState(new LockedState(getPhone()));
        return getPhone().locked();
    }

    @Override
    public String onHome() {
        getPhone().setState(new LockedState(getPhone()));
        return getPhone().locked();
    }
}
