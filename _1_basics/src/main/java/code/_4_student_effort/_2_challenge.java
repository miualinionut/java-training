package code._4_student_effort;

public class _2_challenge {
    public static void compute() {


        for (int i = 1; i <= 100; i++) {
            StringBuilder a = new StringBuilder(" ");
            int ok2 = 1, ok1 = 1, aux = i;
            {
                if (i % 3 == 0)
                    a.insert(0, "Foo");
                else if (i % 5 == 0)
                    a.insert(0, "Bar");
                else if (i % 7 == 0)
                    a.insert(0, "Qix");
                else ok1 = 0;
            }

            while (aux != 0) {

                {
                    if (aux % 10 == 3)
                        a.insert(0, "Foo");
                    else if (i % 10 == 5)
                        a.insert(0, "Bar");
                    else if (i % 10 == 7)
                        a.insert(0, "Qix");
                    else ok2 = 0;
                    aux = aux / 10;
                }


            }
            if (ok1 == 0 && ok2 == 0) System.out.println(i);
            else System.out.println(a);

        }
    }

    public static void main(String[] args) {
        compute();
    }
}