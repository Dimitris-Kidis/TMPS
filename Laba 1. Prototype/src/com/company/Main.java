package com.company;

public class Main {

    public static void main(String[] args) {


        Chat chat = new PersonChat("03.10.2022", "Olga", "Inga", 13);

        System.out.println("Исходные данные переписки: \n");
        System.out.println(chat.toString());

        System.out.println("\n\nДанные после бек-апа: \n");
        chat.clone();
        System.out.println(chat.clone().toString());


    }
}
