package com.company;
import com.company.BuilderPattern;

public interface ProfileBuilder {
    ProfileBuilder setName(String name);
    ProfileBuilder setAge(int age);
    ProfileBuilder setHobbies(String[] hobbies);
    ProfileBuilder setCity(String city);
    ProfileBuilder setHeight(int height);
    ProfileBuilder setSurname(String surname);
    BuilderPattern.Profile create();
}
