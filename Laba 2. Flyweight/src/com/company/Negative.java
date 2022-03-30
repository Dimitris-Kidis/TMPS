package com.company;

// FLYWEIGHT

class Negative implements Reaction
{
    private final String LOOKSFOR;
    private String tone;

    public Negative()
    {
        LOOKSFOR = "Get less people like this";
    }
    public void emotionalTone(String tone)
    {
        this.tone = tone;
    }
    public void lookingFor(String person)
    {
        System.out.println("Negative reaction. Person wants to " + tone + " " + person + ". " + LOOKSFOR);
    }
}