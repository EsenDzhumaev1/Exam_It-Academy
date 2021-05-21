package com.company;

public class Main {

    public static void main(String[] args) {
        Pepperoni p1 = new Pepperoni(300, 300, false);
        Margarita p2 = new Margarita(250, 300, true);
        LaFinta p3 = new LaFinta(350, 300, true);
        p1.cook();
        p2.cook();
        p3.cook();
        p1.deliver();
        p2.deliver();
        p3.deliver();
    }
}
