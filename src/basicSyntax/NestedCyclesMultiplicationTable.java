package basicSyntax;

public class NestedCyclesMultiplicationTable {
    public static void main(String[] args) {
        System.out.print("|  /  |");

        for (int a = 1; a <= 10; a++) {
            if(a < 10) System.out.printf(" %3d |", a);
            else System.out.printf(" %3d |%n", a);
        }

        for (int b = 1; b <= 10; b++) {
            System.out.printf("| %3d |", b);
            for (int c = 1; c <= 10; c++) {
                if(c < 10) System.out.printf(" %3d  ", b * c);
                else System.out.printf(" %3d |%n", b * c);
            }
        }
    }
}
