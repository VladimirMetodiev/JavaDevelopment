package generics.studyExperiment;

public class Start {
    public static void main(String[] args){
        Integer[] numbers = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        Character[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        String[] countries = {"South Africa", "Namibia", "Botswana", "Zimbabwe", "Zambia", "Mozambique", "Madagascar", "Malawi", "Tanzania", "Angola"};

        show(numbers);
        show(letters);
        show(countries);

        ExpClass object = new ExpClass(3);

        System.out.println(getText(numbers[0], 1));
        System.out.println(getText(letters[0], 2));
        System.out.println(getText(countries[0], 3));
        System.out.println(getText(object, 4));
        System.out.println(getText(555L, 5));       // стойността 555L е от примитивен тип - извършва се автоопаковане в обвиващ тип
        System.out.println(getText(6.66, 6));       // стойността 6.66 е от примитивен тип - извършва се автоопаковане в обвиващ тип

        Integer result1 = getArguments(numbers[5], numbers[6], object);
        Character result2 = getArguments(letters[5], letters[6], countries[7]);
        ExpClass result3 = getArguments(new ExpClass(numbers[8]), new ExpClass(numbers[9]), 111);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    static <T> void show(T[] array){
        for (int a = 0; a < array.length; a++) {
            System.out.print("|" + array[a]);
        }
        System.out.println("|");
    }

    static <T> String getText(T var, int num){
        String result = num + ": ";
        result += var;
        return result;
    }

    static <T, U> T getArguments(T x, T y, U z){
        int value = z.toString().length();
        if(value % 2 == 0) return x;
        else return y;
    }
}
