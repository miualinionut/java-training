package code._3_in_class;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("paper");
        pq.add("envelop");
        pq.add("pencil");

        System.out.println(pq.peek()+","+pq.poll());
    }
}
