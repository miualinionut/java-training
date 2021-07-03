package com.codeofDiane;

public class Espresso implements CoffeeFilter{

    @Override
    public void makeEspresso(String name) {
        System.out.println("This is your espresso:" + name);
    }

    @Override
    public void makeCappuccino(String name) {}

    @Override
    public void makeLatte(String name) {}

    }

