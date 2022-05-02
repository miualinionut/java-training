package design2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID :" + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(2);
        System.out.println("PLayer 1: " + playerOneTiles);
        System.out.println(newInstance.getLetterList());
        Singleton secondInstance = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(secondInstance));
        LinkedList<String> playerTwoTiles = secondInstance.getTiles(3);
        System.out.println("PLayer 2: " + playerTwoTiles);



    }
}
