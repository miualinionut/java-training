package code._3_in_class.example_static;

public class StaticExample {

    static final int altaVariabila=0; //keyword final -> odata ce o variabila a fost initializata, nu mai poate fi asignata inca o data
    static int iStatic=0;  //iStatic=variabila de clasa ; keyword static -> ne lasa posibilitatea sa schimbam valoarea unei variabile
    int iInstanta = 0;  //iInstanta=variabila de instanta

    public static void main(String[] args) {

        StaticExample instance01 = new StaticExample();
        StaticExample instance02 = new StaticExample();
        StaticExample instance03 = new StaticExample();

        final int jnumelung; //declaratie de variabila
        jnumelung=0; //pt un singur assigment, variabila nu apare subliniata

        int inumelung; //declaratie de variabila
        inumelung=0; //assignment lui numelung ii dau valoarea 0
        inumelung=1; //assignment lui numelung ii dau valoarea 1
        inumelung=2; //assignment lui numelung ii dau valoarea 2


        instance01.iStatic=1;
        instance02.iInstanta=2;
        instance03.iInstanta=3;

        System.out.println(" instance01.iStatic= "+instance01.iStatic+" instance01.Instanta= "+instance01.iInstanta); //iStatic=1 iInstanta=0
        System.out.println(" instance02.iStatic= "+instance02.iStatic+" instance02.Instanta= "+instance02.iInstanta); //iStatic=1 iInstanta=2
        System.out.println(" instance03.iStatic= "+instance03.iStatic+" instance03.Instanta= "+instance03.iInstanta); //iStatic=1 iInstanta=3
    }
    static void m(){
        System.out.println("static method");
    }
    void m2(){
        System.out.println("instance method");
    }
}
