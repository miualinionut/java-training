package clean.code.design_patterns.requirements.builder_design_pattern;


public class Tax {
    private int sum;
    private String dateOfIssue;
    private String expirationDate;
    private String type;
    private boolean isPaid;
    private String additionalInfo;


    public Tax(Builder builder){
        this.sum = builder.sum;
        this.dateOfIssue = builder.dateOfIssue;
        this.expirationDate = builder.expirationDate;
        this.type = builder.type;
        this.isPaid = builder.isPaid;
        this.additionalInfo = builder.additionalInfo;

    }

    public static class Builder{
        private int sum;
        private String dateOfIssue;
        private String expirationDate;
        private String type;
        private boolean isPaid;
        private String additionalInfo;

        public Builder(int sum, String type, String dateOfIssue, String expirationDate){
            this.sum = sum;
            this.type = type;
            this.dateOfIssue = dateOfIssue;
            this.expirationDate = expirationDate;

        }

        public Builder isPaid(boolean isPaid){
            this.isPaid = isPaid;
            return this;
        }

        public Builder additionalInfo(String additionalInfo){
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Tax build(){
            return new Tax(this);
        }


    }
    public void setSum (int newSum) { sum = newSum; }


    public int getSum(){ return sum; }
}
