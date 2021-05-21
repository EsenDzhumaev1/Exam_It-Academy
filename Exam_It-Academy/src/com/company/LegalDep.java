package com.company;

public class LegalDep extends Department{

    public LegalDep(Book[] books) {
        super(books);
    }

    @Override
    public String toString() {
        return String.format("Отдел юридической литературы, кол-во книг: %s", getBooksCount());
    }
}
