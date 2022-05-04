package com.company;

import java.util.Random;

abstract class Animal implements AnimalInterface{

    String name;
    int childrenNumber;
    boolean isWater;
    int age;
    double foodIntake;

    public Animal(String name) {
        this.name = name;
        this.age = (int)(1 + Math.random() * 10);
        this.childrenNumber = (int)(3 + Math.random() * 17);
        //this.isWater = new Random().nextBoolean();
        this.foodIntake = Math.round((double) (1 + (Math.random() * 4)) * 100.0) / 100.0;
    }

    public String toString() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nChildren Number: " + childrenNumber +
                "\nSwims: " + isWater +
                "\nEats: " + foodIntake + " kg";
    }

    @Override
    public int getChildrenNumber() {
        return childrenNumber;
    }

    abstract boolean isWater();

    @Override
    public double getFoodIntake() {
        return foodIntake;
    }

    @Override
    public int getAge() {
        return age;
    }

    abstract void makeSound();
}
