package com.company;

public class Main {
    public static void main(String[] args) {
        Vegetable veg = new Vegetable("Green", 'A', 65);
        Tomato tom = new Tomato(60, 10);
        Potato pot = new Potato(50, 25);
        Cucumber cuc = new Cucumber(80, 30);
        System.out.println(tom.getProcentOfWater()); // выводит 60
        tom.setProcentOfWater(65);
        System.out.println(tom.getProcentOfWater()); // выводит 65
        pot.Mature();
    }
}

