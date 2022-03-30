package com.company;

// CLIENT

public class Main {
    public static void main(String[] args) {
	    Status status = new Status();
        status.doActive();
        
        LooksForSomeone lookingFor = new LooksForSomeone();
        lookingFor.startStatus();

        Person person = new Person();
        person.activity(lookingFor);

        lookingFor.finishStatus();
        person.activity(lookingFor);
    }
}
