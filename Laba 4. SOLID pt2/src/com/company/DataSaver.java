package com.company;

public class DataSaver implements SavePlace{
    SavePlace path;

    public DataSaver (SavePlace path) {
        this.path = path;
    }

    @Override
    public void getPlace() {
        path.getPlace();
    }
}
