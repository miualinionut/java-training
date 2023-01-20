package clean.code.design_patterns.requirements;

import java.util.Random;
import java.util.Scanner;

interface Transport{
    void planJourney();
}
class Bus implements Transport{
    @Override
    public void planJourney(){
        System.out.println("Journey planned on a bus.");

        Random busNumber=new Random();
        int chance= busNumber.nextInt(40);

    }
}
class Train implements Transport{
    @Override
    public void planJourney() {
        System.out.println("Journey planned on a train.");
    }
}
class Plane implements Transport{
    @Override
    public void planJourney(){
        System.out.println("Journey planned on a plane.");
    }
}
class Taxi implements Transport{
    @Override
    public void planJourney() {
        System.out.println("Journey planned on a taxi.");
    }
}
class Boat implements Transport{
    @Override
    public void planJourney() {
        System.out.println("Journey planned on a boat");
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