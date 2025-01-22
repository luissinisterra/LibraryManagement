/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;


import models.Book;
import persistence.BookDAO;

/**
 *
 * @author luis
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookDAO b = new BookDAO();
        Book book = new Book(
                2, // id
                "To Kill a Mockingbird", // title
                "Harper Lee", // author
                "Fiction", // genre
                1960, // publicationYear
                "J.B. Lippincott & Co.", // publisher
                "978-0-06-112008-4", // isbn
                "English", // language
                281, // pageCount
                "A novel about the moral growth of a young girl in the 1930s American South.", // description
                "available", // availability
                15 // price
        );
        b.addBook(book);
    }

}
