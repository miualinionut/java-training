package code._3_in_class;

import java.io.IOException;
import java.util.Scanner;

public class HelloWorldClass {
    public static void main(String[] args) {
        Integer i=1;
        m(i);
        m(1,2,3);
        m(1,2,3,4,5,6,7);

        sendTweet();
    }

        public static Thread m(int i){
        System.out.println("m1: " +i);
    }

    public static Object m(int i){
        System.out.println("m2: " +i);
    }

    public static void m(int i){
        System.out.println("m3: " +i);
    }

    public static void m(Integer...list) {
        for(Integer i:list) {
            System.out.println(i);
        }
    }

    public static void sendTweet(String s){}
    public static void sendTweet(URL link){}
    public static void sendTweet(byte[] image ){}

    public static void main(String[] args) throws IOException{
        System.out.println("inroduceti un numar intre 1 si 3");
        Scanner myImput = new Scanner(System.in);
        int animalNumber= myImput.nextInt();
        m(animalNumber);
    }
    interface AnimalCareMancane {
        @Override
        public String macane(){
            return "trulu trulu";
        }
    }

    class Rata implements AnimalCareMancane(){
        @Override
        public String macane(){
            return "trulu trulu";
        }
    }
    class Curca implements AnimalCareMancane(){
        @Override
        public String macane(){
            return "trulu trulu";
        }
    }
    class Gasca implements AnimalCareMancane(){
        @Override
        public String macane(){
            return "trulu trulu";
        }
    }

}