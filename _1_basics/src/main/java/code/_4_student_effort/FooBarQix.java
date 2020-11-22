package code._4_student_effort;

public class FooBarQix {
    public static void main(String args[]){
       // FBQ1();
        FBQ2();
    }

    public static void FBQ1(){
        String output;
        int i, iaux, aux;
        for(i = 0; i < 300; i++){
            output= "";
            if(i % 3 == 0){
                output = output + "Foo";
            }
            if(i % 5 == 0){
                output = output + "Bar";
            }
            if(i % 7 == 0){
                output = output + "Qix";
            }
            iaux = i;
            while(iaux > 0){
                aux = iaux % 10;
                if(aux == 3){
                    output = output + "Foo";
                }
                if(aux == 5){
                    output = output + "Bar";
                }
                if(aux == 7){
                    output = output + "Qix";
                }
                iaux = iaux / 10;
            }
            if(output.equals(""))
                System.out.println(i);
            else System.out.println(output);
        }
    }

    public static void FBQ2(){
        String output;
        int i, iaux, aux;
        for(i = 0; i < 300; i++){
            output= "";
            if(i % 3 == 0){
                output = output + "Foo";
            }
            if(i % 5 == 0){
                output = output + "Bar";
            }
            if(i % 7 == 0){
                output = output + "Qix";
            }
            iaux = i;
            while(iaux > 0){
                aux = iaux % 10;
                if(aux == 3){
                    output = output + "Foo";
                }
                if(aux == 5){
                    output = output + "Bar";
                }
                if(aux == 7){
                    output = output + "Qix";
                }
                if(aux == 0){
                    output = output + "*";
                }
                iaux = iaux / 10;
            }
            if(output.equals(""))
                System.out.println(i);
            else System.out.println(output);
        }
    }
}
