package random;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        //Връща следващата псевдо-случайна, равномерно разпределена стойност int, тя може да бъде както положително, така и отрицателно число
        System.out.println("int: " + random.nextInt());
        //Връща псевдо-случайна, равномерно разпределена int стойност от 0 включително, до посочената стойност (без нея)
        System.out.println("int: " + random.nextInt(10));         // от 0 до 9

        //Връща псевдо-случайна, булева стойност
        System.out.println("boolean: " + random.nextBoolean());

        //Връща следващата псевдо-случайна, равномерно разпределена float стойност между 0.0 и 1.0
        System.out.println("float: " + random.nextFloat());

        //Връща следващата псевдо-случайна, равномерно разпределена double стойност между 0.0 и 1.0
        System.out.println("double: " + random.nextDouble());

        //Връща следващата псевдо-случайна, равномерно разпределена long стойност
        System.out.println("long: " + random.nextLong());

        //Връща следващата псевдо-случайна, гаусово (нормално) разпределена double стойност, със средна стойност 0.0 и стандартно отклонение 1.0
        System.out.println("Gaussian: " + random.nextGaussian());

        //nextBytes​(byte[] bytes) -> Генерира произволни byte стойности и ги поставя в предоставеният от потребителя байт-масив
        byte[] bytes = new byte[15];
        random.nextBytes(bytes);

        System.out.print("Byte array: [");
        for (int i = 0; i< bytes.length; i++) {
            System.out.printf("%d ", bytes[i]);
        }
        System.out.print("]\n");
    }
}
