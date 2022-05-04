package com.company;

public class Fish extends Animal implements Swims{
    public Fish(String name) {
        super(name);
    }

    @Override
    boolean isWater() {
        return true;
    }

    @Override
    void makeSound() {
        System.out.println("(...)");
    }

    @Override
    public void swims() {
        System.out.println("Swims");
    }
}
