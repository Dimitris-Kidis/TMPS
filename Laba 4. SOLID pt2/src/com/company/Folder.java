package com.company;

public class Folder implements SavePlace{

    private String path;
    public Folder (String path) {
        this.path = path;
    }

    @Override
    public void getPlace() {
        System.out.println("Данные сохранены в папке!\n" + path);
    }
}
