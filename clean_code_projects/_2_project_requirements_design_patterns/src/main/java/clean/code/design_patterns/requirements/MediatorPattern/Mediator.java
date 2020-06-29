package clean.code.design_patterns.requirements.MediatorPattern;

public class Mediator {

    private ClutchPedal clutchPedal;
    private ShiftStick shiftStick;
    private Car car;

    public Mediator(ClutchPedal clutchPedal, ShiftStick shiftStick, Car car) {
        this.clutchPedal = clutchPedal;
        this.shiftStick = shiftStick;
        this.car= car;
    }

   void Move(){
        car.Move();
   }

   void Stop(){
        car.Stop();
   }

   void Release(){
        clutchPedal.setPressed(false);
        if(shiftStick.isInNeutral()) Stop();
        else Move();
   }

    void Shift(){
        if(clutchPedal.isPressed()){
            if(shiftStick.isInNeutral()) {
                shiftStick.setInNeutral(false);

            }
            else {
                shiftStick.setInNeutral(true);

            }
        }
        else {
            System.out.println("You can hear gear clashing sounds. Maybe you should press the clutch pedal.");
        }
    }

}
