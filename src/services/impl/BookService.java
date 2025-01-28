package services.impl;

import models.Book;
import persistence.BookDAO;
import services.interfaces.IBookService;

import java.util.ArrayList;

public class BookService implements IBookService {

    private BookDAO bookDAO;
    private ArrayList<Book> books;

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
    public ArrayList<Book> getBooks() {
        //return this.bookDAO.getBooks();
        return books;
    }
}
