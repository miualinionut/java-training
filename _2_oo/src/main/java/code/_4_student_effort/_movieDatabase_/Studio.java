package code._4_student_effort._movieDatabase_;

import code._4_student_effort._movieDatabase_.Film;

public class Studio {
    public final String nume;
    public Film[] filme;
    public Studio(String nume, Film[] filme){
        this.nume=nume;
        this.filme=filme;
    }
}
