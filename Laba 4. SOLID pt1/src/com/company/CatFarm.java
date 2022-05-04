package com.company;

public class CatFarm implements Farm {
    @Override
    public void getAnimal() {
        System.out.println("Забрали кота");
    }
}
