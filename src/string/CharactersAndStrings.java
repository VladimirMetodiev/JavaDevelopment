package string;

import java.util.Arrays;

public class CharactersAndStrings {
    public static void main(String[] args) {
        String myName = "Vladimir";
        System.out.println(myName);

        char[] charArray = myName.toCharArray();
        System.out.println(charArray);

        String newString = new String(charArray);
        System.out.println(newString);

        String someString = Arrays.toString(charArray);
        System.out.println(someString);
    }
}
