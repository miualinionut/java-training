package clean.code.design_patterns.requirements.StatePattern;

public class Electric implements CarEngineState{

    int consumption=15;
    String unit="KwH/100 km";

    @Override
    public void consumption(Context ctxt) {
        System.out.println("Consumption for the current engine is: "+ consumption+ " "+ unit);
    }

    @Override
    public void engine(Context ctxt) {
        System.out.println("Changed to electric motor.");

    }


}
