package com.company;

public class NoteModule1000 extends NoteModule{
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.N1000;
        int remind = money.getAmt()%Note.N1000;

        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр номиналом " + Note.N1000);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
