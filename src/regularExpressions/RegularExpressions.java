package regularExpressions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println("Example 1");
        String text = "HashMap is a Map based collection class that is used for storing Key and value pairs, it is denoted as HashMap<Key, Value> or HashMap<K, V>.";

        Pattern pattern1 = Pattern.compile("HashMap");
        Matcher matcher1 = pattern1.matcher(text);

        while(matcher1.find()) {
            System.out.println(matcher1.group());
        }



        System.out.println("\nExample 2");
        String theSecondText = "These events happened on 07-Jan-1997.";

        Pattern pattern2 = Pattern.compile("\\d{2}-(\\w{3})-\\d{4}");
        Matcher matcher2 = pattern2.matcher(theSecondText);

        while(matcher2.find()) {
            System.out.println(matcher2.group());
        }



        System.out.println("\nExample 3");
        String theThirdText = "TreeMap class implements Map interface similar to HashMap class. The main difference between them is that HashMap is an unordered collection while TreeMap is sorted in the ascending order of its keys. TreeMap is unsynchronized collection class which means it is not suitable for thread-safe operations until unless synchronized explicitly.";

        Pattern pattern3 = Pattern.compile("TreeMap");
        Matcher matcher3 = pattern3.matcher(theThirdText);

        while(matcher3.find()) {
            System.out.printf("Position [%d] - %s%n", matcher3.start(), matcher3.group());
        }



        System.out.println("\nExample 4");
        matcher3 = pattern3.matcher(theThirdText);
        while(matcher3.find()) {
            System.out.printf("Position [%d] - %s%n", matcher3.end(), matcher3.group());
        }



        System.out.println("\nExample 5");
        String theFourthText = "Loss Victory Victory Loss Victory";

        Pattern pattern4 = Pattern.compile("Loss");
        Matcher matcher4 = pattern4.matcher(theFourthText);
        theFourthText = matcher4.replaceAll("Victory");

        System.out.println(theFourthText);



        System.out.println("\nExample 6");
        String theFifthText = "Anna is a sexy woman!";

        boolean found = Pattern.matches("Anna is a sexy woman!", theFifthText);

        if(found) System.out.println("found");
        else System.out.println("not found");



        System.out.println("\nExample 7");
        String theSixthText = "Copernicus was a mathematician and astronomer who formulated a model of the universe that placed the Sun rather than Earth at its center.";

        Pattern pattern5 = Pattern.compile("Copernicus was a mathematician and astronomer who formulated a model of the universe that placed the Sun rather than Earth at its center.");
        Matcher matcher5 = pattern5.matcher(theSixthText);
        boolean wasItFound = matcher5.matches();

        if(wasItFound) System.out.println("found");
        else System.out.println("not found");



        System.out.println("\nExample 8");
        String theSeventhText = "The process by which one class acquires the properties and functionality of another class is called inheritance.";

        Pattern pattern6 = Pattern.compile("[abc]");
        Matcher matcher6 = pattern6.matcher(theSeventhText);

        while(matcher6.find()) {
            System.out.printf("Position [%d] - %s%n", matcher6.start(), matcher6.group());
        }



        System.out.println("\nExample 9");
        String theEighthText = "FHHATPATMKWHEJADNQHEADYATPNBHATDESAUODGD";

        Pattern pattern7 = Pattern.compile("HE?A[TD]");
        Matcher matcher7 = pattern7.matcher(theEighthText);

        while(matcher7.find()) {
            System.out.printf("Position [%d] - %s%n", matcher7.start(), matcher7.group());
        }



        System.out.println("\nExample 10");
        String theNinthText = "53, twenty-five, 834, Seventy-eight,  46, 800, twelve, 2834";

        Pattern pattern8 = Pattern.compile("[0-9]+");
        Matcher matcher8 = pattern8.matcher(theNinthText);

        while(matcher8.find()) {
            System.out.printf("%s%n", matcher8.group());
        }



        System.out.println("\nExample 11");
        String theTenthText = "A2G6R8C3E95AABACB62B83";

        Pattern pattern9 = Pattern.compile("[ABC][^E-H3-5]");
        Matcher matcher9 = pattern9.matcher(theTenthText);

        while(matcher9.find()) {
            System.out.printf("Position [%d] - %s%n", matcher9.start(), matcher9.group());
        }



        System.out.println("\nExample 12");
        String theEleventhText = "redbluebrowngreenredblueyellowaquamarinebluevioletbrownwhite";

        Pattern pattern10 = Pattern.compile("blue|aquamarine");
        Matcher matcher10 = pattern10.matcher(theEleventhText);

        while(matcher10.find()) {
            System.out.printf("Position [%d] - %s%n", matcher10.start(), matcher10.group());
        }



        System.out.println("\nExample 13");
        String theTwelfthText = "boabotbatchbutbathebatbetbathosbit";

        Pattern pattern11 = Pattern.compile("b.t");
        Matcher matcher11 = pattern11.matcher(theTwelfthText);

        while(matcher11.find()) {
            System.out.printf("Position [%d] - %s%n", matcher11.start(), matcher11.group());
        }



        System.out.println("\nExample 14");

        Pattern pattern12 = Pattern.compile("^Anna");
        Matcher matcher12 = pattern12.matcher(theFifthText);

        while(matcher12.find()) {
            if(matcher12.group().equals("Anna")) System.out.println("Yes");
            else System.out.println("No");
        }



        System.out.println("\nExample 15");

        Pattern pattern13 = Pattern.compile("woman!$");
        Matcher matcher13 = pattern13.matcher(theFifthText);

        while(matcher13.find()) {
            if(matcher13.group().equals("woman!")) System.out.println("Yes");
            else System.out.println("No");
        }



        System.out.println("\nUsing of metacharacters");

        System.out.println("\nExample 16");
        String theThirteenthText = "Akb63GU2tFx15Q45v";

        Pattern pattern14 = Pattern.compile("\\d+");
        Matcher matcher14 = pattern14.matcher(theThirteenthText);

        while(matcher14.find()) {
            System.out.printf("Position [%d] - %s%n", matcher14.start(), matcher14.group());
        }



        System.out.println("\nExample 17");

        Pattern pattern15 = Pattern.compile("\\D+");
        Matcher matcher15 = pattern15.matcher(theThirteenthText);

        while(matcher15.find()) {
            System.out.printf("Position [%d] - %s%n", matcher15.start(), matcher15.group());
        }



        System.out.println("\nExample 18");
        String theFourteenthText = "A_kb,63;GU-2**tFx+15%%Q!45[v";

        Pattern pattern16 = Pattern.compile("\\w+");
        Matcher matcher16 = pattern16.matcher(theFourteenthText);

        while(matcher16.find()) {
            System.out.printf("Position [%d] - %s%n", matcher16.start(), matcher16.group());
        }



        System.out.println("\nExample 19");

        Pattern pattern17 = Pattern.compile("\\W+");
        Matcher matcher17 = pattern17.matcher(theFourteenthText);

        while(matcher17.find()) {
            System.out.printf("Position [%d] - %s%n", matcher17.start(), matcher17.group());
        }



        System.out.println("\nExample 20");
        String names = "Nina, Teodor, Maria, Konstantin, Stephan, Anna, Vladimir, Ivan";

        Pattern pattern18 = Pattern.compile("[A-Z]\\w+");
        Matcher matcher18 = pattern18.matcher(names);

        ArrayList<String> list = new ArrayList<>();

        while(matcher18.find()) {
            list.add(matcher18.group());
        }

        for(String name : list) {
            if(name.length() == 4) System.out.println(name);
        }



        // търся само числата от 10 до 99, за да не взимам за съответствие цифри от числа по-големи от 99, отпред и отзад на \d{2} слагам граница - \b

        System.out.println("\nExample 21");
        String numbers = "18, 539, 19, 1, 2489, 32, 43, 368";

        Pattern pattern19 = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher19 = pattern19.matcher(numbers);

        while(matcher19.find()) {
            System.out.println(matcher19.group());
        }



        System.out.println("\nExample 22");
        String sequences = "ABCBGADDEHABFDAFFCEFGFGDADABEFHABBCCDAHFGFGBHHBFAFFGG";

        Pattern pattern20 = Pattern.compile("(FG){2}");     // трябва да поставя (FG) в скоби, защото иначе ще бъде търсено съответствие за FGG
        Matcher matcher20 = pattern20.matcher(sequences);

        while(matcher20.find()) {
            System.out.printf("Position: [%d] - %s%n", matcher20.start(), matcher20.group());
        }



        // https://regex101.com/
        // https://regexr.com/

        // Бележка: в IntelliJ IDEA, за да проверя дали дадено значение, съответства на даден регулярен израз -> поставям курсора
        // на мишката на регулярният израз и натискам Alt + Enter -> кликам Check RexExp -> открива се прозорец, в който мога да
        // въведа значението за проверка
    }
}
