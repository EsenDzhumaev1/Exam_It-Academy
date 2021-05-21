package com.company;

public class Department {
    private Book[] books;

    public Department(Book[] books) {
        this.books = books;
    }

    public int getBooksCount(){
        return books.length;
    }

    public void addBook(Book book) {
        Book[] books = new Book[this.books.length + 1];
        System.arraycopy(this.books, 0, books, 0, this.books.length);
        books[this.books.length] = book;
        this.books = books;
    }

    public void displayAllBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }

    public void displayInfo() {
        displayAllBooks();
        System.out.println("Количество книг в отделе: " + getBooksCount());
    }

    public void searchAuthor(String author) {
        boolean tmp = true;
        for (Book book : this.books) {
            if (book != null && book.getAuthor().equals(author)) {
                System.out.println(book);
                tmp = false;
            }
        }
        if (tmp) System.out.println("автор не найден в данном разделе");
    }
}
