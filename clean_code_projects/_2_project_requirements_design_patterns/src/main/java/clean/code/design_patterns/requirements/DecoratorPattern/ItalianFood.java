package com.company;

public class ItalianFood extends Decorator{
    public ItalianFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+ " With Cannoli and Lasagna";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+70.50;
    }
}
