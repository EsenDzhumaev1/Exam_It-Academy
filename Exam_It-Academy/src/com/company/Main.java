package com.company;

public class Main {

    public static void main(String[] args) {
        Book artBook = new Book("Tolstoy", "someName", 1867);
        Book legalBook = new Book("Grisham", "someName", 2016);
        Book techBook = new Book("McConnell", "someName", 1993);
        Book someBook = new Book("Tolstoy", "someName", 1860);

        Book[] artBooks = new Book[3];
        Book[] legalBooks = new Book[2];
        Book[] techBooks = new Book[]{techBook};

        artBooks[1] = artBook;
        legalBooks[0] = legalBook;

        ArtDep artDep = new ArtDep(artBooks);
        LegalDep legalDep = new LegalDep(legalBooks);
        TechDep techDep = new TechDep(techBooks, true);

        //Вывод toString()
        System.out.println(artDep);
        System.out.println(legalDep);
        System.out.println(techDep);

        //Вызов методов
        artDep.displayAllBooks();
        artDep.displayInfo();
        artDep.addBook(someBook);
        artDep.displayInfo();
        artDep.searchAuthor("Grisham");
        artDep.searchAuthor("Tolstoy");
    }
}
