package clean.code.design_patterns.requirements.MediatorPattern;

public class ShiftStick {
    private boolean isInNeutral;
    private Mediator mediator;

    public ShiftStick(boolean isInNeutral) {
        this.isInNeutral = isInNeutral;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isInNeutral() {
        return isInNeutral;
    }

    public void setInNeutral(boolean inNeutral) {
        isInNeutral = inNeutral;
    }

    public void Shift(){
        mediator.Shift();
    }
}
