package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterfaceStream {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 26, 27, 28, 30));
        ArrayList<Long> listOfLongElements = new ArrayList<>(Arrays.asList(50L, 600L, 300L, 500L, 30L, 60L, 50L, 6000L, 3000L, 600L, 500L, 60L, 5000L, 3000L, 50L));
        LinkedList<String> countryList = new LinkedList<>(Arrays.asList("Argentina", "Chile", "Uruguay", "Paraguay", "Brazil", "Bolivia", "Peru", "Ecuador", "Colombia", "Venezuela"));
        ArrayList<Double> emptyList = new ArrayList<>();
        int[] myArray = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};



        System.out.println("Method .stream(), .map(), .collect()");

        List<Integer> otherList = myList.stream().map(element -> element % 2 != 0 ? element * (-1) : element).collect(Collectors.toList());
        System.out.println(otherList);
        Set<Integer> otherSet = myList.stream().map(element -> element % 2 != 0 ? element * (-1) : element).collect(Collectors.toSet());
        System.out.println(otherSet);
        int[] currentArray = myList.stream().mapToInt(element -> element % 2 != 0 ? element * (-1) : element).toArray();
        System.out.println(Arrays.toString(currentArray));



        System.out.println("\nMethod .filter()");
        System.out.println(myList.stream().filter(x -> x >=10 && x <= 20).collect(Collectors.toList()));



        System.out.println("\nMethod .forEach()");

        myList.forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(myArray).forEach(e -> {e *= 2; System.out.print(e + " ");});
        System.out.println();
        countryList.stream().filter(str -> str.startsWith("A")).forEach(System.out::println); // Референция на метод
        myList.forEach(Auxiliary::manipulate); // Референция към метода manipulate на класът Auxiliary
        System.out.println();



        System.out.println("\nMethod .of()");

        Stream<Integer> stream = Stream.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();
        Long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(e -> e > 0).count();
        System.out.println(count);



        System.out.println("\nMethod .reduce()");

        int sum = Arrays.stream(myArray).reduce((accumulator, element) -> accumulator += element).getAsInt();       // Методът .reduce() връща обект от тип Optional<T>
        System.out.println(sum);

        Optional<Double> op = emptyList.stream().reduce((accumulator, element) -> accumulator *= element);
        double currentRealNumber;

        if(op.isPresent()) {
            currentRealNumber = op.get();
            System.out.println(currentRealNumber);
        }
        else {
            System.out.println("Null element");
        }

        currentRealNumber = emptyList.stream().reduce(1.0, (accumulator, element) -> accumulator *= element);
        System.out.println(currentRealNumber);

        System.out.println(countryList.stream().reduce((a, e) -> a.concat(" - ").concat(e)).get());



        System.out.println("\nMethod .sorted()");

        DoubleStream.of(19.6, 43.78, -154.7, -3.0, 261.3, 79.2, -15.3, 0.0, 59.1, 98.34).sorted().forEach(e -> System.out.print(e +" "));
        System.out.println();

        Stream.of(19.6, 43.78, -154.7, -3.0, 261.3, 79.2, -15.3, 0.0, 59.1, 98.34).sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e +" "));
        System.out.println();

        Stream<Labourer> labourers = Stream.of(new Labourer("Ivan", 12), new Labourer("Stephan", 2), new Labourer("Teodor", 5), new Labourer("Alexander", 6));
        //labourers.sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(e -> System.out.printf("%s - %d year(s)%n", e.getName(), e.getLengthOfService()));
        labourers.sorted((a, b) -> b.getLengthOfService() - a.getLengthOfService()).forEach(e -> System.out.printf("%s has %d year(s) length of service.%n", e.getName(), e.getLengthOfService()));



        System.out.println("\nMethod .distinct()");
        System.out.println(listOfLongElements.stream().distinct().collect(Collectors.toList()));



        System.out.println("\nMethod .count()");

        System.out.println(myList.stream().count());
        System.out.println(listOfLongElements.stream().distinct().count());
        System.out.println(otherSet.stream().count());



        System.out.println("\nMethod .flatMap()");

        Brigade b1 = new Brigade("The hard workers");
        Brigade b2 = new Brigade("The cunning");
        b1.addWorker(new Labourer("Vladimir", 6));
        b1.addWorker(new Labourer("Dragomir", 4));
        b1.addWorker(new Labourer("Liubomir", 8));
        b2.addWorker(new Labourer("Peter", 7));
        b2.addWorker(new Labourer("Teodor", 5));
        b2.addWorker(new Labourer("Stephan", 6));
        b2.addWorker(new Labourer("Ivan", 8));
        List<Brigade> brigadeList = new ArrayList<>();
        brigadeList.add(b1);
        brigadeList.add(b2);
        brigadeList.stream()
                .peek(b -> System.out.println(b.name))
                .flatMap(b -> b.getWorkers().stream())
                .forEach(e -> System.out.println(e.getName()));



        System.out.println("\nMethod .collect(), Collectors.groupingBy() Collectors.partitioningBy()");

        List<Labourer> lb = brigadeList.stream().flatMap(b -> b.getWorkers().stream()).collect(Collectors.toList());
        lb.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();

        // Методи на клас Collectors

        Map<Integer, List<Labourer>> map1 = brigadeList.stream()
                .flatMap(b -> b.getWorkers().stream())
                .map(el -> {el.setName(el.getName().toUpperCase()); return el;})
                .collect(Collectors.groupingBy(el -> el.getLengthOfService()));                 // Collectors.groupingBy() - групира по даден признак

        for(Map.Entry<Integer, List<Labourer>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        Map<Boolean, List<Labourer>> map2 = brigadeList.stream()
                .flatMap(b -> b.getWorkers().stream())
                .collect(Collectors.partitioningBy(el -> el.getLengthOfService() > 6));         // Collectors.partitioningBy - разделя по даден признак, връща или стойност true или false

        for(Map.Entry<Boolean, List<Labourer>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }



        System.out.println("\nMethod .findFirst()");

        Stream<Integer> s10 = Stream.of(90, 50, 100, 110, 30, 70, 160, 290, 210, 180);
        Optional<Integer> op10 = s10.sorted(Comparator.reverseOrder()).findFirst();

        if(op10.isPresent()){
            System.out.println(op10.get());
        }
        else {
            System.out.println("There isn't any number.");
        }



        System.out.println("\nMethod .limit()");
        listOfLongElements.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).forEach(e -> System.out.printf("%d%n", e));



        System.out.println("\nMethod .skip()");
        listOfLongElements.stream().sorted(Comparator.reverseOrder()).distinct().skip(3).forEach(e -> System.out.printf("%d%n", e));



        // Методите mapToInt, mapToLong и mapToDouble преобразуват потоци от обекти в потоци от съответните примитивни типове.
        // Методът boxed се използва за преобразуване на примитивен тип в клас обвивка.

        System.out.println("\nMethod .mapToInt(), .parseInt(), .mapToDouble(), .parseDouble(), .mapToLong(), .parseLong(), .boxed()");

        String rawMaterial = "4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60";
        int[] numberArray = Arrays.stream(rawMaterial.split(",\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int el : numberArray) { System.out.print(el + " "); }
        System.out.println();
        double[] doubleArray = Arrays.stream(rawMaterial.split(",\\s+")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        for (double el : doubleArray) { System.out.print(el + " "); }
        System.out.println();
        long[] longArray = Arrays.stream(rawMaterial.split(",\\s+")).mapToLong(Long::parseLong).toArray();
        for (long el : longArray) { System.out.print(el + " "); }
        System.out.println();

        // Алтернативен подход --> методът .boxed() взима значение от примитивен тип и го опакова в обвиващ тип
        List<Integer> integerList = b1.getWorkers().stream().mapToInt(e -> e.getLengthOfService()).boxed().collect(Collectors.toList());
        integerList.forEach(e -> System.out.print(e + " "));
        System.out.println();
        List<Double> doubleList = b2.getWorkers().stream().mapToDouble(e -> e.getLengthOfService()).boxed().collect(Collectors.toList());
        doubleList.forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("\nMethod .range(), .rangeClosed()");

        IntStream.range(1, 11).forEach(e -> System.out.print(e + " "));
        System.out.println();
        IntStream.rangeClosed(1, 15).forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("\nMethod .peek()");

        listOfLongElements.stream()
                .peek(el -> System.out.format("> before distinct: %d%n", el))
                .distinct()
                .peek(el -> System.out.format(">> before map: %d%n", el))
                .map(el -> el * el)
                .forEach(el -> System.out.format(">>> after map: %d%n%n", el));



        System.out.println("\nOther methods: .concat()");

        Stream<Integer> s1 = Stream.of(1, 12, 33);
        Stream<Integer> s2 = Stream.of(-122, 42, 73, 54);
        Stream<Integer> s3 = Stream.concat(s1, s2);
        s3.forEach(e -> System.out.print(e + " "));
        System.out.println();



        System.out.println("\nOther methods: .min(), .max(), .sum(), .average()");

        int min = myList.stream().min((x, y) -> x - y).get();           // Методът .min() връща обект от тип Optional<T>
        System.out.println(min);
        int max = myList.stream().max((x, y) -> x - y).get();           // Методът .max() връща обект от тип Optional<T>
        System.out.println(max);
        sum = myList.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        min = Arrays.stream(myArray).min().getAsInt();
        System.out.println(min);
        max = Arrays.stream(myArray).max().getAsInt();
        System.out.println(max);
        int sumOfNumbers = Arrays.stream(myArray).sum();
        System.out.println(sumOfNumbers);
        currentRealNumber = Arrays.stream(myArray).average().getAsDouble();
        System.out.println(currentRealNumber);
    }
}



class Auxiliary {
    public static void manipulate(int num){
        num += 10;
        System.out.print(num + " ");
    }
}



class Labourer {
    private String name;
    int lengthOfService;

    public Labourer(String name, int lengthOfService) {
        this.name = name;
        this.lengthOfService = lengthOfService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthOfService() {
        return lengthOfService;
    }

    @Override
    public String toString() {
        return "Labourer --> " +
                "name: '" + name + '\'' +
                ", service = " + lengthOfService +
                ';';
    }
}



class Brigade {
    String name;
    List<Labourer> workers;

    public Brigade(String name) {
        this.name = name;
        workers = new ArrayList<>();
    }

    public void addWorker(Labourer labourer){
        workers.add(labourer);
    }

    public List<Labourer> getWorkers () {
        return workers;
    }
}