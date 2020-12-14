package code._4_student_effort.challenge1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class phonebook {

    public static void findPhoneNumbers(){
        List<String> personsMetadata = new ArrayList<>(list());
        HashMap<String, String> toBeMached = new HashMap<String, String>();
       for(int i=0;i<personsMetadata.size();i=i+2){
           toBeMached.put(personsMetadata.get(i),personsMetadata.get(i+1));
       }

        for (String s : toBeMached.keySet()) {
            if(s.equals("Abbey") || s.equals("Abdul")) {
                System.out.println(toBeMached.get(s));
            }
        }
    }

    public static List<String> list() {
        List<String> listReaded = new ArrayList<>();
        Scanner sc2 = null;
        try {
            sc2 = new Scanner(new File("E:\\programare\\cursGoogle\\java-training\\_4_exceptions_io\\names.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();

              //System.out.println(s);
                listReaded.add(s);
            }
        }
        return listReaded;
    }
}
