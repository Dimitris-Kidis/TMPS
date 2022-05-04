package com.company;

// ComponentA

public class SimpleUser extends User{

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь " + getName() + " получает сообщение '" + message + "'");
    }

}
