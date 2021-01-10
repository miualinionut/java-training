package com.company;

public class Appetizer implements Food {

    @Override
    public String prepareFood(){
        return "Appetizer";
    }

    @Override
    public double foodPrice(){
        return 25.0;
    }
}
