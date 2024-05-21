package behavioral.chainofresponsibility;

public class UsernameHandler extends BaseHandler {

    public UsernameHandler(Database db){
        this.db = db;
    }

    @Override
    public boolean handle(User user) {
        if(getDb().isValidUser(user))
            return handleNext(user);
        else
            return false;
    }
}
