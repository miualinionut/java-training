package code._4_student_effort.anagram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private URL small_url = new URL("https://gist.githubusercontent.com/calvinmetcalf/084ab003b295ee70c8fc/raw/314abfdc74b50f45f3dbbfa169892eff08f940f2/wordlist.txt");
    private URL big_url   = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt");

    private List<String> words  = new ArrayList<>();

    public Main() throws IOException {
        URL url = small_url;

        Scanner scanner = new Scanner(url.openStream());
        while(scanner.hasNext())
            words.add(scanner.next());

        printAnagrams();
    }

    private void printAnagrams() throws IOException {
        Random random = new Random();

        List<String> output = new Anagram(words.get(random.nextInt(words.size()))).getList();
        //output = new Anagram("listen").getList();

        File out = new File("output.txt");
        FileWriter writer = new FileWriter(out);

        for(int i = 0; i < output.size(); i++) {
            writer.write(output.get(i) + '\n');
        }

        writer.close();
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
