package code._4_student_effort.code_challenge_leaders;

public class LeaderList {
    private Node firstNode;

    private class Node {
        Integer value;
        Node next;
        boolean isLeader;

        public Node(Integer value) {
            this.value = value;
            this.next = null;
            this.isLeader = true;
        }
    }

    // Add element
    public void add(Integer valueToAdd) {
        if (null == firstNode) {
            firstNode = new Node(valueToAdd);
            return;
        }

        Node currentNode = firstNode;
        while (true) {
            // Check if the value is a leader
            if (currentNode.isLeader && currentNode.value < valueToAdd) {
                currentNode.isLeader = false;
            }

            if (currentNode.next == null) break;

            currentNode = currentNode.next;
        }

        currentNode.next = new Node(valueToAdd);

    }

    public void printLeaders() {
        Node currentNode = firstNode;
        System.out.print("[ ");
        while (currentNode != null) {
            if (currentNode.isLeader) {
                System.out.print(currentNode.value + " ");
            }
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
}
