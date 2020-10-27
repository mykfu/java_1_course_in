package ru.kpfu.classwork.Lesson_12;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int qty;

    public Book() {
        this("Unknown", new Author(), 0.0, 0);
    }

    public Book(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
//        return new Author(this.author.getName(), author.getEmail(), author.getGender());
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
