package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //В задании не было указано, какого размеа должен быть массив, пусть будет 10

        Circle[] circles = new Circle[10];
        int counter = 0;
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(random.nextInt(10) + 1);
            System.out.println(circles[i].getRadius() + " " + circles[i].area()); //Для проверки
            if (circles[i].area() % 3 == 0) counter++;
        }
        System.out.println("Количество площадей кругов кратных 3: " + counter);
    }
}
