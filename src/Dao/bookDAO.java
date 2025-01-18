package Dao;


import Models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class bookDAO {

    private Connector c = new Connector();

    public bookDAO(){}

    public void addBook(Book book){
        String sql = "INSERT INTO book VALUES(?,?,?,?)";
        try(Connection con = c.connect(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, book.title);

        } catch (SQLException e){
            throw new RuntimeException("SQLException: " + e.getMessage());
        }
    }
}
