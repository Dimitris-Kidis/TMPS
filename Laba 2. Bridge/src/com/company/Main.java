package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Hatchback(new Kia());
	    Car car2 = new Sedan(new Kia());
	    Car car3 = new Sedan(new Skoda());
	    Car car4 = new Hatchback(new Volkswagen());

        car1.showDetails();
        System.out.println("*************");
        car2.showDetails();
        System.out.println("*************");
        car3.showDetails();
        System.out.println("*************");
        car4.showDetails();
    }
}
