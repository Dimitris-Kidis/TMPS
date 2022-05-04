package com.company;

public class NoteModule50 extends NoteModule{
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.N50;
        int remind = money.getAmt()%Note.N50;

        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр номиналом " + Note.N50);
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
