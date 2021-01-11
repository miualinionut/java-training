package code._4_student_effort.occurence;

public class Word implements Comparable<Word> {
    private String word;
    private int occurrence;

    public Word(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    public void addOccurrence() {
        this.occurrence++;
    }

    @Override
    public int compareTo (Word word) {
        return word.getOccurrence() - this.getOccurrence();
    }

    @Override
    public String toString() {
        return "{word: " + getWord() +
               ", occurrence: " + getOccurrence() + "}";
    }
}
