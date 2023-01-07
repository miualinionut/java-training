package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.observer_pattern.Collector;
import clean.code.design_patterns.requirements.observer_pattern.Critic;
import clean.code.design_patterns.requirements.observer_pattern.Publisher;
import clean.code.design_patterns.requirements.observer_pattern.Reader;

public class Main {

    public static void main(String[] args) {
        //Observer Pattern
        Publisher publisher = new Publisher("Java Times");
        Reader reader = new Reader("Tudor", "Str. Baritiu 12");
        Collector collector = new Collector("Alin", "Bdul 1 Decembrie 21A");
        Critic critic = new Critic("Mihai", "Piata Unirii 15");

        publisher.addSubscriber(reader);
        publisher.publishMagazine("Design Patterns 101", 100, 2022);

        System.out.println();
        publisher.addSubscriber(collector);
        publisher.addSubscriber(critic);
        publisher.publishMagazine("Is ChatGPT the end of programming?", 21, 2023);

        System.out.println();
        publisher.removeSubscriber(reader);
        publisher.removeSubscriber(critic);
        publisher.publishMagazine("Latest trends in tech", 199, 2024);
    }
}
