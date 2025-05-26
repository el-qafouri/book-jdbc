package org.example;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String author, double price) {
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public Book(int id, String name, String author, double price) {
        this.id = id;
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
