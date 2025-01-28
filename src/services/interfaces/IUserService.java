package services.interfaces;

import models.User;

import java.util.ArrayList;

public interface IUserService {
    void addUser(User user);
    void removeUser(User user);
    void updateUser(User user);
    ArrayList<User> getUsers();
}

