package behavioral.chainofresponsibility;

public interface Handler {

    public boolean handle(User user);
    public Handler setNext(Handler next);

}
