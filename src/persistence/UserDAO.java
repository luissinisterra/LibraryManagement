package persistence;

import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    private DatabaseConnection dbc = new DatabaseConnection();

    public UserDAO() {}

    public void adduser(User user) {
        String sql = "INSERT INTO users (document, username, password, name, email, phone_number, address, registration_date, expiration_date, outstanding_fines, role)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection con = this.dbc.connect();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user.getDocument());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getName());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPhoneNumber());
            ps.setString(7, user.getAddress());
            ps.setString(8, String.valueOf(user.getRegistrationDate()));
            ps.setString(9, String.valueOf(user.getExpirationDate()));
            ps.setDouble(10, user.getOutstandingFines());
            ps.setInt(11, user.getRole());

            ps.executeUpdate();
            System.out.println("user added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("SQLException: " + e.getMessage());
        }
    }

}
