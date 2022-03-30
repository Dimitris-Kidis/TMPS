package com.company;


import java.util.Scanner;

public class Main {


    //ФАБРИКА и СИНГЛТОН
    public static void main(String[] args) {

    System.out.println("Введите количество создаваемых объектов:");
    int peopleCounter = 0;
    Scanner scanner = new Scanner(System.in);
    peopleCounter = scanner.nextInt();

    /*
    Производит объекты мужчины и женщины разныех возрастов и профессий, возвращает массив
    peopleCounter - кол-во людей
    */
    Create start = new Create();
    FactoryPattern.Person[] Person = start.createPeople(peopleCounter);

    /*
    Находит пару, разница в возрасте которой не более 4 лет
    */
    FindCouple CoupleMatch = new FindCouple();
    CoupleMatch.find(Person);

    }

}
