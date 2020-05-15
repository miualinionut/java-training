package code._4_student_effort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {
        // Generate all anagrams for word "listen"
        Set<String> listen = new HashSet<>();
        generateAnagrams("listen", 0, 5, listen);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("_4_exceptions_io/_test_files/out/student_output.txt")
            );
        } catch (IOException e) {
            System.out.println("File not found");
        }
        if (null != writer) {
            try {
                // Print them to file
                printToFile(listen, writer);
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while writing to file");
            }
        }
    }

    public static void printToFile(Set<String> list, BufferedWriter writer) throws IOException{
        for (String s : list) {
            writer.write(s + "\n");
        }
    }

    public static void generateAnagrams(String word, int l, int r, Set<String> permutations) {
        if (l == r) {
            permutations.add(word);
        }
        else {
            for (int i = l; i <= r; i++) {
                word = swap(word, l, i);
                generateAnagrams(word, l + 1, r, permutations);
                word = swap(word, l, i);
            }
        }
    }

    private static String swap(String word, int i, int j) {
        char aux;
        char[] charArray = word.toCharArray();
        aux = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = aux;
        return String.valueOf(charArray);
    }
}
