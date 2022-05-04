package com.company;

public class FishFarm implements Farm {
    @Override
    public void getAnimal() {
        System.out.println("Забрали рыбу");
    }
}
