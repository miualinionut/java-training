package code._1_study._4_shadowing;

public class Shadowing {
    public int x = 0;

    public static void main(String[] args) {
        Shadowing shadowing = new Shadowing();
        Shadowing.FirstLevel firstLevel = shadowing.new FirstLevel();
        firstLevel.methodInFirstLevel(2);
    }

    class FirstLevel {
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Shadowing.this.x = " + Shadowing.this.x);
        }
    }
}
