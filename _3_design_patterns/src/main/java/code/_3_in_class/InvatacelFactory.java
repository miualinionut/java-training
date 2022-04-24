package code._3_in_class;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class InvatacelFactory {

    public static Main.Invatacel make(){ //factory method
        if(LocalDate.now().getDayOfWeek() == DayOfWeek.WEDNESDAY){
            return new StudentSuperDestept();
        }else{
            return new Student();
        }
    }
}
