package code._4_student_effort;

import java.io.*;
import java.util.*;

public class Occurrence {
    public static void main(String[] args) throws FileNotFoundException {
            String[] words = countWords();
            WordOccur[] wordOccurrenceArr = countOccurrences(words);

            Arrays.sort(wordOccurrenceArr);
            for (int i = 0; i < 10; i++){
                System.out.println(wordOccurrenceArr[i].occurrence + " " + wordOccurrenceArr[i].word);
            }

    }

    public static WordOccur existsInArr(WordOccur[] wordOccurrenceArr, String string){
        int i;
        WordOccur word;
        for(i = 0; i < wordOccurrenceArr.length; i++){
            word = wordOccurrenceArr[i];
            if (string.equals(word.getWord())) {
                return word;
            }
        }
        return null;
    }

    public static String[] countWords() throws  FileNotFoundException{
        String[] words = new String[0];
        File input = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\occurrenceInput.txt");
        Scanner fileScanner = new Scanner(input);
        while (fileScanner.hasNext()){
            words = Arrays.copyOf(words, words.length+1);
            words[words.length-1] = fileScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
        }
        return words;
    }

    public static WordOccur[] countOccurrences(String[] words){
        int i;
        WordOccur[] outputArr = new WordOccur[0];
        WordOccur currOccur;
        String currWord;
        for(i = 0; i < words.length; i++){
            currWord = words[i];
            currOccur = existsInArr(outputArr, currWord);
            if (currOccur == null){
                outputArr = Arrays.copyOf(outputArr, outputArr.length+1);
                outputArr[outputArr.length-1] = new WordOccur(currWord);
            }
            else{
                currOccur.incrementOccurrence();
            }

        }
        return outputArr;
    }

}


class WordOccur implements Comparable<WordOccur>{

    int occurrence;
    String word;


    public WordOccur(String word) {
        this.occurrence = 1;
        this.word = word;
    }

    void incrementOccurrence(){
        this.occurrence++;
    }

    public String getWord() {
        return word;
    }

    public int getOccurrence() {
        return occurrence;
    }

    @Override
    public int compareTo(WordOccur otherOccur){
        return otherOccur.getOccurrence() - this.occurrence;
    }


}
