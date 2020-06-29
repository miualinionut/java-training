package code._4_student_effort._5_occurence;

public class NumberOfOcc {
    private String word;
    private Integer counter;

    public NumberOfOcc(String word, Integer counter) {
        this.word = word;
        this.counter = 1;
    }

    public Integer getCounter() {
        return counter;
    }

    public String getWord() {
        return word;
    }

    public void increaseNumber(){
        counter = counter + 1;
    }
}
