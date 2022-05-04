package com.company;

// Concrete Visitor 1

public class TaxiVisitor implements Visitor{
    @Override
    public void visit(Stuff things) {
        System.out.println("Отказался от заказа, Такси подвозит только людей");
    }

    @Override
    public void visit(Human human) {
        System.out.println("Взял заказ, отвез клиента по адресу");
    }
}
