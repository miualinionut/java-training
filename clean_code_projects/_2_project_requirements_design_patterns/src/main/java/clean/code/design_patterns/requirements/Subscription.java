package clean.code.design_patterns.requirements;

public class Subscription {
    private String type;
    private int duration;
    private int price;
    private String access;

    public Subscription(Builder builder){
        this.type = builder.type;
        this.duration = builder.duration;
        this.price = builder.price;
        this.access = builder.access;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public String getAccess() {
        return access;
    }



    static class Builder{
        private String type;
        private int duration;
        private int price;
        private String access;

        public Builder(String type){this.type = type;}
        public Builder duration(int duration){
            this.duration = duration;
            return this;
        }
        public Builder price(int price){
            this.price = price;
            return this;
        }
        public Builder access(String access){
            this.access = access;
            return this;
        }
        public Subscription build(){return new Subscription(this);}
    }
}
