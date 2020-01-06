import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
//Am pornit de la ideea ca o sa folosesc compozitie si relfection , si le-am folosit , dar am folosit mai multe desing paternuri in afara de cele doua
public class MainApp {



    public static void main(String args[]){
            Animal a1 = new Penguin("Madagascar" , 12);
            LionKids lk = new LionKids(15);
            Animal a2 = new LionKing("Scar" , 17 , lk);
            Animal a3 = new Giraffe("Grula" , 45) ;
            Animal a4 = new Penguin("Louis" , 26);
            LionKids lk1 = new LionKids(4);
            Animal a5 = new LionKing("Torn" , 32 , lk1);

        Animal[] list = new Animal[]{a1, a2, a3, a4, a5};
        Zoo zoo = new Zoo(list);

       Metode obj = new Metode();
        obj.menu();
        System.out.println("Tap a number(command): ");
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt() ;
        scan.nextLine() ;

        if(nr== 1){
            zoo.describe();
        }
        else if(nr == 2){
            obj.sort(zoo);
        }
        else if(nr == 3){
            obj.useMethod(zoo ,scan);
        }
        scan.close();

    }
}
