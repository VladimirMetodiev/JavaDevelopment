package functionalProgramming;

public class StartTest {
    public static void main(String[] args){

        SimpleTest<Double, Double> test1 = (a, b) -> (a % b) == 0;
        System.out.println(test1.test(3.36, 0.36));
        System.out.println(test1.test(6.0, 3.0));


        SimpleTest<Integer, Integer> test2 = (a, b) -> (a % b) == 0;
        try {
            System.out.println(test2.test(9, 3));
            System.out.println(test2.test(5, 2));
            System.out.println(test2.test(18, 0));
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


        SimpleTest<String, String> test3 = (a, b) -> a.compareTo(b) == 0;
        System.out.println(test3.test("success", "success"));
        System.out.println(test3.test("success", "SUCCESS"));
        System.out.println(test3.test("success", "victory"));
    }
}
