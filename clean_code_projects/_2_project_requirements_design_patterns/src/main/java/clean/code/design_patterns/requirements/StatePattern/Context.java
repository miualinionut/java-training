package clean.code.design_patterns.requirements.StatePattern;

//This class contains references to the current object state.
//This is used to define and access the state of the object.

public class Context {
    private CarEngineState state;

    public Context() {
        state= new Combustion();
    }

    public void setState(CarEngineState engineState){
        state=engineState;
    }

   public void engine(){
        state.engine(this);
    }
}
