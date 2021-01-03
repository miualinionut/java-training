package code._4_student_effort;


public class Word implements Comparable<Word> {
    public String word;
    public Integer occurrence=1;
    public Word(String word){
        this.word = word;
    }

    public int compareTo(Word o){
        return this.occurrence.compareTo(o.occurrence);
    }
}





