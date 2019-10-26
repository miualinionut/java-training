package code._2_challenge._4_transformations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class TransformationsChallenge {
    private static List<User> users = Arrays.asList(
            new User("Project", "Reactor", "reactor"),
            new User("Java", "King", "javaking"),
            new User("Duke", "Awesome", "theduke"),
            new User("Duke", "TheDuke", "duke99"),
            new User("Java", "Reactive", "reactive_java"),
            new User("Cool", "Duke", "cool_duke"),
            new User("Reactor", "The", "the_reactor"),
            new User("Fun", "Reactor", "reactor_is_fun"));

    public static void main(String[] args) {
        System.out.println("capitalizeOne\n");
        capitalizeOne(Mono.just(users.get(0))).subscribe(System.out::println);

        System.out.println("\ncapitalizeMany\n");
        capitalizeMany(Flux.fromIterable(users)).subscribe(System.out::println);

        System.out.println("\nasyncCapitalizeMany\n");
        asyncCapitalizeMany(Flux.fromIterable(users)).subscribe(System.out::println);
    }

    // Capitalize the user username, firstname and lastname
    static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUsername().toUpperCase()));
    }

    // Capitalize the users username, firstName and lastName
    static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map(user -> new User(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUsername().toUpperCase()));
    }

    // Capitalize the users username, firstName and lastName using #asyncCapitalizeUser
    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMap(u -> asyncCapitalizeUser(u));
    }

    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getFirstName().toUpperCase(), u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }
}
