package com.company;

public class LaFinta extends Pizza{

    private boolean isMushrooms;

    public LaFinta(int value, int weight, boolean isMushrooms) {
        super(value, weight);
        this.isMushrooms = isMushrooms;
    }

    public boolean isMushrooms() {
        return isMushrooms;
    }

    public void setHot(boolean mushrooms) {
        this.isMushrooms = mushrooms;
    }

    private String getMushrooms() {
        if (this.isMushrooms) return "да";
        else return "нет";
    }

    @Override
    public String toString() {
        return String.format("Ла Финта, вес: %s, цена: %s, с грибами: %s",
                getWeight(), getValue(), getMushrooms());
    }
}
