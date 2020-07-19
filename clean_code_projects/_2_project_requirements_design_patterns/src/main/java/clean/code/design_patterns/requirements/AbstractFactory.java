package clean.code.design_patterns.requirements;
// am creat aceasta clasa abastracta pentru a obtine "the factories" pentru Bank si Loan
abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}