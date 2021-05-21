package com.company;

public class Circle {
    //Число Пи является константой
    private final static double PI = 3.14;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return (PI * Math.pow(this.radius, 2));
    }

    //Для проверки

    public int getRadius() {
        return radius;
    }
}
