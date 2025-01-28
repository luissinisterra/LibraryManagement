package controllers.interfaces;

import models.User;

import java.util.ArrayList;

public interface IUserController {
    void addUser(User user);
    void removeUser(User user);
    void updateUser(User user);
    ArrayList<User> geUsers();
}

