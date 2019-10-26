package code._1_study._1_method_constructor_reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodAndConstructorReferenceExample {
    public static void main(String[] args) {
        // Reference to a static method
        Function<Double,Double> sqrt = Math::sqrt;

        // Reference to a constructor of String class
        Supplier<String> generator = String::new;
    }
}
