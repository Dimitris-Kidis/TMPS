package com.company;

// Client

public class Main {

    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "CoolestAdmin");
        User u1 = new SimpleUser(chat, "Fiona");
        User u2 = new SimpleUser(chat, "Michael");
        User u3 = new SimpleUser(chat, "Jorja");
        User u4 = new SimpleUser(chat, "Will");

        u2.setEnable(true);
        u3.setEnable(true);
        u4.setEnable(false);

        chat.setAdmin(admin);

        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);
        chat.addUser(u4);

        admin.sendMessage("Хей йо");
    }
}
