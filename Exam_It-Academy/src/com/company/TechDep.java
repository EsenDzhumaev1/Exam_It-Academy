package com.company;

public class TechDep extends Department{

    private boolean isComputer;

    public TechDep(Book[] books, boolean isComputer) {
        super(books);
        this.isComputer = isComputer;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }

    private String getComp() {
        if (this.isComputer) return "есть";
        else return "нету";
    }

    @Override
    public void displayInfo(){
        displayAllBooks();
        System.out.println("Количество книг в отделе: " + getBooksCount());
        System.out.println("наличие компьютера: " + getComp());
    }

    @Override
    public String toString() {
        return String.format("Отдел технической литературы, кол-во книг: %s, наличие компьютера: %s", getBooksCount(), getComp());
    }
}
