package com.codeofDiane;

public class PC extends Computer{

    @Override
    public String company(){
        return "IMac";
    }

    @Override
    public float price() {
        return 1500.2f;
    }
}
