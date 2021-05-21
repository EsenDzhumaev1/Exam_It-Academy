package com.company;

public class ArtDep extends Department{

    public ArtDep(Book[] books) {
        super(books);
    }

    @Override
    public String toString() {
        return String.format("Отдел художественной литературы, кол-во книг: %s", getBooksCount());
    }
}
