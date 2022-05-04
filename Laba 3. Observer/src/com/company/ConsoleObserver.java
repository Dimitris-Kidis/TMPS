package com.company;

// Subjects

public class ConsoleObserver implements Observer{
    public void handleEvent(int temp, int pressure) {
        System.out.println("Погода изменилась. t = " + temp + "deg" + ", p = " + pressure + ".");
    }
}
