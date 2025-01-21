package persistence;

import models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    private DatabaseConnection dbc = new DatabaseConnection();

    public BookDAO() {}

    public void addBook(Book book) {
        String sql = "INSERT INTO books (title, author, genre, publication_year, publisher, isbn, language, page_count, description, availability, price) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = dbc.connect(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            ps.setInt(4, book.getPublicationYear());
            ps.setString(5, book.getPublisher());
            ps.setString(6, book.getIsbn());
            ps.setString(7, book.getLanguage());
            ps.setInt(8, book.getPageCount());
            ps.setString(9, book.getDescription());
            ps.setString(10, book.getAvailability());
            ps.setInt(11, book.getPrice());

            ps.executeUpdate();
            System.out.println("Book added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("SQLException: " + e.getMessage());
        }
    }
}

