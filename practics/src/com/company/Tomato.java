package com.company;

/**
 * Created by student1 on 17.10.20.
 */
public class Tomato extends Vegetable {
    private int size;

    Tomato(int procentOfWater, int size){
        super("Red", 'C', procentOfWater);
        this.size = size;
    }
    public void Mature() {
        super.Mature();
        System.out.println("By the way, I am the tomato");
    }
}
