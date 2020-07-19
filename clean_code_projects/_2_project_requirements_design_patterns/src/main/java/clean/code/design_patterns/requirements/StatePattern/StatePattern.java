package clean.code.design_patterns.requirements.StatePattern;


//This pattern is used for objects with behaviour based on its state.
//In this case this pattern can be applied for a hybrid car computer to display its current running engine.


import java.util.Scanner;

public class StatePattern {
    public static void main(String[] args) {
        String word=" ";
        Scanner scan=new Scanner(System.in);
        Context context=new Context();
        boolean combustion=true;
        System.out.println("You are now using the combustion engine. Press ENTER to change engines. Input 'quit' if you want to exit the program");
        while(true){
            word=scan.nextLine();
            if(word.equals("quit")) break;
            if(combustion){
                context.setState(new Electric());
                combustion=false;
            }
            else {
                context.setState(new Combustion());
                combustion=true;
            }
            context.engine();
            context.showConsumption();
        }



    }
}
