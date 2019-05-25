package lesson12;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultDivident = (a.getDividend() * b.getDivisor()) + (b.getDividend() * a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultDivident);

        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int resultDivident = (a.getDividend() * b.getDivisor()) - (b.getDividend() * a.getDivisor());

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(commonDivisor);
        result.setDividend(resultDivident);

        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivisor = a.getDivisor() * b.getDivisor();
        int resultDivident = a.getDividend() * b.getDividend();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(resultDivisor);
        result.setDividend(resultDivident);

        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int resultDivisor = a.getDivisor() * b.getDividend();
        int resultDivident = a.getDividend() * b.getDivisor();

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDivisor(resultDivisor);
        result.setDividend(resultDivident);

        return result;
    }
}
