package Repository;
import models.User;

import java.util.List;
import models.User;

public interface UserRepository {
    void save(User user);
    User findById(int id);
    List<User> findAll();
}

