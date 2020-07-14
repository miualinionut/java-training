package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Challenge4 {

    public static Mono<User> capitalizeOne(Mono<User> mono){
       return mono.map(u -> new User(u.getUsername().toUpperCase(),u.getFirstname().toUpperCase(),u.getLastname().toUpperCase()));
    }

    public static Flux<User> capitalizeMany(Flux<User> flux){
        return flux.map(u -> new User(u.getUsername().toUpperCase(),u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
    }

    public static Flux<User> asyncCapitalizeMany(Flux<User> flux){
        return flux.flatMap(u -> asyncCapitalizeUser(u));
    }

    public static Mono<User> asyncCapitalizeUser(User u){
        return Mono.just(new User(u.getUsername().toUpperCase(),u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
    }

    public static void main(String[] args) {

        Mono<User> mono = Mono.just(new User("username1","Maria","Ionescu"));
        capitalizeOne(mono).subscribe(System.out::println);
       // mono.subscribe(System.out::println); //nu e cu litere mari, e mono-ul initial

        List<User> list = new ArrayList<>();
        list.add(new User("ioana","Ioana","Popescu"));
        list.add(new User("andrei99","Andrei","Georgescu"));
        list.add(new User("miruu","Miruna","Gigel"));

        Flux<User> flux = Flux.fromIterable(list);
        capitalizeMany(flux).subscribe(System.out::println);
       // flux.subscribe(System.out::println); // nu e cu litere mari

        Mono<User> newMono = asyncCapitalizeUser(new User("ionel200", "Ion","mincu"));
        newMono.subscribe(System.out::println);
        asyncCapitalizeMany(flux).subscribe(System.out::println);
    }
}
