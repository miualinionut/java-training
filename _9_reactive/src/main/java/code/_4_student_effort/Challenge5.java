package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Challenge5 {

    private static List<String> words1 = Arrays.asList(
            "alpha","bravo","charlie","delta","echo","foxtrot"
    );
    private static List<String> words2 = Arrays.asList(
            "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"
    );

    public static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2){
        return flux1.mergeWith(flux2);
    }

    public static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2){
        return flux1.concatWith(flux2);
    }

    public static Flux<String> createFluxFromMonos(Mono<String> mono1, Mono<String> mono2){
        return Flux.concat(mono1,mono2);
    }

    public static void main(String[] args) {

        Flux<String> flux1 = Flux.fromIterable(words1);
        Flux<String> flux2 = Flux.fromIterable(words2);

        mergeFluxWithInterleave(flux1,flux2).subscribe( s -> System.out.print(s + " "));
        System.out.println();
        mergeFluxWithNoInterleave(flux1,flux2).subscribe(s -> System.out.print(s + " "));
        System.out.println();

        Mono<String> mono1 = Mono.just("unu");
        Mono<String> mono2 = Mono.just("doi");
        createFluxFromMonos(mono1,mono2).subscribe(s -> System.out.print(s + " "));

    }
}
