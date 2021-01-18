package code._4_student_effort;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class Producer {
    @Test
    public void predicate_1(){
        Predicate<String> p1 = s->s.isEmpty();
        Predicate<String> notPredicate =Predicate.not(p1);
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty!"));
    }

    @Test
    public void predicate_2(){
        Predicate<String> p1 = s->s!=null;
        Predicate<String> p2 = s->!s.isEmpty();
        Predicate<String> p3=p1.and(p2);
        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Not empty"));
    }

    @Test
    public void predicate_3(){
        Predicate<String> p1 = s->s.length() == 4;
        Predicate<String> p2 = s->s.startsWith("J");
        Predicate<String> p3=p1.and(p2.negate()).or(p1.negate().and(p2));
        Assert.assertTrue(p3.test("True"));
        Assert.assertTrue(p3.test("Julia"));
        Assert.assertFalse(p3.test("Java"));
    }
}
