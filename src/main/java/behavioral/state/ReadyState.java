package behavioral.state;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onPower() {
        getPhone().setState(new OffState(getPhone()));
        return getPhone().off();
    }

    @Override
    public String onHome() {
        return getPhone().home();
    }
}
