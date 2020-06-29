package clean.code.design_patterns.requirements.MediatorPattern;

public class ClutchPedal {
    private boolean isPressed;
    private Mediator mediator;

    public ClutchPedal(boolean isPressed) {
        this.isPressed = isPressed;

    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public void Press(){
       this.setPressed(true);
    }

    public void Release(){
        mediator.Release();

    }
}
