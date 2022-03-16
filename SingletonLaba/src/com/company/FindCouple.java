package com.company;
import com.company.FactoryPattern.Person;

public class FindCouple {
    public void find (Person[] people) {
        for(int i = 0; i < people.length; i++) {
            for(int j = 0; j < people.length; j++) {
                if ( i != j ) {
                    if ( Math.abs(people[i].age - people[j].age) < 5 ) {
                        Singleton object = Singleton.getInstance("\n" + people[i].toString() + " and " + people[j].toString() + " is a MATCH!");
                        break;
                    }
                }
            }
        }
    }
}
