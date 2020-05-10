package code._4_student_effort.Anagram;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Anagram {

    static String[] listaAnagrame = new String[0];
    static int nrAnagrame = 0;

    private static void permutations(String perm, String cuvant)
    {
        if (cuvant.length() == 0) {
            listaAnagrame = Arrays.copyOf(listaAnagrame,nrAnagrame+1);
            listaAnagrame[nrAnagrame++] = perm;
        }

        for (int i = 0; i < cuvant.length(); i++)
        {
            String newCandidate = perm + cuvant.charAt(i);

            String newRemaining = cuvant.substring(0, i) +
                    cuvant.substring(i + 1);

            permutations(newCandidate, newRemaining);
        }
    }

    public static String[] anagrameCorecte(String filename) throws IOException {
        String[] listaNoua = new String[listaAnagrame.length];
        int nrCuv = 0;

        File fisier = new File(filename);
        FileReader fr = new FileReader(fisier);
        BufferedReader br = new BufferedReader(fr);
        String currentLine;

        while((currentLine = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(currentLine," ,;.");
            while (st.hasMoreTokens()){
                String aux = st.nextToken();
                for(int i = 0; i < listaAnagrame.length; i++){
                    if(listaAnagrame[i].compareTo(aux) == 0){
                        listaNoua[nrCuv++] = listaAnagrame[i];
                    }
                }
            }
        }
        listaNoua = Arrays.copyOf(listaNoua, nrCuv);
        return listaNoua;
    }

//    private static void copy(String[] words, Writer writer) {
//        try {
//            for (int i = 0; i < words.length; i++) {
//                writer.write(words[i]);
//            }
//          //  writer.close();
//        }
//        catch(IOException e){
//                e.printStackTrace();
//            }
//    }

    public static void printInFile(String filename, String[] toWrite1) throws IOException{
        File fisier = new File(filename);
        FileWriter fout = new FileWriter(fisier);
        BufferedWriter bw = new BufferedWriter(fout);
       // copy(toWrite1,bw);

        for(int i = 0; i < toWrite1.length; i++){
            bw.write(toWrite1[i] + " ");
        }
        bw.close();
    }

    public static void main(String[] args)
    {
        String s = "listen";
        permutations("", s);

        String fis1 = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/in/big_list.txt";
        String fis2 = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/in/small_list.txt";
        String fisOUT = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/out/output.txt";
        try {
            String[] anagrameBigLista = anagrameCorecte(fis1);
            for(int i = 0; i < anagrameBigLista.length; i++)
                System.out.println(anagrameBigLista[i]);

            printInFile(fisOUT,anagrameBigLista);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String[] anagrameSmallList = anagrameCorecte(fis2);
            for(int i = 0; i < anagrameSmallList.length; i++)
                System.out.println(anagrameSmallList[i]);

            printInFile(fisOUT,anagrameSmallList);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
