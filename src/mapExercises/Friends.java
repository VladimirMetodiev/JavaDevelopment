package mapExercises;

import java.util.*;

public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of pairs:");
        int numberOfPairs = Integer.parseInt(input.nextLine());

        TreeMap<String, ArrayList<String>> people = new TreeMap<>();

        System.out.println("Enter a pair of names:");
        for (int a = 0; a < numberOfPairs; a++) {
            String[] names = input.nextLine().split("\\s+");
            addFriends(people, names[0], names[1]);
            addFriends(people, names[1], names[0]);
        }

        for(Map.Entry<String, ArrayList<String>> element : people.entrySet()){
            Collections.sort(element.getValue());
            System.out.println(element.getKey() + " is a friend of : " + String.join(" ", element.getValue()));
        }
    }

    private static void addFriends(Map<String, ArrayList<String>> friends, String firstName, String secondName) {
        if (friends.containsKey(firstName)) {
            if(!friends.get(firstName).contains(secondName)) {
                friends.get(firstName).add(secondName);
            }
        }
        else {
            friends.put(firstName, new ArrayList<>(Collections.singletonList(secondName)));
        }
    }
}



//Original condition

//Въвеждат се няколко реда, с по две думи, които са имената на двама приятели.
//Всяко от двете имена играе ролята на ключ, срещу когото са записани имената на неговите приятели;
//Срещу всяко име може да има повече от един приятел;
//Ключовете трябва да са сортирани във възходящ лексикографски ред;
//Трябва да принтирам имената-ключове, като срещу всеки ключ трябва да са принтирани имената на неговите приятели,
//във възходящ лексикографски ред;



//Test

//Input --> 10
//Vladimir Irina
//Anna Vladimir
//Alex Peter
//Peter Anna
//Vladimir Robert
//Adrian Alex
//Roxana Anna
//Alex Roxana
//Irina Adrian
//Vladimir Alex

//Output
//Adrian is a friend of : Alex Irina
//Alex is a friend of : Adrian Peter Roxana Vladimir
//Anna is a friend of : Peter Roxana Vladimir
//Irina is a friend of : Adrian Vladimir
//Peter is a friend of : Alex Anna
//Robert is a friend of : Vladimir
//Roxana is a friend of : Alex Anna
//Vladimir is a friend of : Alex Anna Irina Robert



//Бележка: за излизане от .hasNext() -> Ctrl+D

//Original solutions - 100/100

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        TreeMap<String, ArrayList<String>> people = new TreeMap<>();
//
//        while (input.hasNext()){
//            String line = input.nextLine();
//            String[] name = line.split("\\s+");
//
//            if(people.containsKey(name[0])){
//                if(!people.get(name[0]).contains(name[1])) {
//                    people.get(name[0]).add(name[1]);
//                }
//            }
//            else{
//                people.put(name[0], new ArrayList<>());
//                people.get(name[0]).add(name[1]);
//            }
//
//            if(people.containsKey(name[1])){
//                if(!people.get(name[1]).contains(name[0])) {
//                    people.get(name[1]).add(name[0]);
//                }
//            }
//            else{
//                people.put(name[1], new ArrayList<>());
//                people.get(name[1]).add(name[0]);
//            }
//        }
//
//        for(Map.Entry<String, ArrayList<String>> element : people.entrySet()){
//            System.out.printf("%s is a friend of : ", element.getKey());
//
//            Collections.sort(element.getValue());
//
//            for(String name : element.getValue()){
//                System.out.print(name + " ");
//            }
//            System.out.println();
//        }
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        TreeMap<String, ArrayList<String>> people = new TreeMap<>();
//
//        while (input.hasNext()){
//            String line = input.nextLine();
//            String[] name = line.split("\\s+");
//
//            if(people.containsKey(name[0])){
//                if(!people.get(name[0]).contains(name[1])) {
//                    people.get(name[0]).add(name[1]);
//                }
//            }
//            else{
//                people.put(name[0], new ArrayList<>());
//                people.get(name[0]).add(name[1]);
//            }
//
//            if(people.containsKey(name[1])){
//                if(!people.get(name[1]).contains(name[0])) {
//                    people.get(name[1]).add(name[0]);
//                }
//            }
//            else{
//                people.put(name[1], new ArrayList<>());
//                people.get(name[1]).add(name[0]);
//            }
//        }
//
//        for(String element : people.keySet()){
//            System.out.printf("%s is a friend of : ", element);
//
//            Collections.sort(people.get(element));
//
//            for(String name : people.get(element)){
//                System.out.print(name + " ");
//            }
//            System.out.println();
//        }
//    }
