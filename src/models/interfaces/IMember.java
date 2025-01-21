package models.interfaces;

import java.util.Date;
import java.util.List;

public interface IMember {

    Date getRegistrationDate();
    void setRegistrationDate(Date registrationDate);

    Date getExpirationDate();
    void setExpirationDate(Date expirationDate);

    List<String> getBorrowedBooks();
    void setBorrowedBooks(List<String> borrowedBooks);

    double getOutstandingFines();
    void setOutstandingFines(double outstandingFines);
}

