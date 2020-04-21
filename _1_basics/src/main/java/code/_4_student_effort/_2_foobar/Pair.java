package code._4_student_effort._2_foobar;

public class Pair {
    private Integer Key;
    private String Value;

    public Pair(Integer K, String V){
        this.Key = K;
        this.Value = V;
    }

    public Integer get_Key(){
        return Key;
    }

    public String get_val(){
        return Value;
    }
}
