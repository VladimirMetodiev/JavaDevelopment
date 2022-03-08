package string;

import java.util.Arrays;

public class StrClass {
    public static void main(String[] args) {
        /*
         * В Java за работа с текст, се използват класовете String, StringBuffer и StringBuilder. Текстът се реализира,
         * като символен низ, т.е. като поредица от символи, намиращи се в текстов обект. Референция към този текстов обект се
         * присвоява на променлива от тип String (или StringBuffer, StringBuilder).
         *
         * String, StringBuffer и StringBuilder са класове от пакета java.lang, който е достъпен по подразбиране. Те са дефинирани
         * с ключовата дума final, поради което не могат да бъдат наследявани, респективно да бъдат суперкласове.
         *
         * Обектите на класът String са неизменяеми (immutable). Това означава, че при всички операции, които променят символният низ,
         * се създава нов низ.
         *
         * За да създам символен низ мога да използвам конструктор на клас String или директно да присвоя низът в двойни кавички.
         */

        // Създаване на символен низ
        String someText1 = "I study Java every day.";
        System.out.println(someText1);

        String someText2 = new String();
        someText2 = someText1;
        System.out.println(someText2);

        String someText3 = new String(new char[] {'I', ' ', 's', 't', 'u', 'd', 'y', ' ', 'J', 'a', 'v', 'a', ' ', 'e', 'v', 'e', 'r', 'y', ' ', 'd', 'a', 'y', '.'});
        System.out.println(someText3);

        char[] expression = someText1.toCharArray();
        String someText4 = new String(expression);
        System.out.println(someText4);

        // expression - масив от символи, 8 - начален индекс, 4 - количество символи, които се взимат
        String someText5 = new String(expression, 8, 4);
        System.out.println(someText5);


        System.out.println("--------->--------->--------->");


        // Конкатенация (обединяване) на символни низове - .concat()
        String theFirst = "Always I go to the boxing ring";
        String theSecond = "to win.";
        String theThird = theFirst + " " + theSecond;
        System.out.println("CONCATENATION: " + theThird);

        theFirst = "I like ";
        theSecond = "chocolate.";
        theThird = theFirst.concat(theSecond);
        System.out.println("CONCATENATION: " + theThird);


        System.out.println("--------->--------->--------->");


        // Дължина на текстовият низ - .length()
        String myName = "Vladimir";
        System.out.println("Method .length() | " + myName.length());


        System.out.println("--------->--------->--------->");


        // Проверка дали символният низ е празен - .isEmpty()
        String text = "";
        System.out.println("Method .isEmpty()");
        if(text.isEmpty()) System.out.println("The string is empty.");
        if(text.length() == 0) System.out.println("The string is empty.");

//        try {
//            text = null;
//            System.out.println(text.length());
//        }
//        catch (NullPointerException ex) {
//            System.err.println("The string is null.");
//        }


        System.out.println("--------->--------->--------->");


        // Взимане на символ от символен низ - .charAt()
        text = "If not now, then when? If not me, then who?";
        System.out.println("Method .charAt() | " + text.charAt(9));


        System.out.println("--------->--------->--------->");


        // Превръщане на символен низ в char масив - .toCharArray()
        char[] letters = text.toCharArray();
        System.out.println("Method .toCharArray()");
        System.out.println(letters);


        System.out.println("--------->--------->--------->");


        // Взимане на символи от символен низ и записването им в char масив - .getChars()
        // първи аргумент - индекс, от който започва четенето на символите
        // втори аргумент - индекс, при който завършва четенето на символите (той не влиза в char масива)
        // трети аргумент - референция към масива, който ще бъде запълнен със символите
        // четвърти аргумент - индекс (от char масива), от който започва записването на символите в масива

        System.out.println("Method .getChars()");

        letters = new char[text.length()];
        text.getChars(0, text.length(), letters, 0);
        System.out.println(letters);

        letters = new char[20];
        text.getChars(23, text.length(), letters, 0);
        System.out.println(letters);


        System.out.println("--------->--------->--------->");


        // Превръщане на символен низ в byte масив - .getBytes()
        System.out.println("Method .getBytes()");
        byte[] bytes = text.getBytes();
        System.out.println(Arrays.toString(bytes));

        for(int num : bytes) {
            System.out.print((char)num);
        }
        System.out.println();


        System.out.println("--------->--------->--------->");


        // Създаване на символен низ, с предварително зададен разделител
        String[] countries = {"Morocco", "Algeria", "Tunisia", "Libya", "Egypt"};
        System.out.println("Method .join() | " + String.join(", ", countries));
        System.out.println("Method .join() | " + String.join(" >>> ", countries));


        System.out.println("--------->--------->--------->");


        // Преобразуване на обект в текстов вид - .valueOf()
        text = String.valueOf(true);
        System.out.println(text);
        text = String.valueOf(3.14);
        System.out.println(text);
        text = String.valueOf(new char[]{'V', 'l', 'a', 'd', 'i', 'm', 'i', 'r'});
        System.out.println(text);


        System.out.println("--------->--------->--------->");


        // Сравняване на два символни низа - .equals(), equalsIgnoreCase(), .compareTo(), .compareToIgnoreCase()
        myName = "Vladimir Metodiev";
        String someName = "Vladislav Petrov";

        System.out.print("Method .equals() | ");
        if(myName.equals(someName)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

        System.out.print("Method .compareTo() | ");
        if(myName.compareTo(someName) < 0) {
            System.out.println(myName);
        }
        else if(myName.compareTo(someName) > 0) {
            System.out.println(someName);
        }
        else {
            System.out.println("The names are identical.");
        }


        System.out.println("--------->--------->--------->");


        text = "If not now, then when? If not me, then who?";

        // Намиране на първият индекс, на който се намира даден подниз с метода .indexOf(), в противен случай връща -1
        System.out.println("Method .indexOf() | " + text.indexOf('a'));
        System.out.println("Method .indexOf() | " + text.indexOf('n'));
        System.out.println("Method .indexOf() | " + text.indexOf("then"));

        // Намиране на последният индекс, на който се намира даден подниз с метода .lastIndexOf(), в противен случай връща -1
        System.out.println("Method .lastIndexOf() | " + text.lastIndexOf('a'));
        System.out.println("Method .lastIndexOf() | " + text.lastIndexOf('n'));
        System.out.println("Method .lastIndexOf() | " + text.lastIndexOf("then"));


        System.out.println("--------->--------->--------->");


        someName = "Veselin Aleksandrov Topalov";

        // Дали низът започва с даден подниз - .startsWith()
        System.out.println("Method .startsWith() | " + someName.startsWith("Veselin"));
        System.out.println("Method .startsWith() | " + someName.startsWith("Alexander"));

        // Дали низът завършва с даден подниз - .endsWith()
        System.out.println("Method .endsWith() | " + someName.endsWith("Topalov"));
        System.out.println("Method .endsWith() | " + someName.endsWith("Petrov"));


        System.out.println("--------->--------->--------->");


        // Взимане на подниз от даден символен низ - .substring()
        text = "Enjoy the beauty of nature";
        System.out.println("Method .substring() | " + text.substring(20)); // от индекс 20 до края
        System.out.println("Method .substring() | " + text.substring(10, 16)); // от индекс 10 до индекс 16 (без него)


        System.out.println("--------->--------->--------->");


        // Дали символният низ съдържа даден подниз - .contains()
        System.out.println("Method .contains() | " + text.contains("beauty"));


        System.out.println("--------->--------->--------->");


        // Замяна на един подниз с друг - .replace()
        text = "I am a Python developer.";
        text = text.replace("Python", "Java");
        System.out.println("Method .replace() | " + text);


        System.out.println("--------->--------->--------->");


        text = "ReGex";
        System.out.println(text);
        System.out.println("Method .toLowerCase() | " + text.toLowerCase());
        System.out.println("Method .toUpperCase() | " + text.toUpperCase());


        System.out.println("--------->--------->--------->");


        // Премахване на началните и крайните интервали - .trim()
        text = "     A regular expression is a sequence of characters that specifies a search pattern.   ";
        System.out.println("Method .trim() | " + text.trim());


        System.out.println("--------->--------->--------->");


        // Разделяне на даден символен низ, на поднизове, по зададен разделител - .split()
        // Разделител - може да бъде всеки (специфичен) символ или набор от символи
        System.out.println("Method .split()");
        text = "koala, platypus, dingo,  kangaroo, Tasmanian devil, echidna";
        String[] animals = text.split(",\\s+");
        for(String animal : animals) {
            System.out.println(animal);
        }
    }
}
