package services.impl;

import models.User;
import persistence.UserDAO;
import services.interfaces.IUserService;

import java.util.ArrayList;

public class UserService implements IUserService {

    private UserDAO userDAO;
    private ArrayList<User> users;

    public UserService() {
        this.userDAO = new UserDAO();
        this.users = this.getUsers();
    }

    @Override
    public void addUser(User user) {
        this.userDAO.adduser(user);
    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public ArrayList<User> getUsers() {
        //return this.userDAO.getUsers();
        return this.users;
    }
}
