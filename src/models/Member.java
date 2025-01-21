package models;

import java.util.Date;
import java.util.List;

public class Member extends Person{
    private String membershipId;
    private Date registrationDate;
    private Date expirationDate;
    private List<String> borrowedBooks;
    private double outstandingFines;

    public Member(String id, String name, String email, String phoneNumber, String address, String membershipId, Date registrationDate, Date expirationDate, List<String> borrowedBooks, double outstandingFines) {
        super(id, name, email, phoneNumber, address);
        this.membershipId = membershipId;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
        this.borrowedBooks = borrowedBooks;
        this.outstandingFines = outstandingFines;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
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
