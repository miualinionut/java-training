package com.codeofDiane;

public class Latte implements CoffeeFilter{
    @Override
    public void makeLatte(String name) {
        System.out.println("This is your Latte:" + name);
    }

    @Override
    public void makeEspresso(String name) {}

    @Override
    public void makeCappuccino(String name) {}
}
