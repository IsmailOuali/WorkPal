import Repository.UserRepository;
import Services.UserService;
import controllers.UserController;
import models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserController();
        UserService userService = new UserService(userRepository);


        userService.createUser("ismail", "ismail@ismail.com", "root");

        User user = userService.getUserById(1);
        if (user != null) {
            System.out.println("User retrieved: " + user.getUsername());
        } else {
            System.out.println("No user found with ID 1.");
        }

//        userService.getAllUsers().forEach(u -> System.out.println(u.getUsername()));
    }
}

