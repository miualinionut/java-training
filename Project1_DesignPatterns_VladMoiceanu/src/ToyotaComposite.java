public class ToyotaComposite extends CarPlan {

    private String engine;
    private String body;
    private String wheels;

    public ToyotaComposite(String engine, String body, String wheels) {
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
    }

    @Override
    public void showCarDetails() {
        System.out.println(engine + " " + body + " " + wheels + " ");
    }
}
