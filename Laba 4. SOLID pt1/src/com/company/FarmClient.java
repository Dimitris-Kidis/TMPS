package com.company;

public class FarmClient implements Farm{
    Farm client;

    public FarmClient(Farm client) {
        this.client = client;
    }

    @Override
    public void getAnimal() {
        this.client.getAnimal();
    }
}
