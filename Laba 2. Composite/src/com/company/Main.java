package com.company;

public class Main {

    public static void main(String[] args) {
	    Ticket child1 = new Child();
	    Ticket child2 = new Child();
        Ticket adult = new Adult();
        Ticket child3 = new Child();
        Ticket student1 = new Student();
        Ticket student2 = new Student();
        Ticket student3 = new Student();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.addComponent(child1);
        composite1.addComponent(child2);
        composite1.addComponent(adult);

        composite2.addComponent(child3);
        composite2.addComponent(student1);
        composite2.addComponent(student2);
        composite2.addComponent(student3);

        composite3.addComponent(composite1);
        composite3.addComponent(composite2);

        composite3.sell();
    }
}
