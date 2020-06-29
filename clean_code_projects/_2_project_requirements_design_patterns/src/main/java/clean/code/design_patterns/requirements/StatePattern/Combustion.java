package clean.code.design_patterns.requirements.StatePattern;

public class Combustion implements CarEngineState{

    @Override
    public void engine(Context ctxt) {
        System.out.println("Changed to combustion engine.");
    }
}
