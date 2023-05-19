package clean.code.design_patterns.requirements.composition;

import java.util.LinkedList;
import java.util.Queue;

//kitchen class
public class Kitchen {

    private final Queue<Pizza> queue = new LinkedList<>();
    private static final int MAX_SIZE = 5; //the size of the queue

    public synchronized void add(Pizza pizza){
        //block a thread from adding a pizza if the queue has more than 5 elements
        while(queue.size() > MAX_SIZE)
            try{
                System.out.println("Blocked add");
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        //add the pizza and wake the next thread
        queue.add(pizza);
        notify();
    }


    public synchronized Pizza remove(){
        //if the queue is empty make the thread wait for an element to be added
        while (queue.isEmpty())
            try{
                System.out.println("Blocked remove");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //remove the pizza and notify the next thread
        notify();
        return queue.remove();
    }
}
