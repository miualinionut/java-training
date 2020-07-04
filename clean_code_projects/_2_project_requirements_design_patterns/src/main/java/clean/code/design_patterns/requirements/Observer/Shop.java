package clean.code.design_patterns.requirements.Observer;

public interface Shop {
    public abstract void register(Client x);
    public abstract void remove(Client x);
    public abstract void notifyClient();

}
