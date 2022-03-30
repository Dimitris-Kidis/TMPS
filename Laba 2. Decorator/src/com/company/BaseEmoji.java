package com.company;

// BASE DECORATOR

public class BaseEmoji implements Emoji{

    protected Emoji e;

    public BaseEmoji (Emoji emoji) {
        this.e = emoji;
    }

    @Override
    public void createStandard() {
        this.e.createStandard();
    }
}
