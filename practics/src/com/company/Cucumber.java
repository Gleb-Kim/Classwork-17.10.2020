package com.company;

/**
 * Created by student1 on 17.10.20.
 */
public class Cucumber extends Vegetable{
    private int length;
    Cucumber(int procentOfWater, int length){
        super("Green", 'B', procentOfWater);
        this.length = length;
    }
    public void Mature() {
        super.Mature();
        System.out.println("By the way, I am the cucumber");
    }
}
