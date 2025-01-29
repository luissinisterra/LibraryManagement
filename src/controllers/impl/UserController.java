package controllers.impl;

import controllers.interfaces.IUserController;
import models.User;
import services.impl.UserService;

import java.util.ArrayList;

public class UserController implements IUserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    @Override
    public void addUser(User user) {
        this.userService.addUser(user);
    }

    @Override
    public void removeUser(User user) {
        this.userService.removeUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userService.updateUser(user);
    }

    @Override
    public ArrayList<User> geUsers() {
        return this.userService.getUsers();
    }

    public User logIn(String username, String password) throws RuntimeException {
        return this.userService.logIn(username, password);
    }
}
