package code._4_student_effort._1_two;

public class BoxingMatch {
    public Fighter numarul1;
    public Fighter numarul2;

        public BoxingMatch(Fighter numarul1,Fighter numarul2)
        {
            this.numarul1=numarul1;
            this.numarul2=numarul2;
        }

        public String fight(){
            while(numarul1.health>0 && numarul2.health>0)
            {
                numarul1.lupta(numarul2);
                numarul2.lupta(numarul1);
            }
            if(numarul1.health==0)
                return numarul2.name;
            else
                return numarul1.name;
            }
           public static void main (String[] args)
           {
               Fighter numarul1= new Fighter ("Mihai",5,  100);
               Fighter numarul2= new Fighter ("Andrei",5,100);
               BoxingMatch boxingMatch = new BoxingMatch(numarul1,numarul2);
               System.out.println("Castigatorul este " + boxingMatch.fight());
           }
}
