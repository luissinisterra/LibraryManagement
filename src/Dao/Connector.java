package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private String URL = "jdbc:sqlite:src/Dao/database.db";

    public Connection connect(){
        Connection con = null;

        try{
            con = DriverManager.getConnection(URL);
        }catch(SQLException e){
            System.out.println("There's one error with the connection: " + e.getMessage());
        }
        return con;
    }
}
