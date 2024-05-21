package structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DatabaseService {
    private List<User> users;
}
