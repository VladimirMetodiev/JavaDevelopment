package map;

import java.util.*;

public class PrintMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        System.out.println("Enter the number of people");
        int num = Integer.parseInt(input.nextLine());

        System.out.println("Enter a number and a name:");
        for (int a = 0 ; a < num; a++){
            map.put(input.nextInt(), input.nextLine().trim());
        }

        if(map.size() > 1) System.out.printf("There are %d people.%n%n", map.size());
        else if(map.size() == 1)System.out.printf("There is %d person.%n%n", map.size());
        else System.out.println("There aren't any people.\n");

        if(!map.isEmpty()){
            System.out.println("Print with for loop - variant 1");
            for(int element : map.keySet()){
                System.out.println(element + " - " + map.get(element));
            }


            System.out.println("\nPrint with for loop - variant 2");
            for(Map.Entry<Integer, String> element : map.entrySet()){
                System.out.printf("%d - %s%n", element.getKey(), element.getValue());
            }


            System.out.println("\nPrint with an iterator");
            /*
             * Мога да създам Map итератор по следният начин:
             * Iterator<Entry<Integer, String>> mapIterator = map.entrySet().iterator();
             * Трябва да импортирам: java.util.Map.Entry;
             * и да използвам while-loop
             */
            Set set = map.entrySet();
            Iterator it = set.iterator();

            while(it.hasNext()) {
                Map.Entry mEntry = (Map.Entry)it.next();
                System.out.printf("%s - %s%n", mEntry.getKey(), mEntry.getValue());
            }


            System.out.println("\nPrint with Stream API");
            map.forEach((key, value)-> System.out.printf("%d = %s%n", key, value));
            //map.entrySet().forEach(e -> System.out.printf("%d - %s%n", e.getKey(), e.getValue()));
            //map.forEach((key, value) -> System.out.println(key + " - " + value));
            //map.entrySet().forEach(System.out::println);
        }
    }
}



//Test

//4
//1 Vladimir
//4 Joanne
//2 Anna
//3 James
