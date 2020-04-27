package code._3_in_class;

import javax.xml.crypto.Data;

public class Bicycle {



    int speed = 0;
    int gear = 1;

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBreakes(int decrement){
        speed = speed - decrement;
    }

}
