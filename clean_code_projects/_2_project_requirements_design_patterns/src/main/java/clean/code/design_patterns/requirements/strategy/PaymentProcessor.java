package clean.code.design_patterns.requirements.strategy;
    // Context class
    class PaymentProcessor {
        private PaymentStrategy paymentStrategy;

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void processPayment(double amount) {
            paymentStrategy.pay(amount);
        }
    }
