package code._3_in_class;

public class wordNumber {
    private String word; // String with a word
    private Integer number;

    /* Default constructor */
    public wordNumber(Integer number, String word) {
        this.word = word;
        this.number = number;
    }

    /* Get's */
    public Integer getNumber() { // Returns number (Out: number)
        return number;
    }

    public String getWord() { // Returns word (Out: word)
        return word;
    }
}
