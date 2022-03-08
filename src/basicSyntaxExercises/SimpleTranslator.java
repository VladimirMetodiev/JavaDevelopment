package basicSyntaxExercises;

import java.util.Scanner;

public class SimpleTranslator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().trim().toLowerCase();

        switch (word) {
            case "climate": System.out.println("климат"); break;
            case "weather": System.out.println("време"); break;
            case "rain": System.out.println("дъжд"); break;
            case "snow": System.out.println("сняг"); break;
            case "sleet": System.out.println("суграшица"); break;
            case "wind": System.out.println("вятър"); break;
            case "fog": System.out.println("мъгла"); break;
            case "ice": System.out.println("лед"); break;
            case "hot": System.out.println("горещо"); break;
            case "warm": System.out.println("топло"); break;
            case "cold": System.out.println("студено"); break;
            case "frosty": System.out.println("мразовито"); break;
            case "wet": System.out.println("влажно"); break;
            case "dry": System.out.println("сухо"); break;
            case "sunny": System.out.println("слънчево"); break;
            case "rainy": System.out.println("дъждовно"); break;
            case "snowy": System.out.println("снежно"); break;
            case "foggy": System.out.println("мъгливо"); break;
            default: System.out.println("There isn't such word!"); break;
        }
    }
}
