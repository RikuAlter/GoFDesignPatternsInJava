package behavioral.chainofresponsibility;

import lombok.Getter;

@Getter
public abstract class BaseHandler implements Handler{

    protected Database db;
    private Handler next;

    public boolean handleNext(User user) {
        if(next == null)
            return true;
        return next.handle(user);
    }

    @Override
    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }
}
