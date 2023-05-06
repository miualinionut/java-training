package code._3_in_class.factory;

public class Main {
    public static void main(String[] args) {

        String  numePersoana01="Popescu";
        String  numePersoana02 ="Antonescu";

        System.out.println(pretCalatorieCuAutobuz(ObjectAdapter.isStudent(numePersoana01)));

    }
    public static String isStudent(String nume) {
        if(nume.startsWith("A")){
            return "true";
        }else{
            return "false";
        }
    }
    public static int pretCalatorieCuAutobuz(boolean isStudent){
        if(isStudent){
            return 0;
        }else{
            return 15;
        }
    }
}

class ObjectAdapter{

    public static boolean isStudent(String nume){

        return Boolean.valueOf(Main.isStudent(nume));
    }
}
