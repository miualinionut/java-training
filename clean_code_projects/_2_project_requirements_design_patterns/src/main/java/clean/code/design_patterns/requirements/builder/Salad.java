package clean.code.design_patterns.requirements.builder;

public class Salad {

    private String name;
    private String vegetables;
    private String dressing;
    private String meat;
    private String herbage;
    private String spices;
    private String fruits;


    public Salad(Builder builder) {
        this.name = name;
        this.vegetables = vegetables;
        this.dressing = dressing;
        this.meat = meat;
        this.herbage = herbage;
        this.spices = spices;
        this.fruits = fruits;
    }

    public static class Builder {
        private String name;
        private String vegetables;
        private String dressing;
        private String meat;
        private String herbage;
        private String spices;
        private String fruits;

        public Builder(String name) {

            this.name = name;
        }

        public Builder setVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Builder setDressing(String sauce) {
            this.dressing = sauce;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder setHerbage(String herbage) {
            this.herbage = herbage;
            return this;
        }

        public Builder setSpices(String spices) {
            this.spices = spices;
            return this;
        }

        public Builder setFruits(String fruits) {
            this.fruits = fruits;
            return this;
        }

        public Salad build() {
            System.out.println(this);
            return new Salad(this);
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", vegetables='" + vegetables + '\'' +
                    ", dressing='" + dressing + '\'' +
                    ", meat='" + meat + '\'' +
                    ", herbage='" + herbage + '\'' +
                    ", spices='" + spices + '\'' +
                    ", fruits='" + fruits + '\'' +
                    '}';
        }
    }

}
