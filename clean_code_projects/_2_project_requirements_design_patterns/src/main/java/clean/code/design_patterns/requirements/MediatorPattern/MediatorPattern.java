package clean.code.design_patterns.requirements.MediatorPattern;


//This pattern reduces the complexity and the dependencies required between the bound classes. It makes code more reusable, as you can add components easier.
//In this case, the mediator class is the only reference in the others. It acts like an intermediary.

import java.util.Scanner;

//The code below acts like the shifting gears of a manual transmission car
public class MediatorPattern {

    public static void check(Car car, ShiftStick shiftStick, ClutchPedal clutchPedal){
        System.out.println("Clutch pedal pressed: "+clutchPedal.isPressed());
        System.out.println("Shift stick in neutral: "+shiftStick.isInNeutral());
        System.out.println("Car is moving: "+car.isMoving());
    }

    public static void main(String[] args) {

        String word=" ";
        boolean ok=true;
        Scanner scan=new Scanner(System.in);
        Car car=new Car(false);
        ShiftStick shiftStick=new ShiftStick(true);
        ClutchPedal clutchPedal=new ClutchPedal(false);
        Mediator mediator=new Mediator(clutchPedal,shiftStick,car);
        clutchPedal.setMediator(mediator);
        shiftStick.setMediator(mediator);

        System.out.println("You are in the car, which is not moving. The shift stick is in neutral and the clutch is unpressed.");
        System.out.println("You can press and release the clutch pedal (type press/release) and you can shift gears (type shift).");
        System.out.println("You can also show the changes applied to the pedal or the shift stick (type check).");
        System.out.println("You can exit at anytime by typing 'quit' ");

        System.out.println("press the clutch, shift in a gear, release the pedal and see if it is moving");
        System.out.println("if you do this again, it will be shifted in neutral and the car will stop");

        while(ok){
            word=scan.nextLine();
            switch (word){
                case "quit":
                    ok=false;
                    break;
                case "press":
                    clutchPedal.Press();
                    break;
                case "release":
                    clutchPedal.Release();
                    break;
                case "shift":
                    shiftStick.Shift();
                    break;
                case "check":
                    check(car,shiftStick,clutchPedal);
                    break;
            }
        }

    }
}
