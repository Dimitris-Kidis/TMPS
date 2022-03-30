package com.company;

public class Rectang implements Quality {

    @Override
    public HighQuality createHighQuality() {
        return new Factory.RectangHighQuality();
    }

    @Override
    public LowQuality createLowQuality() {
        return new Factory.RectangLowQuality();
    }
}

