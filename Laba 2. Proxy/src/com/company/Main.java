package com.company;

// CLIENT

public class Main {

    public static void main(String[] args) {
        AppDatabase project = new ProxyProject("https://database.com/appHello.db");

        project.run();
    }
}
