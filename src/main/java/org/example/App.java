package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection dbConnection = DBConnection.getConn();
        System.out.println("connected..." + dbConnection);
//        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
//        PreparedStatement st = dbConnection.prepareStatement(sql);
//        st.setString(1,"eli");
//        st.setString(2,"about eli");
//        st.setDouble(3,199.99);
//        st.execute();


        Book book = new Book("book1", "myAuthor", 455.2);
        BookDAO bookDAO = new BookDAO();
        bookDAO.insertBook(book);
        dbConnection.close();
    }
}
