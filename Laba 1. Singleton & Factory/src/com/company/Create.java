package com.company;

public class Create {

    private int length;

    public FactoryPattern.Person[] createPeople (int length) {
            this.length = length;
            int toss;
            FactoryPattern.Person[] people = new FactoryPattern.Person[length];
            for( int i = 0; i < people.length; i++) {
                toss = (int)(Math.random() * 2);
                if ( toss == 0 ) {
                    people[i] = new FactoryPattern.Woman();
                } else {
                    people[i] = new FactoryPattern.Man();
                }
            }

            for( int i = 0; i < people.length; i++) {
                System.out.println("\nОбъект №"+(i+1));
                System.out.println(people[i].name);
                System.out.println(people[i].age);
                System.out.println(people[i].job);
            }
            return people;
        }
}
