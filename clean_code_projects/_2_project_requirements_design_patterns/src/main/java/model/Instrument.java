package model;

public class Instrument {

    private String instrumentName;

    public Instrument(){

    }

    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }
}
