package org.example;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

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


//        Book book = new Book("book1", "myAuthor", 455.2);
        BookDAO bookDAO = new BookDAO();
//        bookDAO.insertBook(book);

        List<Book> books = bookDAO.getAllBooks();
        for (Book b : books) {
            System.out.println(b);
        }


//        Book updatedBook = new Book(7, "name update", "author updated", 55.55);
//        bookDAO.updateBook(updatedBook);

        bookDAO.deleteBook(3);
        dbConnection.close();
    }
}
