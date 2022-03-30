package com.company;

// CONCRETE COMPONENT

public class BasicEmojiKit implements Emoji{

    @Override
    public void createStandard() {
        System.out.println("Basic Emoji has been created!");
    }
}
