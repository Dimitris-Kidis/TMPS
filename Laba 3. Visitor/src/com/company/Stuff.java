package com.company;

// Element B

public class Stuff implements Item {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
