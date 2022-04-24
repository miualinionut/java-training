package code._3_in_class;

public class ClasaCareSaFieInstantiataDoar1Data {

    //1. facem constructor privat
    //2. Expun o metoda publica si statica pentru a prelua instanta - getInstance();
    //3. Creez o variabila statica si privata initializata cu o instanta la pornirea aplicatiei/incarcarea claselor in memorie

    private static ClasaCareSaFieInstantiataDoar1Data instanta = new ClasaCareSaFieInstantiataDoar1Data();

    private ClasaCareSaFieInstantiataDoar1Data(){
    }


    public static ClasaCareSaFieInstantiataDoar1Data getInstance() {
        return instanta;
    }
}

