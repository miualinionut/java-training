package clean.code.design_patterns.requirements.StatePattern;

public class Combustion implements CarEngineState{

    int consumption=5;
    String unit="L/100 km";

    @Override
    public void consumption(Context ctxt) {
        System.out.println("Consumption for the current engine is: "+ consumption+ " "+ unit);
    }

    @Override
    public void engine(Context ctxt) {
        System.out.println("Changed to combustion engine.");
    }


}
