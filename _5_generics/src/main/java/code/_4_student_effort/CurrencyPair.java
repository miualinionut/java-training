package code._4_student_effort;


import java.util.Objects;

public class CurrencyPair<A extends Currency, B extends Currency>
{
    Class<A> firstCurrency;
    Class<B> secondCurrency;

    public CurrencyPair(Class<A> firstCurrency, Class<B> secondCurrency)
    {
        this.firstCurrency = firstCurrency;
        this.secondCurrency = secondCurrency;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyPair<?, ?> that = (CurrencyPair<?, ?>) o;
        return firstCurrency.equals(that.firstCurrency) && secondCurrency.equals(that.secondCurrency);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstCurrency, secondCurrency);
    }
}
