package code._4_student_effort.hardChallenge1;

public class HardChallenge1Main {

    public static void main(String[] args) {

        DecorableTree christmasTree = new ChristmasTree();

        DecorableTree decoratedTree = christmasTree;
                decoratedTree=new Bulb(decoratedTree,3);
                decoratedTree=new Garland(decoratedTree,5);
                decoratedTree=new Candy(decoratedTree,7);

        christmasTree.display();
        decoratedTree.display();

    }


}
