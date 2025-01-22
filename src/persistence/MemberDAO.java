package persistence;

import models.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    private DatabaseConnection dbc = new DatabaseConnection();

    public MemberDAO() {}

    public void addMember(Member member) {
        String sql = "INSERT INTO members (username, password, document, name, email, phone_number, address, registration_date, expiration_date, outstanding_fines)" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection con = this.dbc.connect();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, member.getUsername());
            ps.setString(2, member.getPassword());
            ps.setString(3, member.getDocument());
            ps.setString(4, member.getName());
            ps.setString(5, member.getEmail());
            ps.setString(6, member.getPhoneNumber());
            ps.setString(7, member.getAddress());
            ps.setDate(8, new java.sql.Date(member.getRegistrationDate().getTime()));
            ps.setDate(9, new java.sql.Date(member.getExpirationDate().getTime()));
            ps.setDouble(10, member.getOutstandingFines());

            ps.executeUpdate();
            System.out.println("Member added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException("SQLException: " + e.getMessage());
        }
    }

}
