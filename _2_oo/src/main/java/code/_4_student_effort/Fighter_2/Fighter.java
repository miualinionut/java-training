package code._4_student_effort.Fighter_2;

interface I1 {
    default int doStuff() {
        return 1;
    }
}
interface I2 {
    default int doStuff() {
        return 2;
    }
}
public class MultiInt implements I1, I2 {
    public static void main(String[] args) {
        new MultiInt().go();
    }
    void go() {
        System.out.println(doStuff());
    }
    int doStuff() { // attempting to assign weaker access privileges; was public
        return 3;
    }
}