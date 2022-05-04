package com.company;

//Client

public class Main {

    public static void main(String[] args) {
	    Item human = new Human();
        Item things = new Stuff();
        Visitor taxi = new TaxiVisitor();
        Visitor lorry = new Lorry();

        System.out.println("Человек и Такси\n-----------");
        human.accept(taxi);
        System.out.println("-----------");
        System.out.println("Вещи и Такси\n-----------");
        things.accept(taxi);
        System.out.println("-----------");

        System.out.println("Человек и Грузовик\n-----------");
        human.accept(lorry);
        System.out.println("-----------");
        System.out.println("Вещи и Грузовик\n-----------");
        things.accept(lorry);
        System.out.println("-----------");
    }
}
