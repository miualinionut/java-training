package clean.code.design_patterns.requirements;

public class Account {
    private final String email;
    private final String id;
    private final SoldierType soldierType;
    private final String state;

    public Account(Builder builder){
        this.email= builder.email;
        this.id=builder.id;
        this.soldierType=builder.soldierType;
        this.state=builder.state;
    }

    static class Builder{
        private String email;
        private String id;
        private SoldierType soldierType;
        private String state;

        public Builder email(final String email){
            this.email=email;
            return this;
        }

        public Builder id(final String id){
            this.id=id;
            return this;
        }
        public Builder soldierType(final SoldierType soldierType){
            this.soldierType = soldierType;
            return this;
        }
        public Builder state(final String state){
            this.state=state;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
    }

    public static void main(String[] args) {

        SoldierType Archer=new SoldierType("Archer", new QuickRefill(), new HealingRepair(), new LongRangeAttack());

        Account account1=new Builder()
                .email("babagi.me.com")
                .id("john123")
                .soldierType(Archer)
                .state("online")
                .build();

        System.out.println("Account on email "+account1.email+" with id = "+account1.id+ " of class "+account1.soldierType.name+" has been created!"+"\n"+"The account is "+account1.state+"!");

    }
}
