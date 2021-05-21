package com.company;

public class Pizza {

    private int value;
    private int weight;
    private final int id;
    private static int idStatic;

    public Pizza(int value, int weight) {
        this.value = value;
        this.weight = weight;
        idStatic++;
        id = idStatic;
    }

    public void deliver() {
        System.out.println(toString());
    }

    public void cook() {
        System.out.println("готовится пицца №" + id);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
