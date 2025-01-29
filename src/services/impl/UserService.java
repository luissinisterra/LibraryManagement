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
        return this.userDAO.getUsers();
    }

    public User logIn(String username, String password) throws RuntimeException {

        User userLogIn = null;

        if(!this.usernameExists(username)){
            throw new RuntimeException("Username not exists");
        }

        if(this.getUserByUsername(username) != null){
            userLogIn = this.getUserByUsername(username);
        }

        if (!this.validatePassword(userLogIn, password)) {
            throw new RuntimeException("Password is wrong");
        }

        return userLogIn;
    }

    private boolean usernameExists(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private User getUserByUsername(String username) {
        for (User user : this.users) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    private boolean validatePassword(User user, String password) {
        if(user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
