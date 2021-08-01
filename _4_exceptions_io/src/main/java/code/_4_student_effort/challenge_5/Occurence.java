package code._4_student_effort.challenge_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Occurence {
    public static void main(String[] args) {

        try {
            String[] words = readFile("_4_exceptions_io\\_test_files\\in\\a.txt");
            HashMap<String, Integer> occurences = numberOfOccurences(words);
            occurences = sortByValue(occurences);

            Iterator hashIterator = occurences.entrySet().iterator();
            int counter = 0;
            while(hashIterator.hasNext() && counter < 10){
                Map.Entry item = (Map.Entry) hashIterator.next();
                counter++;
                System.out.println(item.getKey() + "--->" + item.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static String[] readFile(String path) throws FileNotFoundException {
        int counter = 0;
        Scanner s = null;
        String[] wordsTemp = new String[1500];

        try{
            s = new Scanner(new BufferedReader(new FileReader(path)));
            while (s.hasNext() && counter < 1500)
                wordsTemp[counter++] = s.next();

        }
        finally {
            if(s!=null) s.close();
        }
        String[] words = new String[counter];
        System.arraycopy(wordsTemp,0,words,0,counter);
        return words;
    }

    public static HashMap<String, Integer> numberOfOccurences(String[] message){
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();
        for(int i = 0; i < message.length; i++){
            if(occurences.containsKey(message[i]) == false)
                occurences.put(message[i], 1);
            else
                occurences.put(message[i], occurences.get(message[i]) + 1);
        }
        return occurences;
    }

}
