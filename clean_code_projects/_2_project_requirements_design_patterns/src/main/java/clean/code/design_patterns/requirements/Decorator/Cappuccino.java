package main.java.clean.code.design_patterns.requirements.Decorator;

 public class Cappuccino extends Coffee{
        public Cappuccino() {
            super("Cappuccino");
        }

        @Override
        public double cost() {
            return 20;
        }
    }

