package code._2_challenge._5_occurence;

public class WordOccurrence {
    private String word;
    private Integer occurrence;

    public WordOccurrence(String word) {
        this.word = word;
        this.occurrence = 1;
    }

    public String getWord() {
        return word;
    }

    public Integer getOccurrence() {
        return occurrence;
    }

    public void increaseOccurrence() {
        this.occurrence++;
    }
}
