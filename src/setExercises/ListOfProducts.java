package setExercises;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        ArrayList<String> products = new ArrayList<>();

        for (int a = 0; a < number; a++) {
            products.add(input.nextLine());
        }

        TreeSet<String> productList = new TreeSet<>(products);
        Iterator<String> iterator = productList.iterator();

        int counter = 1;

        while(iterator.hasNext()) {
            System.out.printf("%d.%s%n", counter++, iterator.next());
        }
    }
}



//Condition

//Read a number n and n lines of products. Print a numbered list of all the products ordered by name.



//Test

//Input
//4
//Potatoes
//Tomatoes
//Onions
//Apples

//Output
//1.Apples
//2.Onions
//3.Potatoes
//4.Tomatoes
