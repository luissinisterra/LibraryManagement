package models;

import java.time.LocalDate;

public class User extends Person {
    private String username;
    private String password;
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    private int outstandingFines;
    private int role;

    public User(String document, String name, String email, String phoneNumber, String address, String username, String password, int outstandingFines, int role) {
        super(document, name, email, phoneNumber, address);
        this.username = username;
        this.password = password;
        this.registrationDate = LocalDate.now();
        this.expirationDate = null;
        this.outstandingFines = outstandingFines;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getOutstandingFines() {
        return outstandingFines;
    }

    public void setOutstandingFines(int outstandingFines) {
        this.outstandingFines = outstandingFines;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
