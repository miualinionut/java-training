package code._4_student_effort;

import java.util.List;

public class ZigZag {

    public static class Node{
        int data;
        Node next;
    }

    static Node head = null;
    static int aux = 0;

    public static void ZigZagOrder(Node head){
        boolean ok = true;
        Node currentNode = head;
        while(currentNode != null && currentNode.next != null){
            if(ok){
                if(currentNode.data >currentNode.next.data){
                    aux = currentNode.data;
                    currentNode.data = currentNode.next.data;
                    currentNode.next.data = aux;
                }
            }else{
                if(currentNode.data < currentNode.next.data){
                    aux = currentNode.data;
                    currentNode.data = currentNode.next.data;
                    currentNode.next.data = aux;
                }
            }
            currentNode = currentNode.next;
            ok = !(ok);
        }
    }

    static void printZigZag(Node Node){
        while(Node != null){
            System.out.print(Node.data + " ");
            Node = Node.next;
        }
        System.out.println();
    }

    static void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public static void main(String args[]){

        push(4);
        push(3);
        push(7);
        push(8);
        push(6);
        push(2);
        push(1);
        ZigZagOrder(head);
        printZigZag(head);

        head = null;
        push(1);
        push(4);
        push(3);
        push(2);
        ZigZagOrder(head);
        printZigZag(head);

    }
}
