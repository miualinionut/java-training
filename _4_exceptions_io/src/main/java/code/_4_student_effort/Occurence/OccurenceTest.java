package code._4_student_effort.Occurence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class OccurenceTest {

    public static void occurence(String numefisier){

        try {
            //pentru a afla cate cuvinte sunt:
            FileReader fileReader = new FileReader(numefisier);
            BufferedReader br1 = new BufferedReader(fileReader);

            //pentru a citi toate cuvintele, dupa ce stim numarul lor:
            FileReader fileReader2 = new FileReader(numefisier);
            BufferedReader br2 = new BufferedReader(fileReader2);

            String currentLine;
            int nrCuvinte = 0;

            //numaram nr de cuvinte din fisier, ne trebuie pentru a aloca vectorul de cuvinte
            while((currentLine = br1.readLine())!= null) {
                StringTokenizer st = new StringTokenizer(currentLine," ,.();!-'");
                while(st.hasMoreTokens()){
                    nrCuvinte++;
                    st.nextElement();
                }
            }

            String[] words = new String[nrCuvinte];
            ArrayList<String> cuvinteUnice = new ArrayList<>();

            int i = 0;
            while((currentLine = br2.readLine())!= null){

                StringTokenizer st = new StringTokenizer(currentLine," ,.();!-'");
                while(st.hasMoreTokens()) {
                    words[i++] = st.nextElement().toString();
                }
            }

            int nrCuvUnice = 0;
            int[] nrAparitii = new int[nrCuvinte];
            for(i = 0; i<nrCuvinte; i++)
                nrAparitii[i] = 0;

            for(i = 0; i < words.length; i++) {
                if(cuvinteUnice.contains(words[i]) == false) {
                    cuvinteUnice.add(words[i]);
                    nrAparitii[nrCuvUnice++] ++;
                }
                else {
                    nrAparitii[cuvinteUnice.indexOf(words[i])] ++;
                }
            }

            for(int j = 0; j < nrCuvUnice; j++){
                System.out.println(cuvinteUnice.get(j) +" " + nrAparitii[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        String fis = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/in/a.txt";
        occurence(fis);

    }
}
