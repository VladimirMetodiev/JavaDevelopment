package array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        String[] fruits = {"pear", "apple", "banana", "grapes", "apricot", "plum", "cherry", "melon", "pomegranate"};

        String[] cloneOfFruits = fruits.clone();
        System.out.println(Arrays.toString(cloneOfFruits));

        String[] copyOfFruits = Arrays.copyOf(fruits, fruits.length);
        System.out.println(Arrays.toString(copyOfFruits));

        String[] copyArrayRange = new String[fruits.length];
        System.arraycopy(fruits, 0, copyArrayRange, 0, copyArrayRange.length);
        System.out.println(Arrays.toString(copyArrayRange));
    }
}
