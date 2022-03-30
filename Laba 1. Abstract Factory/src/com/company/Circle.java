package com.company;

public class Circle implements Quality {

    @Override
    public HighQuality createHighQuality() {
        return new Factory.CircleHighQuality();
    }

    @Override
    public LowQuality createLowQuality() {
        return new Factory.CircleLowQuality();
    }
}
