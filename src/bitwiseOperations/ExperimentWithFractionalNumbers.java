package bitwiseOperations;

public class ExperimentWithFractionalNumbers {
    public static void main(String[] args) {
        double fractionalNumber = 0.1;
        double sum = 0.0;

        for (int a = 0; a < 10; a++) {
            sum += fractionalNumber;
        }

        System.out.println("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " + sum);
    }
}
