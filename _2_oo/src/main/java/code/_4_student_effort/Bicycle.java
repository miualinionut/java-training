package code._4_student_effort;

public class Bicycle {
    int speed = 0;
    int gear = 1;
    void changeGear(int newValue){
        this.gear = newValue;
    }

    void speedUp(int increment){
        this.speed += increment;
    }

    void applyBrakes(int decrement){
        this.speed -= decrement;
    }
}
