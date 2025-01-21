package services.interfaces;

import models.Book;

import java.util.List;

public interface IBookService {
    void addBook(Book book);
    void removeBook(Book book);
    void updateBook(Book book);
    List<Book> getBooks();
    //Book getBookById(int id);
}
