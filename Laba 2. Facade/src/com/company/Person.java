package com.company;

// SUBCLASS 2

public class Person {
    public void activity(LooksForSomeone lookingFor) {
        if (lookingFor.isActiveStatus()) {
            System.out.println("Person's looking for someone...");
        } else {
            System.out.println("App is shutting down...");
        }
    }
}
