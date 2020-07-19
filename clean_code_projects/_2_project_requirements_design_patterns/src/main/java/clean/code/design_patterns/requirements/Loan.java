package clean.code.design_patterns.requirements;
// clasa abstracta Loan care va calcula plata lunara coresp. imprumutului facut la banca aleasa
abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years)
    {
        /* pentru a calcula plata lunara a imprumutului
           trebuie sa cunoastem aceasta formula

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              => n=years*12;

            */

        double sumapeluna;
        int n;

        n=years*12;
        rate=rate/1200;
        sumapeluna=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        System.out.println("Suma pe care trebuie sa o platiti lunar "+ sumapeluna +" pentru imprumutul de "+loanamount);
    }
}