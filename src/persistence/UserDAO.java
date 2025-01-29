package persistence;

import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try (Connection con = dbc.connect(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String document = rs.getString("document");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String username = rs.getString("username");
                String password = rs.getString("password");

                // Parsear las fechas desde cadenas de texto
                String registrationDateStr = rs.getString("registration_date");
                String expirationDateStr = rs.getString("expiration_date");

                LocalDate registrationDate = registrationDateStr != null ? LocalDate.parse(registrationDateStr, dateFormatter) : null;
                LocalDate expirationDate = expirationDateStr != null ? LocalDate.parse(expirationDateStr, dateFormatter) : null;

                int outstandingFines = rs.getInt("outstanding_fines");
                int role = rs.getInt("role");

                users.add(new User(document, name, email, phoneNumber, address, username, password, outstandingFines, role));
            }
        } catch (SQLException e) {
            System.out.println("FALLO AL OBTENER USUARIOS: " + e.getMessage());
        }
        return users;
    }



}
