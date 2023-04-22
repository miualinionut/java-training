package code._4_student_effort.foo_bar_qix;

public class Main {
    public static void main(String[] args) {
        Foo_Bar_Qix test_obj = new Foo_Bar_Qix();
        String s;
//        for(int i = 1; i < 61; i++) {
//            s = test_obj.compute(i);
//            System.out.print(s + " ");
//        }
//        System.out.println();

        s = test_obj.compute2(101);
        System.out.println(test_obj.compute2(101));
        s = test_obj.compute2(303);
        System.out.println(s);
        s = test_obj.compute2(105);
        System.out.println(s);
        s = test_obj.compute2(10101);
        System.out.println(s);
    }
}
