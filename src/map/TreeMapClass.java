package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        // Създаване на TreeMap
        TreeMap<Integer, Trader> traders = new TreeMap<>();


        // Проверка дали е празен
        System.out.println("Is it empty? " + traders.isEmpty());
        System.out.println("------------------------------------------------------------");


        // Добавяне на елементи
        traders.put(1, new Trader("Vladimir", "Metodiev", 92.35));
        traders.put(6, new Trader("Dobromir", "Melnishki", 74.2));
        traders.put(4, new Trader("Teodor", "Kamenov", 68.84));
        traders.put(8, new Trader("Nicola", "Petrov", 78.93));
        traders.put(2, new Trader("Boris", "Michailov", 86.55));

        HashMap<Integer, Trader> temporary = new HashMap<>();
        temporary.put(7, new Trader("Atanas", "Penev", 77.29));
        temporary.put(9, new Trader("Ralitza", "Ivanova", 81.92));
        traders.putAll(temporary);

        for(Map.Entry<Integer, Trader> entry : traders.entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // Добавяне на елемент но само ако такъв елемент не е наличен в колекцията - метод .putIfAbsent()
        traders.putIfAbsent(1, new Trader("Diana", "Todorova", 73.28));
        traders.putIfAbsent(3, new Trader("Peter", "Kamenodelski", 75.67));
        traders.putIfAbsent(5, new Trader("Alexander", "Dimitrov", 88.45));
        for(Map.Entry<Integer, Trader> entry : traders.entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // null НЕ може да бъде използвана нито като ключ, нито като стойност, защото ще бъде хвърлена java.lang.NullPointerException


        // Замяна на елементи - става като на елемента с определен ключ, задам нова стойност, или чрез метода .replace()
        traders.put(4, new Trader("Svetoslav", "Galitzki", 89.49));
        traders.replace(6, new Trader("Valentin", "Georgiev", 82.9));
        for(Map.Entry<Integer, Trader> entry : traders.entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // Размер на TreeMap-ът - метод .size()
        System.out.println("Size: " + traders.size());
        System.out.println("------------------------------------------------------------");


        // Взимане на стойността на елемент - метод .get() и ключът на елемента
        System.out.println(traders.get(1).getName()+ " " + traders.get(1).getSurname());
        System.out.println(traders.get(-1));
        System.out.println("------------------------------------------------------------");


        // Премахване на елемент - метод .remove() и ключът на елемента
        traders.remove(3);
        for(Map.Entry<Integer, Trader> entry : traders.entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // В TreeMap елементите са сортирани по ключ в нарастващ порядък, обръщането в низходящ порядък става с метода .descendingMap()
        // Методът .descendingMap() връща резултат от тип java.util.NavigableMap<K, V>
        for(Map.Entry<Integer, Trader> entry : traders.descendingMap().entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // За да взема елементите, които имат ключ равен или по-голям от зададен ключ, използвам метода .tailMap()
        for(Map.Entry<Integer, Trader> entry : traders.tailMap(6).entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // За да взема елементите, които имат ключ по-малък от зададеният ключ, използвам метода .headMap()
        for(Map.Entry<Integer, Trader> entry : traders.headMap(6).entrySet()) System.out.printf("ID[%d] %s %s = %.2f%%%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getSurname(), entry.getValue().getResults());
        System.out.println("------------------------------------------------------------");


        // За да взема първият елемент използвам метода .firstEntry(), а за да взема последният елемент използвам метода .lastEntry()
        System.out.printf("%s %s%n", traders.firstEntry().getValue().getName(), traders.firstEntry().getValue().getSurname());
        System.out.printf("%s %s%n", traders.lastEntry().getValue().getName(), traders.lastEntry().getValue().getSurname());
        System.out.println("------------------------------------------------------------");


        // Проверка дали съдържа ...
        System.out.println("Does it contain the key: " + traders.containsKey(1));
        System.out.println("Does it contain the value: " + traders.containsValue(new Trader("Vladimir", "Metodiev", 92.35)));
        System.out.println("------------------------------------------------------------");


        // Когато за ключ използвам обект на някакъв клас, за да сравня елементите, класът задължително трябва да имплементира интерфейс Comparable
        TreeMap<Trader, Double> profit = new TreeMap<>();
        profit.put(new Trader("Vladimir", "Metodiev", 92.35), 554100.0);
        profit.put(new Trader("Svetoslav", "Galitzki", 89.49), 536940.0);
        profit.put(new Trader("Valentin", "Georgiev", 82.9), 497400.0);
        profit.put(new Trader("Peter", "Bogomilov", 82.9), 497400.0);
        profit.put(new Trader("Nicola", "Petrov", 78.93), 473580.0);
        profit.put(new Trader("Nicola", "Ivanov", 78.93), 473580.0);
        profit.put(new Trader("Boris", "Michailov", 86.55), 519300.0);

        profit.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(tr -> System.out.printf("%s %s = $%.2f%n", tr.getKey().getName(), tr.getKey().getSurname(), tr.getValue()));
        System.out.println("------------------------------------------------------------");


        // Взимам всички стойности от TreeMap-ът с методът .values()
        System.out.println("Values: " + profit.values());
        System.out.println("------------------------------------------------------------");
    }
}

class Trader implements Comparable<Trader> {
    private String name;
    private String surname;
    private double results;

    Trader(String name, String surname, double results) {
        this.name = name;
        this.surname = surname;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trader trader = (Trader) obj;
        return Double.compare(trader.results, results) == 0 && Objects.equals(name, trader.name) && Objects.equals(surname, trader.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, results);
    }

    @Override
    public int compareTo(Trader trader) {
        if(this.getResults() > trader.results) {
            return -1;
        }
        else if(this.getResults() < trader.results) {
            return 1;
        }
        else {
            if(this.getName().compareTo(trader.getName()) < 0) {
                return -1;
            }
            else if(this.getName().compareTo(trader.getName()) > 0) {
                return 1;
            }
            else {
                return this.getSurname().compareTo(trader.getSurname());
            }
        }
    }
}
