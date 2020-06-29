package clean.code.design_patterns.requirements.StatePattern;

public class Electric implements CarEngineState{

    @Override
    public void engine(Context ctxt) {
        System.out.println("Changed to electric motor.");

    }
}
