package clean.code.design_patterns.requirements.StatePattern;

//this interface contains behaviour for the concrete states (combustion engine and electric motor)

public interface CarEngineState {
    void engine(Context ctxt);
}
