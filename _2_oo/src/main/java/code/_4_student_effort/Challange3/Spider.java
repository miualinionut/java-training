package code._4_student_effort.Challange3;

public class Spider extends Animal{
    public Spider()
    {
        super(8);
    }
    public void eat(Integer amount)
    {
        belly += 5 * amount; //belly fills up faster because it's smaller
    }
}
