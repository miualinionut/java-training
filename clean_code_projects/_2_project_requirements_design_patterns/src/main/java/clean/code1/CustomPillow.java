package clean.code1;

public class CustomPillow {
    private String name;
    private String color;
    private int weight;
    private String fabric;
    private String filling;

    public CustomPillow(Builder builder) {

    }

    public String CustomPillow(Builder builder){
        this.name=builder.name;
        this.color=builder.color;
        this.weight=builder.weight;
        this.fabric=builder.fabric;
        this.filling=builder.filling;

        return null;
    }

    static class Builder{
        private final String name;
        private String color;
        private int weight;
        private String fabric;
        private String filling;


        public Builder(String name) {
            this.name = name;

      }
        public Builder color (String color){
            this.color=color;
            return this;
        }
        public Builder weight(int weight){
            this.weight=weight;
            return this;
        }

        public Builder fabric(String fabric){
            this.fabric=fabric;
            return  this;
        }
        public Builder filling(String filling){
            this.filling=filling;
            return this;
        }
        public CustomPillow build() {
            return  new CustomPillow(this);
        }
    }
}

