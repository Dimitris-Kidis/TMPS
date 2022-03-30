package com.company;

import java.util.Random;

// CLIENT
// https://www.geeksforgeeks.org/flyweight-design-pattern/

public class Main {
    private static String[] reactionType =
            {"Positive", "Negative"};
    private static String[] looksfor =
            {"Date", "Be friends", "Walk", "Drink Coffee"};
    private static String[] looksforNeg =
            {"Block", "Do Nothing with", "Send Away"};
    private static String[] people =
            {"Jonh", "Helga", "Selena", "Michael", "Robert", "Julia"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            Reaction p = ReactionFactory.getReaction(getRandReactionType());
            if ( p instanceof Positive ) {
                p.emotionalTone(getRandLooksFor());
            } else {
                p.emotionalTone(getRandLooksForNeg());
            }
            p.lookingFor(getRandPerson());
        }
    }
    public static String getRandReactionType()
    {
        Random r = new Random();
        int randInt = r.nextInt(reactionType.length);
        return reactionType[randInt];
    }
    public static String getRandLooksFor()
    {
        Random r = new Random();
        int randInt = r.nextInt(looksfor.length);
        return looksfor[randInt];
    }
    public static String getRandLooksForNeg()
    {
        Random r = new Random();
        int randInt = r.nextInt(looksforNeg.length);
        return looksforNeg[randInt];
    }
    public static String getRandPerson()
    {
        Random r = new Random();
        int randInt = r.nextInt(people.length);
        return people[randInt];
    }
}



















