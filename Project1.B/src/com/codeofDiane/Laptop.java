package com.codeofDiane;

public class Laptop extends Computer{
    @Override
    public float price() {
        return 1200.0f;
    }

    @Override
    public String company(){
        return "Lenovo";
    }
}
