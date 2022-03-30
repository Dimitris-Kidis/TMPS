package com.company;

import java.util.HashMap;

// FLYWEIGHT FACTORY

class ReactionFactory
{
    private static HashMap<String, Reaction> hm =
            new HashMap<String, Reaction>();
    public static Reaction getReaction(String type)
    {
        Reaction p = null;
        if (hm.containsKey(type))
            p = hm.get(type);
        else
        {
            switch(type)
            {
                case "Positive":
                    System.out.println("Положительная реакции создана");
                    p = new Positive();
                    break;
                case "Negative":
                    System.out.println("Отрицательная реакция создана");
                    p = new Negative();
                    break;
                default :
                    System.out.println("Ошибка!");
            }
            hm.put(type, p);
        }
        return p;
    }
}