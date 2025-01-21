package services.impl;

import models.Book;
import persistence.BookDAO;
import services.interfaces.IBookService;

import java.util.List;

public class BookService implements IBookService {

    private BookDAO bookDAO;
    private List<Book> books;

    public BookService() {
        bookDAO = new BookDAO();
        books = this.getBooks();
    }

    @Override
    public void addBook(Book book) {
        this.bookDAO.addBook(book);
    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public List<Book> getBooks() {
        //return this.bookDAO.getBooks();
        return books;
    }
}
