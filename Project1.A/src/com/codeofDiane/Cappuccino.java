package com.codeofDiane;

public class Cappuccino implements CoffeeFilter {
    @Override
    public void makeCappuccino(String name) {
        System.out.println("This is your Cappuccino:" + name);
    }

    @Override
    public void makeEspresso(String name) {}

    @Override
    public void makeLatte(String name) {}
}
