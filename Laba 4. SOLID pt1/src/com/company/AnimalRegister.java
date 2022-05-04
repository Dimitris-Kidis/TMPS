package com.company;

// Single Responsibility Principle
// Вместо того, чтобы поместить методы базы данных в основной
// класс Animal, я создал отдельный класс, отвечающий за
// методы получения, сохранения, удаления. Таким образом,
// каждый класс выполняет свою одну конкретную задачу.

public class AnimalRegister implements Register {
    public void getAnimal(Animal animal) {
        System.out.println("Your animal is " + animal);
    }

    @Override
    public void saveAnimal(Animal animal) {
        System.out.println("Animal has been saved to the DB\n" + "---------\n" + animal);
    }

    @Override
    public void deleteAnimal(Animal animal) {
        System.out.println("Animal has been deleted\n" + "---------\n" + animal);
    }

}
