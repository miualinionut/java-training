package clean.code.design_patterns.requirements.observer_pattern;

import java.util.ArrayList;

public class Collector implements Subscriber{
    private String name, address;
    private ArrayList<Magazine> collection = new ArrayList<>();

    public Collector(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private void addToCollection(Magazine magazine) {
        System.out.println("My name is " + this.name + " and I just added '" + magazine.getTitle() + "' to my collection!");
        collection.add(magazine);
    }

    public void update(Magazine magazine) {
        addToCollection(magazine);
    }
}
