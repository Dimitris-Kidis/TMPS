package com.company;

public class Snake extends Animal implements Walks {

    public Snake(String name) {
        super(name);
    }

    @Override
    boolean isWater() {
        return false;
    }

    @Override
    public void makeSound() {
        System.out.println("Hiss!");
    }

    @Override
    public void walks() {
        System.out.println("Walks");
    }
}
