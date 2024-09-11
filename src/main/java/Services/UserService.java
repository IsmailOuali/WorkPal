package Services;

import Repository.UserRepository;
import models.User;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String email, String password) {
        User user = new User(username, email, password);
        userRepository.save(user);
        System.out.println("User created successfully.");
    }

    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
