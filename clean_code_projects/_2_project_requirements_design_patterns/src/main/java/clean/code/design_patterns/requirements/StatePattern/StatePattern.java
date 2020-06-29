package clean.code.design_patterns.requirements.StatePattern;


//This pattern is used for objects ith behaviour based on its state.
//In this case this pattern can be applied for a hybrid car computer to display its current running engine.


public class StatePattern {
    public static void main(String[] args) {
        Context context=new Context();
        context.engine();
        context.setState(new Electric());
        context.engine();
    }
}
