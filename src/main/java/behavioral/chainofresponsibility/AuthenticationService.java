package behavioral.chainofresponsibility;

public class AuthenticationService {

    private Handler handler;

    public AuthenticationService(){

        Database db = new Database();
        Handler handler = new UsernameHandler(db);
        handler.setNext(new PasswordHadnler(db)).setNext(new RoleHandler(db));
        this.handler = handler;

    }

    public void logIn(User user) {
        if(handler.handle(user)){
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed");
        }
    }
}
