package com.company;

import java.util.Arrays;

public class BuilderPattern {
    public static class Profile {
        String name;
        int age;
        String[] hobbies;
        String city;
        int height;
        String surname;

        public void print() {
            System.out.println("\n\tИмя: " + name +
                    "\n\tЛет: " + age +
                    "\n\tГород: " + city +
                    "\n\tРост: " + height +
                    "\n\tХобби: " + Arrays.toString(hobbies));
        }
        }
    }

class ProfileImpl implements ProfileBuilder {

    private BuilderPattern.Profile profile = new BuilderPattern.Profile();
    @Override
    public ProfileBuilder setName(String name) {
        profile.name = name;
        return this;
    }

    public BuilderPattern.Profile getProfile() {
        return profile;
    }

    @Override
    public ProfileBuilder setAge(int age) {
        profile.age = age;
        return this;
    }

    @Override
    public ProfileBuilder setHobbies(String[] hobbies) {
        profile.hobbies = hobbies;
        return this;
    }

    @Override
    public ProfileBuilder setCity(String city) {
        profile.city = city;
        return this;
    }

    @Override
    public ProfileBuilder setHeight(int height) {
        profile.height = height;
        return this;
    }

    @Override
    public ProfileBuilder setSurname(String surname) {
        profile.surname = surname;
        return this;
    }

    @Override
    public BuilderPattern.Profile create() {
        return profile;
    }
}
