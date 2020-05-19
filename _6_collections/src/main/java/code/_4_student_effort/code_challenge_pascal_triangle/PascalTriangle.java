package code._4_student_effort.code_challenge_pascal_triangle;

public class PascalTriangle {
    private Node head;
    private final int depth;

    private static class Node {
        int value;
        Node parentLeft;
        Node parentRight;
        Node childLeft;
        Node childRight;

        public Node(Node parentLeft, Node parentRight) {
            this.parentLeft = parentLeft;
            this.parentRight = parentRight;
            if (null == parentLeft || null == parentRight)
                this.value = 1;
            else
                this.value = parentLeft.value + parentRight.value;
        }
    }

    public PascalTriangle(int depth) {
        this.depth = depth;

        if (depth == 0) return;

        head = new Node(null, null);
        head.childLeft = new Node(null, head);
        head.childRight = new Node(head, null);

        Node currentNode;
        Node leftSide = head.childLeft;

        while (depth > 0) {

            currentNode = leftSide;

            while (true) {
                if (null == currentNode.parentLeft) {
                    currentNode.childLeft = new Node(null, currentNode);
                    currentNode.childRight = new Node(currentNode, currentNode.parentRight.childRight);
                    currentNode.parentRight.childRight.childLeft = currentNode.parentRight;
                    leftSide = currentNode.childLeft;
                    currentNode = currentNode.parentRight.childRight;
                }
                if (null != currentNode.parentLeft && null != currentNode.parentRight) {
                    currentNode.childRight = new Node(currentNode, currentNode.parentRight.childRight);
                    currentNode.parentRight.childRight.childLeft = currentNode.childRight;
                    currentNode = currentNode.parentRight.childRight;
                }
                if (null == currentNode.parentRight) {
                    currentNode.childRight = new Node(currentNode, null);
                    break;
                }
            }
            depth--;
        }
    }

    public void printTriangle() {
        if (null == head) {
            return;
        }

        StringBuilder spaces = new StringBuilder();
        spaces.append(" ".repeat(Math.max(0, this.depth * 2)));

        System.out.println(spaces.toString() + head.value);

        Node currentNode;
        Node leftSideNode = head.childLeft;

        int copyDepth = this.depth;
        while (copyDepth > 0 && null != leftSideNode) {

            currentNode = leftSideNode;

            spaces.replace(
                    0,
                    (spaces.toString().length() > 0) ?
                            1 :
                            0,
                    ""
            );

            System.out.print(spaces.toString());
            while (true) {
                System.out.print(currentNode.value + " ");

                if (null == currentNode.parentRight) {
                    if (null == leftSideNode.childLeft) {
                        leftSideNode = null;
                    } else {
                        leftSideNode = leftSideNode.childLeft;
                    }
                    break;
                }

                currentNode = currentNode.parentRight.childRight;
            }
            System.out.println();

            copyDepth--;
        }
    }
}
