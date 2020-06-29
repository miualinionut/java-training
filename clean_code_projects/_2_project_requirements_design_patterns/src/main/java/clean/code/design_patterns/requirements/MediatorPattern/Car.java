package clean.code.design_patterns.requirements.MediatorPattern;

public class Car {
    private boolean isMoving;

    public Car(boolean isMoving) {

        this.isMoving = isMoving;
    }


    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public void Move(){
        System.out.println("The car is moving");
        this.isMoving=true;
    }

    public void Stop(){
        System.out.println("The car stopped");
        this.isMoving=false;
    }
}
