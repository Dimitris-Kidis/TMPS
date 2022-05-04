package com.company;

public class Cat extends Animal implements Walks{

    public Cat(String name) {
        super(name);
    }

    @Override
    boolean isWater() {
        return false;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void walks() {
        System.out.println("Walks");
    }
}
