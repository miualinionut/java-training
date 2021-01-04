package clean.code.design_patterns.requirements;

public class Client {
    private String name;
    private String phoneNumber;
    private String status;
    private Subscription subscription;

    public Client(Builder builder){
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.status = builder.status;
        this.subscription = builder.subscription;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    static class Builder{
        private final String name;
        private String phoneNumber;
        private String status;
        private Subscription subscription;

        public Builder(String name){this.name = name;}
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder status(String status){
            this.status = status;
            return this;
        }
        public Builder subscription(Subscription subscription){
            this.subscription = subscription;
            return this;
        }
        public Client build(){return new Client(this);}
    }
}
