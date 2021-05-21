package com.company;

public class Margarita extends Pizza{

    private boolean isMeat;

    public Margarita(int value, int weight, boolean isMeat) {
        super(value, weight);
        this.isMeat = isMeat;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setHot(boolean meat) {
        this.isMeat = meat;
    }

    private String getMeat() {
        if (this.isMeat) return "да";
        else return "нет";
    }

    @Override
    public String toString() {
        return String.format("Маргарита, вес: %s, цена: %s, с мясом: %s",
                getWeight(), getValue(), getMeat());
    }
}
