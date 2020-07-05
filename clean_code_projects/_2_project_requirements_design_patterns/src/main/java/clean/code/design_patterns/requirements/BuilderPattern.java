package clean.code.design_patterns.requirements;

import java.net.StandardSocketOptions;

public class BuilderPattern {
    static class Coffee {
        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        private Coffee(Builder builder) {
            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;
        }

        public static class Builder {
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;

            public Builder(String type) {
                this.type = type;
            }

            public Builder setSugar(boolean sugar) {
                this.sugar = sugar;
                return this;
            }

            public Builder setMilk(boolean milk) {
                this.milk = milk;
                return this;
            }

            public Builder setSize(String size) {
                this.size = size;
                return this;
            }

            public Coffee build() {
                return new Coffee(this);
            }
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee.Builder("Caffe Latte").setSugar(true).setMilk(true).setSize("Large").build();
        System.out.println(coffee.type + " " + coffee.sugar + " " + coffee.milk + " " + coffee.size);
    }
}

