package com.company;


//CLIENT

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int moneyAmount;
        NoteModule note1000 = new NoteModule1000();
        NoteModule note500 = new NoteModule500();
        NoteModule note200 = new NoteModule200();
        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();
//        note1000.setNextMoneyModule(note500);
//        note500.setNextMoneyModule(note200);
//        note200.setNextMoneyModule(note100);
//        note100.setNextMoneyModule(note50);

        note1000.setNextMoneyModule(note200);
        note200.setNextMoneyModule(note100);
        note100.setNextMoneyModule(note50);

        while (true) {
            try {
                System.out.println("Введите сумму кратную 50:\n");
                System.out.println("(сумма денег должна быть не меньше 0 и не больше 100.000)\n");
                Scanner scanner = new Scanner(System.in);
                moneyAmount = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Сумма должна быть введена цифрами!\n");
                continue;
            }

            if ( moneyAmount % 50 != 0 ) {
                System.out.println("Сумма должна быть кратна пятидесяти!\n");
                continue;
            }
            break;
        }

        note1000.takeMoney(new Money(moneyAmount));
    }
}
