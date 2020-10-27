package ru.kpfu.classwork.Lesson_12;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author();
        System.out.println(author);
        author.setName("Petrov I.V.");
        System.out.println(author.getName());
        final Author author2 = new Author("Ivanov Ivan Ivanovich",
                                    "ivan@kpfu.ru",
                                    'm');
        System.out.println(author2);

        Book book = new Book("Book title", author2, 1999.99, 3);
        System.out.println(book);
        book.getAuthor().setName("Petrov");
        System.out.println(author2);
    }
}
