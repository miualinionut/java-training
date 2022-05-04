package code._3_in_class.mammal;

public class Zookeeper {
    public static void main(String[] args) {
        new Zookeeper().go();
    }
    void go(){
        mammal m=new Zebra();
        System.out.println(m.name+m.makeNoise());
    }
}
