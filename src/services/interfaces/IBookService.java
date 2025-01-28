package services.interfaces;

import models.Book;

import java.util.ArrayList;

public interface IBookService {
    void addBook(Book book);
    void removeBook(Book book);
    void updateBook(Book book);
    ArrayList<Book> getBooks();
    //Book getBookById(int id);
}
