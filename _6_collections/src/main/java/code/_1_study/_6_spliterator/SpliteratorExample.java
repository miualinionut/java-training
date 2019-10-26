package code._1_study._6_spliterator;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorExample {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Spliterator<Integer> split1 = numbers.spliterator();
    System.out.println("split1.size = " + split1.getExactSizeIfKnown()); //10

    Spliterator<Integer> split2 = split1.trySplit();
    System.out.println("split1.size = " + split1.getExactSizeIfKnown()); //5
    System.out.println("split2.size = " + split2.getExactSizeIfKnown()); //5

    split2.forEachRemaining(new RemainingConsumer()); //1-5
    split1.forEachRemaining(new RemainingConsumer()); //5-10

  }

  static class RemainingConsumer<Integer> implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
      System.out.println(integer);
    }
  }
}
