public class Car extends CarPlan {

    private String engine;
    private String body;
    private String wheels;

    @Override
    public void setCarEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setCarBody(String body) {
        this.body = body;
    }

    @Override
    public void setCarWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void showCarDetails(){

    };
}
