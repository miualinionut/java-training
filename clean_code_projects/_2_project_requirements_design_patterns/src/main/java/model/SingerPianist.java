package model;

public class SingerPianist extends Singer{


    @Override
    public void sing() {
        System.out.println("PIANIST SINGING AT " + this.instrument.getInstrumentName());
    }
}
