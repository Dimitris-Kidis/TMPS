package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Lion("Bob");
        System.out.println(animal);

        Register db = new AnimalRegister();
        db.saveAnimal(animal);


        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Rikki"));
        animals.add(new Snake("Meduza"));
        animals.add(new Cat("Jin"));
        animals.add(new Fish("Monica"));

        // Open-Closed Principle
        // Добавляя новое животное, не нужно изменять код.
        // Достаточно добавить класс и пройтись по массиву,
        // не спрашивая, какое это животное.

        // Liskov Principle
        // Необязательно вызывать метод .makeSound()
        // отдельно у каждого вида животных, это можно сделать,
        // обращаясь к классу Animal, а его подклассы выполнят
        // его реализацию вместо него.
        System.out.println("----------");
        for(Animal animal1: animals) {
            animal1.makeSound();
            System.out.println(animal1.toString());
        }


        Farm farm1 = new FarmClient(new CatFarm());
        farm1.getAnimal();
    }

}
