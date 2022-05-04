package com.company;

public class NoteModule200 extends NoteModule{
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.N200;
        int remind = money.getAmt()%Note.N200;

        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр номиналом " + Note.N200);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
