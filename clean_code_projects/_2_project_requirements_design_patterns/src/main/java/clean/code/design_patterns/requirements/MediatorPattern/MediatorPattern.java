package clean.code.design_patterns.requirements.MediatorPattern;


//This pattern reduces the dependencies required between the bound classes.
//In this case, the mediator class is the only reference in the others. It acts like an intermediary.

//The code below acts like the shifting gears of a manual transmission car
public class MediatorPattern {
    public static void main(String[] args) {

        Car car=new Car(false);
        ShiftStick shiftStick=new ShiftStick(true);
        ClutchPedal clutchPedal=new ClutchPedal(false);
        Mediator mediator=new Mediator(clutchPedal,shiftStick,car);
        clutchPedal.setMediator(mediator);
        shiftStick.setMediator(mediator);

        //press the clutch, shift in a gear, release the pedal and see if it is moving.
        clutchPedal.Press();
        shiftStick.Shift();
        clutchPedal.Release();
        //if you do this again, it will be shifted in neutral and the car will stop

    }
}
