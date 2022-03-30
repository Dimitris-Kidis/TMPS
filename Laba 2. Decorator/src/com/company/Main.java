package com.company;

// CLIENT

public class Main {

    public static void main(String[] args) {
	    Emoji e1 = new BasicEmojiKit();
        e1.createStandard();
        Emoji e2 = new PremiumPack(e1);
        e2.createStandard();
    }
}
