package com.company;

public class TxtFile implements SavePlace{
    private String path;
    public TxtFile (String path) {
        this.path = path;
    }

    @Override
    public void getPlace() {
        System.out.println("Данные сохранены в .txt файл!\n" + path);
    }
}
