package clean.code.design_patterns.requirements;
import model.Instrument;
import model.Singer;
import model.SingerGuitarst;
import model.SingerPianist;

public class SingerFactory {
    private int numarSingeriCreati = 0;
    private static SingerFactory instantaUnica;

    private SingerFactory(){
        System.out.println("CONSTRUCTOR SINGER FACTORY!!!!");
    }

    public static SingerFactory getInstance(){

        if(instantaUnica == null){
            instantaUnica = new SingerFactory();
        }
        return instantaUnica;
    }

    public Singer createSinger(String instrument){
        this.numarSingeriCreati++;
        Singer result = null;
        if(instrument.equals("GUITAR")){
            result = new SingerGuitarst();
            Instrument instrumentObject = new Instrument(instrument);
            result.setInstrument(instrumentObject);
        }else if(instrument.equals("PIANO")){
            result = new SingerPianist();
            Instrument instrumentObject = new Instrument(instrument);
            result.setInstrument(instrumentObject);
        }
        return result;
    }

    public int getNumarSingeriCreati(){
        return this.numarSingeriCreati;
    }

}
