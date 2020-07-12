package code._4_student_effort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_ch {
    @Test
    public void consumer_1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }



    @Test
    public void consumer_2() {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = c1.andThen(c2);
        consumer.accept(list1);

        Assert.assertEquals(list1, list2);
    }
}
