package model;

public class SingerGuitarst extends Singer{

    @Override
    public void sing() {
        System.out.println("GUITARIST SINGING AT "+ this.instrument.getInstrumentName());

    }
}
