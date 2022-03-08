package algorithms.recursion.factorial;

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    private long getFactorial() {
        return calculateFactorial(number);
    }

    private long calculateFactorial(long number) {
        long result = 1L;

        if(number > 0) {
            result *= number * calculateFactorial(--number);
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("%d", getFactorial());
    }
}
