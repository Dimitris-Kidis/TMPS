package com.company;

// SUBCLASS 1

public class LooksForSomeone {
    private boolean activeStatus;

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void startStatus() {
        System.out.println("Status is online");
        activeStatus = true;
    }

    public void finishStatus() {
        System.out.println("Status is offline");
        activeStatus = false;
    }
}
