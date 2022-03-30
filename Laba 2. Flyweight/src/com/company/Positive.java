package com.company;

// FLYWEIGHT

class Positive implements Reaction
{
        private final String LOOKSFOR;
        private String tone;

        public Positive()
        {
                LOOKSFOR = "Get more people like this";
        }
        public void emotionalTone(String tone)
        {
            this.tone = tone;
        }
        public void lookingFor(String person)
        {
            System.out.println("Positive reaction. Person wants to " + tone + " with " + person + ". " + LOOKSFOR);
        }
}
