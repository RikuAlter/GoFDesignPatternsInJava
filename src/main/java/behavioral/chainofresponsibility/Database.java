package behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {

    private List<User> users;

    public Database(){
        users = new ArrayList<>();
        users.add(new User("rahul", "1234", "admin"));
        users.add(new User("riku", "2345", "user"));
    }

    public Optional<User> findByUserName(String name) {
        return users.stream().filter(user -> user.getUserName().equals(name)).findFirst();
    }

    public boolean isValidUser(User user) {
        return findByUserName(user.getUserName()).isPresent();
    }

    public boolean isValidPassword(User user) {
        Optional<User> fetchedUser = findByUserName(user.getUserName());
        return fetchedUser.map(value -> value.getPassword().equals(user.getPassword())).orElse(false);
    }

}
