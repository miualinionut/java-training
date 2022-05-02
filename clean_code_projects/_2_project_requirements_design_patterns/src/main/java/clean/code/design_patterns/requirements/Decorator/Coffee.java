package main.java.clean.code.design_patterns.requirements.Decorator;

public abstract class Coffee {

        private String description;

        public Coffee(String description) {
            super();
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public abstract double cost();
}
