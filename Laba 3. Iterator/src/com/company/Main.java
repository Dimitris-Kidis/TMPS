package com.company;

// Client

public class Main {

    public static void main(String[] args) {
        Backpack c = new Backpack();

        Iterator<String> it = c.getIterator();

        while(it.hasNext()) {
            String d = it.next();

            System.out.println(d);
        }

        //System.out.println(it.next());

    }

}
