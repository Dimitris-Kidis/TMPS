package com.company;

public class PersonChat extends Chat {
    private int numberOfMessages;

    PersonChat(String date, String sender, String receiver, int numberOfMessages) {
        super(date, sender, receiver);
        this.numberOfMessages = numberOfMessages;
    }

    public PersonChat ( PersonChat chat) {
        super(chat);
        this.numberOfMessages = chat.numberOfMessages;
    }

    @Override
    public Chat clone() {
        return new PersonChat(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Number of messages: " + numberOfMessages + " }\t";
    }

}
