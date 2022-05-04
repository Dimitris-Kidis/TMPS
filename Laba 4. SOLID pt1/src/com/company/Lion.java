package com.company;

public class Lion extends Animal implements Walks{
    public Lion(String name) {
        super(name);
    }

    @Override
    boolean isWater() {
        System.out.println("dwd");
        return false;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void walks() {
        System.out.println("Walks");
    }
}
