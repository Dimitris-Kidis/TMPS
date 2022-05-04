package com.company;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator

public class TextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {

        if ( admin instanceof Admin ) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Не хватает прав!");
        }
    }

    public void addUser ( User u ) {
        if ( admin == null ) {
            throw new RuntimeException("В чате нет админа!");
        }

        if ( u instanceof SimpleUser ) {
            users.add(u);
        }
        //*******
    }

    public void sendMessage(String message, User user) {
        if ( user instanceof Admin ) {
            for(User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }

        if ( user instanceof SimpleUser ) {
            for(User u : users) {
                if ( u != user && u.isEnable() ) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }

            if ( admin.isEnable() ) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
