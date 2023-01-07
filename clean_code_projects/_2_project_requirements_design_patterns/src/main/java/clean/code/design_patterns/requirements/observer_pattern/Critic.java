package clean.code.design_patterns.requirements.observer_pattern;

public class Critic implements Subscriber{
    private String name, address;

    public Critic(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private void printReview(Magazine magazine) {
        double score = Math.floor(Math.random() * 10);
        System.out.println("My name is " + this.name + " and I give this book a score of " + score);
    }

    public void update(Magazine magazine) {
        printReview(magazine);
    }
}
