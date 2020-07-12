package code._3_in_class;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        /*Brad bradCumparatRecent = new BradLaGhiveci();
        bradCumparatRecent.afiseazaBrad();

        BradCuPodoabe bradCuPodoabe = new BradCuPodoabe(bradCumparatRecent);


   /*     Student student = Student.make("popescu");
        if (student instanceof VIPStudent) {
            ((VIPStudent) student).beaBauturiScumpe();
        }
        //int i = 5;
        //String s = String.valueOf(i);

        OfertaCraciu ofertaCraciu = OfertaCraciu.make("1");
        System.out.println("discout = "+ ofertaCraciu.getDiscount());*/

        //COMPOSITE - DESIGN PATTER
        Car daciaLogan = new Car(//cand fac obiectul folosesc detalii
                new CaroserieSedan(),
                new MotorBenzina(),
                new CutieVitezaManuala()
        );

        Car unaMisto = new Car(
                new CaroserieCabrio(),
                new MotorElectric(),
                new CutieVitezaAutomata()
        );

        MasinaDaciaLogan daciaLogan1 = new MasinaDaciaLogan();
        MasinaDaciaLoganFacelift daciaLoganFacelift = new MasinaDaciaLoganFacelift();
    }
}

class MasinaDaciaLogan{
    private CaroserieSedan body;
    private MotorMotorina engine;
    private CutieVitezaManuala gearbox;

}

class MasinaDaciaLoganFacelift extends MasinaDaciaLogan{

    private CutieVitezaAutomata gearbox;

}

interface Caroserie{}
interface Motor{}
interface CutieViteze{}

// o abstractizare ii corespunde N implementari concrete (detalii)
// un detaliu ii corespunde o abstractizare

//Dependecy inversion - respecta principiul IKEA
//


class Car{// declar clasa blueprint-ul folosind doar abstractizari si nu folosesc deloc detalii
    private Caroserie body;
    private Motor engine;
    private CutieViteze gearbox;

    Car(Caroserie body, Motor engine, CutieViteze gearbox) { //SOLID - D dependency inversion = details should depend on abstractions and not the other way around
        this.body = body;
        this.engine = engine;
        this.gearbox = gearbox;
    }
}

class CaroserieSuv implements Caroserie{}
class CaroserieDecapotabila implements Caroserie{}
class CaroserieCabrio implements Caroserie{}
class CaroserieSedan implements Caroserie{}

class MotorBenzina implements Motor{}
class MotorMotorina implements Motor{}
class MotorElectric implements Motor{}

class CutieVitezaManuala implements CutieViteze{}
class CutieVitezaAutomata implements CutieViteze{}

/*
//oferta Craciun daca valoarea cnp-ului clientului este 1 sau 2 ii dau oferta cu 5% reducere daca este diferita de 1 sau 2 ii dau oferta cu 5% + 2%, oferta pt OfertaCraciunPtClientiiNoi extinde
//oferta curenta
class OfertaCraciu{
    int getDiscount(){
        return 5;
    }

    public static OfertaCraciu make(String cnp){
        if(esteClientExistent(cnp))
        {
            return new OfertaCraciu();
        }else {
            return new OfertaCraciunPtClientiiNoi();

        }
    }

    private static boolean esteClientExistent(String cnp){

        if(cnp.equals("1") || cnp.equals("2")){
            return true;
        }else {
            return false;
        }
    }
}

class OfertaCraciunPtClientiiNoi extends OfertaCraciu{
    @Override
    int getDiscount(){
        return super.getDiscount() + 2;
    }
}


//student
class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public static Student make(String name) {//factory method; constructor virtual; constructor polimorfic;
        if (name.equals("ionescu")) {
            return new VIPStudent(name);
        } else {
            return new Student(name);
        }
    }

    public void manancaMerdenele() {
        System.out.println("mananca Merdenele");
    }
}

class VIPStudent extends Student {
    public VIPStudent(String name) {
        super(name);
    }

    @Override
    public void manancaMerdenele() {
        System.out.println("mananca Merdenele de la VIPURI");
    }

    public void beaBauturiScumpe() {
        System.out.println("bea Bauturi Scumpe");
    }
}*/

/*interface Brad{

    String[] crengiBrad = new String[]{
            "  *",
            " ***",
            "*****"
    };

    default void afiseazBrad(){
        for(String creguta : crengiBrad){

        }
    }

    void afiseazaBrad();
}

class BradLaGhiveci implements Brad{}
class BradAlb implements Brad{}
class Molid implements Brad{}



class BradCuPodoabe implements  Brad{
    private Brad brad;
    private BradCuPodoabe(Brad brad) {
        this.brad = brad;
    }

    void afiseazaBrad() {
        this.brad.afiseazaBrad();
    }
    
    public void afiseazaBradImpodobit(){
        for(String crenguta:  this.brad.crengiBrad){
            System.out.println("ceva");
        }
    }

}*/