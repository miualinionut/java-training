package code._3_in_class;


public class Student{
    private int notaMatematica;
    private int notaInformatica;
    private int notaBiologie;
    private int notaOtionalLimbaJaponeza;
    private int notaOptionalEducatieFizica;

    public Student(int notaMatematica, int notaBiologie, int notaInformatica, int notaOptionalEducatieFizica, int notaOtionalLimbaJaponeza)
    {
        this.notaMatematica= notaMatematica;
        this.notaBiologie=notaBiologie;
        this.notaInformatica= notaInformatica;
        this.notaOptionalEducatieFizica= notaOptionalEducatieFizica;
        this.notaOtionalLimbaJaponeza= notaOtionalLimbaJaponeza;


    }




























/*import static java.util.Objects.isNull;

public class StudentSingleton {
    private int notaLaMatematica; //accesibil doar in interiorul clasei
    int v2; // DEFAULT: accesibil doar din interiorul clasei si a altor clase care se afla in acelasi pachet
    protected int v3; //accesibil doar din interiosul altor clase care se afla in acelasi pachet +
    public int v4; // accesibil de oriunde

    import java.util.Random;

    import static java.util.Objects.isNull;

    public class StudentSingleton {
        private int notaLaMatematica = new Random().nextInt(10);

        private static StudentSingleton instance = new StudentSingleton();
        private Singleton(){
        static StudentSingleton getInstance() { //are rol de constructor
            StudentSingleton instance;
            //if avem deja instance
            if (isNull(instance)) {
                instance = new StudentSingleton();
            }
            return instance;
        }

        @Override
        public boolean equals(Object o) {
            if(this==o) return true;
            if (o==null || getClass() != o.getClass() ) return false;
            StudentSingleton that = (StundentSingleton) o;
            return notaLaMatematica == that.notaLaMatematica;
            }

        }
    }


 */











    /*
    LAZY - lenes
    instanta, nu esre creata la pornirea aplicatiei , instanta va fi creata d-abia atunci cand se face primul apel pt a fi ulilizata

    !!! memoria aplicatiei va contine obiectul, doar in cazul in care este nevoie de el si este apelat

    EAGER - nerabdator
    instanta, este deja creata in mamorie (as soon as possible, fara interventia manuala a unui developer.utilizator)

    !!!mamoria aplicatiei va contine un obiect, chiar daca nu avem nevoie de el
     */



    /*
    public int getNotaLaMatematica(){
        return notaLaMatematica;
    }

    public void setNotaLaMatematica(int notaLaMatematica){
        if(notaLaMatematica>=1 && notaLaMatematica<=10) {
            this.notaLaMatematica = notaLaMatematica;
        }
        else {
            throw new IllegalArgumentException("nota trebuie sa fie intre 1 si 10");
        }
    }

     */
}
