package mapExercises;

import java.util.*;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> customers = new TreeMap<>();

        while (input.hasNext()){
            String[] data = input.nextLine().split("\\s+");
            String nameKey = data[0] + " " + data[1];
            String productKey = data[2];
            int quantity = Integer.parseInt(data[3]);

            if(!customers.containsKey(nameKey)){
                customers.put(nameKey, new TreeMap<>());
            }

            if(!customers.get(nameKey).containsKey(productKey)){
                customers.get(nameKey).put(productKey, 0);
            }

            quantity += customers.get(nameKey).get(productKey);
            customers.get(nameKey).put(productKey, quantity);
        }

        for(Map.Entry<String, TreeMap<String, Integer>> person : customers.entrySet()){
            System.out.printf("%s: %n", person.getKey());

            for(Map.Entry<String, Integer> product : person.getValue().entrySet()){
                System.out.printf("    %s %d%n", product.getKey(), product.getValue());
            }
        }
    }
}



//Original condition

//Бъдещето през 2168 г., наличните парични средства са отменени и всички плащания стават безналични.
//Във веригата магазини "Фантастик" е въведена нова, автоматизирана, система за анализ на покупките, на клиенти.
//Всеки магазин, по време на плащането получава от купувача, неговата фамилия и собствено име,
//както и списък с покупките му във формат: име на продукта и количество от продукта.
//Програмата получава като вход символни низове в следния формат: фамилия space име space име на продукт space количество.
//Системата генерира месечен отчет, съдържащ информация за всички клиенти и всички покупки за всеки клиент.
//Клиентите се сортират по азбучен ред, покупките се сортират по азбучен ред по име, в рамките на конкретен клиент.
//Продуктите се принтират с 4 интервала, преди всеки продукт!



//Бележка: за излизане от .hasNext() -> Ctrl+D

//Tests

//Metodiev Vladimir bread 1
//Metodiev Vladimir chicken 1
//Metodiev Vladimir potato 6
//Metodiev Vladimir apple 6
//Dimitrova Anna milk 1
//Dimitrova Anna chocolate 1
//Dimitrova Anna coffee 1
//Dimitrova Anna bread 1
//Dimitrova Anna butter 1
//Iliev Mario orange 2
//Iliev Mario orange 2
//Metodiev Vladimir potato 6
//Metodiev Vladimir cheese 2
//Metodiev Vladimir apple 6
//Petrov Boris bread 1
//Petrov Boris butter 1
//Petrov Boris pork 1
//Petrov Boris egg 6
//Petrov Boris potato 2
//Petrov Boris potato 2
//Petrov Boris potato 2
//Dimitrova Anna tomato 4
//Dimitrova Anna cucumber 2
//Dimitrova Anna chocolate 1
//Dimitrova Anna coffee 1



//Solution

// Работещо решение

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<String, TreeMap<String, Integer>> customers = new TreeMap<>();
//
//        while (input.hasNextLine()){
//            String line = input.nextLine();
//            if(line.isEmpty()) break;
//            String[] data = line.split("\\s+");
//            String nameKey = data[0] + " " + data[1];
//            String productKey = data[2];
//            int quantity = Integer.parseInt(data[3]);
//
//            if(!customers.containsKey(nameKey)){
//                customers.put(nameKey, new TreeMap<>());
//            }
//
//            if(!customers.get(nameKey).containsKey(productKey)){
//                customers.get(nameKey).put(productKey, 0);
//            }
//
//            quantity += customers.get(nameKey).get(productKey);
//            customers.get(nameKey).put(productKey, quantity);
//        }
//
//        for(Map.Entry<String, TreeMap<String, Integer>> person : customers.entrySet()){
//            System.out.printf("%s: %n", person.getKey());
//
//            for(Map.Entry<String, Integer> product : person.getValue().entrySet()){
//                System.out.printf("    %s %d%n", product.getKey(), product.getValue());
//            }
//        }
//    }


// Failed test #4

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        ArrayList<String> surname = new ArrayList<>();
//        ArrayList<String> name = new ArrayList<>();
//        TreeMap<String, String> printNames = new TreeMap<>();
//        TreeMap<String, Integer> printProducts = new TreeMap<>();
//        ArrayList<TreeMap<String, Integer>> products = new ArrayList<>();
//
//        while (input.hasNext()) {
//            String[] data = input.nextLine().split("\\s+");
//
//            if(surname.contains(data[0])){
//                if(products.get(surname.indexOf(data[0])).containsKey(data[2])){
//                    products.get(surname.indexOf(data[0])).put(data[2], (products.get(surname.indexOf(data[0])).get(data[2]) + Integer.parseInt(data[3])));
//                }
//                else{
//                    products.get(surname.indexOf(data[0])).put(data[2], Integer.parseInt(data[3]));
//                }
//            }
//            else{
//                surname.add(data[0]);
//                name.add(data[1]);
//                products.add(new TreeMap<>());
//                products.get(surname.indexOf(data[0])).put(data[2], Integer.parseInt(data[3]));
//            }
//        }
//
//        for(int a = 0; a < surname.size(); a++){
//            printNames.put(surname.get(a), name.get(a));
//        }
//
//        for(Map.Entry<String, String> customer : printNames.entrySet()){
//            System.out.printf("%s %s: %n", customer.getKey(), customer.getValue());
//            printProducts = products.get(surname.indexOf(customer.getKey()));
//
//            for(Map.Entry<String, Integer> article : printProducts.entrySet()){
//                System.out.printf("    %s %d%n", article.getKey(), article.getValue());
//            }
//        }
//    }


// Failed test #4

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        ArrayList<String> surname = new ArrayList<>();
//        ArrayList<String> name = new ArrayList<>();
//        TreeMap<String, String> printNames = new TreeMap<>();
//        TreeMap<String, Integer> printProducts;
//        ArrayList<TreeMap<String, Integer>> products = new ArrayList<>();
//
//        while (input.hasNext()) {
//            String[] data = input.nextLine().split("\\s+");
//
//            if(!surname.contains(data[0])){
//                surname.add(data[0]);
//                name.add(data[1]);
//                products.add(new TreeMap<>());
//            }
//
//            if(!products.get(surname.indexOf(data[0])).containsKey(data[2])){
//                products.get(surname.indexOf(data[0])).put(data[2], 0);
//            }
//
//            products.get(surname.indexOf(data[0])).put(data[2], (products.get(surname.indexOf(data[0])).get(data[2]) + Integer.parseInt(data[3])));
//
//        }
//
//        for(int a = 0; a < surname.size(); a++){
//            printNames.put(surname.get(a), name.get(a));
//        }
//
//        for(Map.Entry<String, String> customer : printNames.entrySet()){
//            System.out.printf("%s %s: %n", customer.getKey(), customer.getValue());
//            printProducts = products.get(surname.indexOf(customer.getKey()));
//
//            for(Map.Entry<String, Integer> article : printProducts.entrySet()){
//                System.out.printf("    %s %d%n", article.getKey(), article.getValue());
//            }
//        }
//    }
