package behavioral.observer;

public class MobileEventListener implements  EventListener {

    private String phoneNo;

    public MobileEventListener(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void sendComms() {
        System.out.println(phoneNo+" is being notified!");
    }
}
