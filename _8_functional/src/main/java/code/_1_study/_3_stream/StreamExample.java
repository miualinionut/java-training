package code._1_study._3_stream;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {

    private void createStreamFromCollection() {
        List<Integer> famousNumbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Stream<Integer> numbersStream = famousNumbers.stream();

        Set<String> usefulConcepts = new HashSet<>(Arrays.asList("functions", "lazy", "immutability"));
        Stream<String> conceptsStream = usefulConcepts.stream();
    }

    private void createStreamFromArray() {
        Stream<Double> doubleStream = Arrays.stream(new Double[]{ 1.01, 1d, 0.99, 1.02, 1d, 0.99 });
    }

    private void createStreamFromString() {
        IntStream stream = "aibohphobia".chars(); // It returns IntStream!
    }

    private void createStreamFromValues() {
        LongStream longStream = LongStream.of(111_111_111L, 333_333_333L);
    }

    private void createStreamFromOtherStreams() {
        //From another streams
        Stream<BigInteger> concatedStream = Stream.concat(Stream.empty(), Stream.empty());

        // Use Stream.generate()
        Stream<User> userStream = Stream.generate(User::new);
        DoubleStream randomStream = DoubleStream.generate(Math::random);

        // Use Stream.iterate()
        IntStream oddNumbersStream = IntStream.iterate(1, x -> x + 2);

        //Use Stream.range() or Stream.rangeClosed(). Method rangeClosed() includes an upper bound.
        LongStream rangedStream = LongStream.rangeClosed(100_000, 1_000_000);
    }

}
