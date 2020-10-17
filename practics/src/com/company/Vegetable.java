package com.company;

/**
 * Created by student1 on 17.10.20.
 */
public class Vegetable {
    protected String color;
    protected char vitamin;
    protected int procentOfWater;

    Vegetable(){

    }

    Vegetable(String color, char vitamin, int procentOfWater){
        this.color = color;
        this.vitamin = vitamin;
        this.procentOfWater = procentOfWater;
    }

    public int getProcentOfWater() {
        return procentOfWater;
    }

    public void setProcentOfWater(int procentOfWater) {
        this.procentOfWater = procentOfWater;
    }

    public void Mature(){
        System.out.println("I am ready to be eaten");
    }
}
