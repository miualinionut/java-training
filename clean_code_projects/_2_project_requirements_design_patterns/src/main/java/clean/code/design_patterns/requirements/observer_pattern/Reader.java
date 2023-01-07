package clean.code.design_patterns.requirements.observer_pattern;

public class Reader implements Subscriber{
    private String name, address;

    public Reader(String name, String address) {
        this.name = name;
        this.address = address;
    }
    private void read(Magazine magazine) {
        System.out.println("My name is " + this.name + " and I enjoyed reading '" + magazine.getTitle() + "'!");
    }

    @Override
    public void update(Magazine magazine) {
        this.read(magazine);
    }
}
