package com.company;

public class Book {
    private static int idStatic;
    private final int id;
    private final String author;
    private final String name;
    private final int publishYear;

    public Book(String author, String name, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;
        idStatic++;
        id = idStatic;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author=" + author +
                ", name=" + name +
                ", publishYear=" + publishYear +
                '}';
    }
}
