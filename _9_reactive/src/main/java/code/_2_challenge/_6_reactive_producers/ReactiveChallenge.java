package code._2_challenge._6_reactive_producers;

import code._2_challenge._6_reactive_producers.reactor.NetflixUsingReactor;
import code._2_challenge._6_reactive_producers.vanilla.NetflixVanilla;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.ReplayProcessor;

public class ReactiveChallenge {
    public static void main(String[] args) {
        Observed<String> netflix = new NetflixVanilla<>();

        // has no history; directly calls the observer::receiveNotification method for each observer
        // same as vanilla
        //Observed<String> netflix = new NetflixUsingReactor<>(DirectProcessor.create());

        // has no history; will not add new items to the processor's queue while the queue is full;
        // the addition will be suspended thread until queue space is freed;
        // can control queue size from .create(1) or .create(10)
        //Observed<String> netflix = new NetflixUsingReactor<>(EmitterProcessor.create());

        // has history; queue size has default size of 256;
        // queue can be bounded or unbounded; .create(params) can set that
        //Observed<String> netflix = new NetflixUsingReactor<>(ReplayProcessor.create());

        Observer s01 = new Student("S01");
        Observer s02 = new Student("S02");
        Observer s03 = new Student("S03");

        netflix.notifyObservers("Game Of Thrones new episode: E01");
        netflix.notifyObservers("Game Of Thrones new episode: E02");
        netflix.notifyObservers("Game Of Thrones new episode: E03");
        netflix.notifyObservers("Game Of Thrones new episode: E04");
        netflix.notifyObservers("Game Of Thrones new episode: E05");
        netflix.notifyObservers("Game Of Thrones new episode: E06");
        netflix.notifyObservers("Game Of Thrones new episode: E07");
        netflix.notifyObservers("Game Of Thrones new episode: E08");

        netflix.subscribe(s01);
        netflix.subscribe(s02);

        netflix.notifyObservers("Game Of Thrones new episode: E09");
        System.out.println();

        netflix.subscribe(s03);
        netflix.notifyObservers("Game Of Thrones new episode: E10");
        System.out.println();

    }
}





