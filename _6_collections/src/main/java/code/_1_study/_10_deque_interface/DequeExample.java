package code._1_study._10_deque_interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

  public static void main(String[] args) {
    //implements both stacks(LIFO) and queues(FIFO)
    Deque<Integer> deque01 = new LinkedList<>();
    Deque<Integer> deque02 = new ArrayDeque<>(); //nulls are not allowed

    deque01.addFirst(1);
    deque01.getFirst();
    deque01.addLast(2);
    deque01.getLast();

    deque02.addFirst(1);
    deque02.getFirst();
    deque02.addLast(2);
    deque02.getLast();

  }
}
