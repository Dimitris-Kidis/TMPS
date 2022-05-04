package com.company;

// Client

public class Main {

    public static void main(String[] args) {
        //Отформатировать прямоугольную картинку в высоком разрешении
        Quality factory1 = new Rectang();
        factory1.createHighQuality();
        //Отформатировать круглую картинку в высоком разрешении
        Quality factory2 = new Circle();
        factory2.createHighQuality();
        //Отформатировать прямоугольную картинку в низком разрешении
        Quality factory3 = new Rectang();
        factory3.createLowQuality();
        //Отформатировать круглую картинку в высоком разрешении
        Quality factory4 = new Circle();
        factory4.createLowQuality();
        //Отформатировать круглую картинку в низком разрешении в Ч/Б
        Quality factory5 = new Circle();
        factory5.createLowQuality().blackAndWhite();
    }
}
