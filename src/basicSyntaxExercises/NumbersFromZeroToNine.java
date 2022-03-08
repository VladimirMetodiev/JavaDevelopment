package basicSyntaxExercises;

public class NumbersFromZeroToNine {
    public static void main(String[] args) {
        int number = -1;

        while(number++ < 9){
            System.out.printf("Number: %d%n", number);
        }
    }
}
