package com.company;

public class Director {
    public void createProfileTypeOne (ProfileBuilder builder) {
        builder.setName("Dmitrii");
        builder.setAge(21);
        builder.setCity("Chisinau");
        builder.setHeight(174);
        String[] hobbies = {"Chess", "Books"};
        builder.setHobbies(hobbies);
    }
    public void createProfileTypeTwo (ProfileBuilder builder) {
        builder.setName("Natalia");
        builder.setSurname("Pavlova");
        builder.setAge(32);
        builder.setHeight(168);
    }
}
