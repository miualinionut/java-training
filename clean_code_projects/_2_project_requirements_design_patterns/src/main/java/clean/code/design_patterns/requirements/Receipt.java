package clean.code.design_patterns.requirements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
    private static String date;

    Receipt(){
    }
    public static void getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss:z" );
        Date date = new Date();
        System.out.println("DATE          " +  formatter.format(date));
    }


}
