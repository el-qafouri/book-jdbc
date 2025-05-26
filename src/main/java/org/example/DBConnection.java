package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/bookstore";
    private static final String username = "postgres";
    private static final String password = "0000";

    public static Connection getConn() throws SQLException {
//        Class.forName("org.postgresql.Driver");
//        System.out.println("connected...");
        return DriverManager.getConnection(url, username, password);
    }



}
