package clean.code.design_patterns.requirements.stanandrei.observer;

public class SubscriberImpl implements Subscriber {
    private final String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String articleTitle) {
        System.out.println(name + " a primit un articol nou: " + articleTitle);
    }
}
