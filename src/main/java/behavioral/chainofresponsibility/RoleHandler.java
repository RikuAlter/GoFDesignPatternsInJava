package behavioral.chainofresponsibility;

public class RoleHandler extends BaseHandler{
    public RoleHandler(Database db) {
        this.db = db;
    }

    @Override
    public boolean handle(User user) {
        if(getDb().findByUserName(user.getUserName()).map(u -> u.getRole().equals("admin")).orElse(false))
            System.out.println("Valid admin user!");
        else
            System.out.println("Loading base landing page!");
        return handleNext(user);
    }
}
