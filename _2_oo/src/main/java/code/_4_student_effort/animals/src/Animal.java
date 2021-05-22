abstract class Animal {
    protected Integer legs;

    protected Animal()
       {}
    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    public void eat(){}
    public void walk(){ }
}
