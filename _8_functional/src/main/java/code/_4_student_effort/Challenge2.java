package code._4_student_effort;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class Challenge2 {

    @Test
    public void predicate_1(){
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> p2 = s -> !(p1.test(s));
        Predicate<String> p3 = s -> p1.negate().test(s);
        Predicate<String> p4 = p1.negate();

        Assert.assertFalse(p2.test(""));
        Assert.assertTrue(p2.test("Not empty"));
        Assert.assertFalse(p3.test(""));
        Assert.assertTrue(p3.test("Not empty"));
        Assert.assertFalse(p4.test(""));
        Assert.assertTrue(p4.test("Not empty"));
    }

    @Test
    public void predicate_2(){
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = s -> (p1.test(s) && p2.test(s));

        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Nu e empty nici null"));
    }

    @Test
    public void predicate_3(){
        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<String> p2 = s -> s.charAt(0) == 'J';
        Predicate<String> p3 = s -> (p1.test(s) ^ p2.test(s));

        Assert.assertTrue(p3.test("True"));
        Assert.assertTrue(p3.test("Julia"));
        Assert.assertFalse(p3.test("Java"));

        Assert.assertFalse(p2.test("faraJ"));
        Assert.assertFalse(p1.test("cinci"));

    }
}
