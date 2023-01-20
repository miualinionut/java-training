package clean.code.design_patterns.requirements;

import java.util.Random;
import java.util.Scanner;

interface Transport{
    void planJourney();
}
class Bus implements Transport{
    @Override
    public void planJourney(){
        Random busNumber=new Random();
        int chance= busNumber.nextInt(40)+1;
        System.out.println("Journey planned on bus number "+chance+".");
    }
}
class Train implements Transport{
    @Override
    public void planJourney() {
        Random trainNumber=new Random();
        int chance= trainNumber.nextInt(1000)+1;
        System.out.println("Journey planned on train number "+chance+".");
    }
}
class Plane implements Transport{
    @Override
    public void planJourney(){
        System.out.println("Journey planned on a plane.");
        Random planeNumber=new Random();
        int chance= planeNumber.nextInt(100)+1;
        System.out.println("Seat number C"+chance+".");
    }
}
class Taxi implements Transport{
    @Override
    public void planJourney() {
        System.out.println("Journey planned on a taxi.");
        Random taxiNumber=new Random();
        int chance= taxiNumber.nextInt(99)+1;
        Random rnd = new Random();
        char c = (char) ('A' + rnd.nextInt(26));
        Random rnd1 = new Random();
        char c1 = (char) ('A' + rnd1.nextInt(26));
        Random rnd2 = new Random();
        char c2 = (char) ('A' + rnd2.nextInt(26));
        System.out.println("The taxi has the following license plate: NT "+chance+" "+c+c1+c2+".");
    }
}
class Boat implements Transport{
    @Override
    public void planJourney() {

        Random boatNumber=new Random();
        int chance= boatNumber.nextInt(100)+1;
        System.out.println("Journey planned on boat number "+chance+".");
    }
}
class TransportFactory{
    public static Transport getTransport(String type){
        if(type.equalsIgnoreCase("BUS")){
            return new Bus();
        } else if(type.equalsIgnoreCase("TRAIN")){
            return new Train();
        }else if(type.equalsIgnoreCase("PLANE")){
            return new Plane();
        } else if (type.equalsIgnoreCase("TAXI")) {
            return new Taxi();
        } else if (type.equalsIgnoreCase("BOAT")) {
            return new Boat();
        }
        return null;
    }
}

class Client{
    public static void main(String[] args){
        System.out.println("Choose type of ride: Bus, Train, Plane, Taxi or Boat.");
        Scanner myInput=new Scanner(System.in);
        String typeOfTransport=myInput.nextLine();
        Transport transport= TransportFactory.getTransport(typeOfTransport);
        if(transport!= null){
            transport.planJourney();

            Random random =new Random();
            int chance=random.nextInt(23-10)+10;
            Random random1=new Random();
            int chance1=random1.nextInt(59-10)+10;

            System.out.println("Be ready at "+chance+":"+chance1+"!");
        }else System.out.println("Invalid type of ride!");


    }
}