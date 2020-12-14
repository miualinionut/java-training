package code._4_student_effort.occurrence;

import code._4_student_effort.phonebook.Phonebook;

public class Word {
    private String word;
    private int counter;

    public String getWord() { return word; }
    public int getCounter() { return counter; }

    protected Word(String word, int counter) {
        this.word    = word;
        this.counter = counter;
    }

    public void updateCounter() { this.counter++; }
}
