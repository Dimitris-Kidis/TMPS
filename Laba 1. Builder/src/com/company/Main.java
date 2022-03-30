package com.company;

public class Main {

    public static void main(String[] args) {


        // БИЛДЕР
        Director director = new Director();

        //longer profile version
        ProfileImpl profileTypeOne = new ProfileImpl();
        director.createProfileTypeOne(profileTypeOne);
        BuilderPattern.Profile profile = profileTypeOne.getProfile();

        //shorter profile version
        ProfileImpl profileTypeTwo = new ProfileImpl();
        director.createProfileTypeTwo(profileTypeTwo);

        System.out.println("\nСокращенная версия анкеты:");
        profile.print();

        System.out.println("\nПолная версия анкеты:");


    }
}
