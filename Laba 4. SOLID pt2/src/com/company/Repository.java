package com.company;

public class Repository implements SavePlace{

    private String path;
    public Repository (String path) {
        this.path = path;
    }

    @Override
    public void getPlace() {
        System.out.println("Данные сохранены в репозитории!\n" + path);
    }
}
