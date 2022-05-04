package com.company;

// Concrete Visitor 2

public class Lorry implements Visitor{
    @Override
    public void visit(Stuff things) {
        System.out.println("Отвез вещи клиента по адресу");
    }

    @Override
    public void visit(Human human) {
        System.out.println("Грузовик не подходит для того, чтобы возить людей");
    }
}
