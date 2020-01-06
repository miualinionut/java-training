import java.lang.reflect.Method;
import java.util.Scanner;

public class Metode {

    void menu(){
        System.out.println("1.Show all animals");
        System.out.println("2.Sort them by age");
        System.out.println("3.Show all methods that a specific animal has");

    }
    void sort(Zoo zoo){
        Zoo copie = zoo ;
        Animal aux ;
        for(int i= 0 ; i < zoo.list.length ; i++){
            for(int j= i+1 ; j < zoo.list.length ; j++){
                if(zoo.list[i].age >zoo.list[j].age ){
                    aux = zoo.list[i];
                    zoo.list[i] =zoo.list[j];
                    zoo.list[j] = aux ;
                }
            }
        }
            copie.describe();
    }

    void useMethod(Zoo zoo , Scanner scan) {
        int aux = 7;
        while (aux >= 6) {

        System.out.println("For what animal do you want to display methods: ");
        String aux1 = scan.nextLine();
        aux = Integer.valueOf(aux1);


    }
        aux--;

        Method[] publicMethods = zoo.list[aux].getClass().getMethods() ;
        System.out.println("Metodele sunt: ");                                      //FOLOSIM REFLECTION
        for(int i = 0 ; i < 5 ; i++)
            System.out.println(publicMethods[i]);




    }






















}
