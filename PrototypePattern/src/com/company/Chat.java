package com.company;

public abstract class Chat {
    private String date;
    private String sender;
    private String receiver;

    public Chat ( String date, String sender, String receiver ) {
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Chat ( Chat chat ) {
        this.date = chat.date;
        this.sender = chat.sender;
        this.receiver = chat.receiver;
    }

    public abstract Chat clone();

    @Override
    public String toString() {
        return
                this.hashCode() + ": { Date: " + date +
                ", Sender: " + sender +
                ", Receiver: " + receiver;
    }
}
