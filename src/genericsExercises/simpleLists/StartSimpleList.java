package genericsExercises.simpleLists;

import java.util.Scanner;

public class StartSimpleList<T> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SimpleList<String> words = new SimpleList<>();
        String command, word;
        int index;

        SimpleList.getMessage();

        while (!(command = input.nextLine().toLowerCase()).equals("end")){
            switch (command){
                case "size": System.out.println(words.size()); break;
                case "add": {
                    System.out.println("Enter a word:");
                    words.add(input.nextLine());
                    break;
                }
                case "get": {
                    System.out.println("Enter an index:");
                    System.out.println(words.get(Integer.parseInt(input.nextLine())));
                    break;
                }
                case "set": {
                    System.out.println("Enter an index:");
                    index = Integer.parseInt(input.nextLine());
                    System.out.println("Enter a word:");
                    word = input.nextLine();
                    words.set(index, word);
                    break;
                }
                case "remove": {
                    System.out.println("Enter an index:");
                    words.remove(Integer.parseInt(input.nextLine()));
                    break;
                }
                case "insert": {
                    System.out.println("Enter an index:");
                    index = Integer.parseInt(input.nextLine());
                    System.out.println("Enter a word:");
                    word = input.nextLine();
                    words.insert(index, word);
                    break;
                }
                case "find": {
                    System.out.println("Enter a word:");
                    System.out.println(words.find(input.nextLine()));
                    break;
                }
                case "print": {
                    System.out.println(words);
                    break;
                }
                default: System.out.println("Wrong command!"); break;
            }

            SimpleList.getMessage();
        }
    }
}
