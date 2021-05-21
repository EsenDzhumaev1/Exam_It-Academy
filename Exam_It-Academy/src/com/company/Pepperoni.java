package com.company;

public class Pepperoni extends Pizza{

    private boolean isHot;

    public Pepperoni(int value, int weight, boolean isHot) {
        super(value, weight);
        this.isHot = isHot;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    private String getHot() {
        if (this.isHot) return "да";
        else return "нет";
    }

    @Override
    public String toString() {
        return String.format("Пепперони, вес: %s, цена: %s, острый: %s",
                getWeight(), getValue(), getHot());
    }
}
