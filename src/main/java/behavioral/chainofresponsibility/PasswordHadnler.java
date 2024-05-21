package behavioral.chainofresponsibility;

public class PasswordHadnler extends BaseHandler{

    public PasswordHadnler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(User user) {
        if(getDb().isValidPassword(user))
            return handleNext(user);
        else
            return false;
    }
}
