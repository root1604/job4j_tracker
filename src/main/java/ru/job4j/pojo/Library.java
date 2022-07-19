package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book book4 = new Book("Book4", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        book1.setName("Clean code");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name: " + books[i].getName() + " pages: " + books[i].getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Name: " + books[i].getName() + " pages: " + books[i].getPages());
        }
        for (int i = 0; i < books.length; i++) {
            if (Objects.equals(books[i].getName(), "Clean code")) {
                System.out.println("Name: " + books[i].getName() + " pages: " + books[i].getPages());
            }
        }
    }
}
