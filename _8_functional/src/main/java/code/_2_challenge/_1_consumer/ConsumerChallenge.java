package code._2_challenge._1_consumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerChallenge {

    /**
     * Write a consumer that clears the list it consumes.
     */
    @Test
    public void consumer_1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    /**
     * Write a consumer that first consumes the list with the
     * consumer c1, and then consumers it with the second consumer
     * c2.
     */
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
