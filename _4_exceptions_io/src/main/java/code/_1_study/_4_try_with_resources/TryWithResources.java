package code._1_study._4_try_with_resources;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TryWithResources {

    public static void main(String[] args) {
//        withFinally();
//        tryWithResources();

        List<String> stringList = new ArrayList<>() {
            {
                add("A");
                add("B");
                add("CAC");
                add("");
            }
        };

        List<String> collect = stringList.stream()
                .filter((String s) -> s.length() > 0)
                .map(m-> m + m)
                .collect(Collectors.toList());
    }

    private static void withFinally() {
        ClosableResource resource = null;
        try {
            resource = new ClosableResource();
            resource.doWork();
        } finally {
            if (resource != null) {
                resource.close();
            }
        }
    }

    private static void tryWithResources() {
        try (ClosableResource resource = new ClosableResource()) {
            resource.doWork();
        }
    }
}