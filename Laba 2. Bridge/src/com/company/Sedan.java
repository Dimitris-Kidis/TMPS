package com.company;

public class Sedan extends Car{
    public Sedan (Make m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}
