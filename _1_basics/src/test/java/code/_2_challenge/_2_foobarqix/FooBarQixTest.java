package code._2_challenge._2_foobarqix;

import org.junit.Assert;

import java.util.Map;

import static java.util.Map.entry;

public class FooBarQixTest {
  public static Map<Integer, String> stage1 = Map.ofEntries(
          entry(1, "1"),
          entry(2, "2"),
          entry(3, "FooFoo"),
          entry(4, "4"),
          entry(5, "BarBar"),
          entry(6, "Foo"),
          entry(7, "QixQix"),
          entry(8, "8"),
          entry(9, "Foo"),
          entry(10, "Bar"),
          entry(13, "Foo"),
          entry(15, "FooBarBar"),
          entry(21, "FooQix"),
          entry(33, "FooFooFoo"),
          entry(51, "FooBar"),
          entry(53, "BarFoo")
  );

  public static Map<Integer, String> stage2 = Map.ofEntries(
          entry(101, "1*1"),
          entry(303, "FooFoo*Foo"),
          entry(105, "FooBarQix*Bar"),
          entry(10101, "FooQix**")
  );

  @org.junit.Test
  public void stage1() {
    FooBarQix FooBarQix = new FooBarQix();
    for (Map.Entry<Integer, String> entry : stage1.entrySet()) {
      Integer input = entry.getKey();
      String actual = FooBarQix.compute(entry.getKey());
      String expected = entry.getValue();
      Assert.assertEquals("for input: " + input, expected, actual);
    }
  }

  @org.junit.Test
  public void stage2() {
    FooBarQix FooBarQix = new FooBarQix();
    for (Map.Entry<Integer, String> entry : stage2.entrySet()) {
      Integer input = entry.getKey();
      String actual = FooBarQix.compute2(entry.getKey());
      String expected = entry.getValue();
      Assert.assertEquals("for input: " + input, expected, actual);
    }
  }
}