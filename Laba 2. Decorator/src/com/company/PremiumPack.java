package com.company;

// CONCRETE DECORATOR

public class PremiumPack extends BaseEmoji{
    public PremiumPack(Emoji emoji) {
        super(emoji);
    }

    public void createStandard () {
        System.out.println("Premium Pack has been activated!");
        super.createStandard();
    }
}
