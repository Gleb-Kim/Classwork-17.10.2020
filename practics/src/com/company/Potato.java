package com.company;

/**
 * Created by student1 on 17.10.20.
 */
public class Potato extends Vegetable {
    private int procentOfStratch;
    Potato(int procentOfWater, int procentOfStratch){
        super("Yellow", 'C', procentOfWater);
        this.procentOfStratch = procentOfStratch;
    }
    public void Mature() {
        super.Mature();
        System.out.println("By the way, I am the potato");
    }
}
