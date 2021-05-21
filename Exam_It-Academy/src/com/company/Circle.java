package com.company;

public class Circle {
    //Число Пи является константой
    private final static double PI = 3.14159265;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    //Если возвращать double значение, то чисел кратных 3 почти не будет

    public int area() {
        return (int) (PI * Math.pow(this.radius, 2));
    }

    //Для проверки

    public int getRadius() {
        return radius;
    }
}
