package algorithms.recursion.factorial;

import java.math.BigInteger;

public class FactorialWithBigInteger {
    private int number;

    public FactorialWithBigInteger(int number) {
        this.number = number;
    }

    private BigInteger calculateFactorial() {
        if (number < 1) return BigInteger.valueOf(1);
        else return new FactorialWithBigInteger(number - 1).calculateFactorial().multiply(BigInteger.valueOf(number));
    }

    @Override
    public String toString() {
        return String.format("%s", calculateFactorial());
    }
}
