package models;

import models.interfaces.IMember;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends Person implements IMember {
    private Date registrationDate;
    private Date expirationDate;
    private List<String> borrowedBooks;
    private double outstandingFines;

    public Member(String username, String password, String document, String name, String email, String phoneNumber, String address, Date registrationDate, Date expirationDate, List<String> borrowedBooks, double outstandingFines) {
        super(username, password, document, name, email, phoneNumber, address);
        this.registrationDate = new Date();
        this.expirationDate = new Date();
        this.borrowedBooks = new ArrayList<>();
        this.outstandingFines = 0;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public double getOutstandingFines() {
        return outstandingFines;
    }

    public void setOutstandingFines(double outstandingFines) {
        this.outstandingFines = outstandingFines;
    }
}
