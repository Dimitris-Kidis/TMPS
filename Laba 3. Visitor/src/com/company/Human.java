package com.company;

// Element A

public class Human implements Item {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
