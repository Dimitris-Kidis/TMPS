package com.company;

// ADAPTER

public class Adapter extends App implements Database{
    @Override
    public void insert() {
        saveObj();
    }

    @Override
    public void update() {
        updateObj();
    }

    @Override
    public void select() {
        loadObj();
    }

    @Override
    public void remove() {
        deleteObj();
    }
}
