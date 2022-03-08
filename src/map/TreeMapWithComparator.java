package map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithComparator {
    public static void main(String[] args) {
        TreeMap<ShopAssistant, Double> experiment = new TreeMap<>(new Comparator<ShopAssistant>() {
            @Override
            public int compare(ShopAssistant shopAssistant1, ShopAssistant shopAssistant2) {
                if(shopAssistant1.surname.compareTo(shopAssistant2.surname) < 0) {
                    return -1;
                }
                else if(shopAssistant1.surname.compareTo(shopAssistant2.surname) > 0) {
                    return 1;
                }
                else {
                    if(shopAssistant1.name.compareTo(shopAssistant2.name) < 0) {
                        return -1;
                    }
                    else if(shopAssistant1.name.compareTo(shopAssistant2.name) > 0) {
                        return 1;
                    }
                    else {
                        // Съвпадението на име и фамилия, означава, че елементът ще бъде презаписан, наличието на 2 елемента с еднакви ключове е невъзможно
                        return shopAssistant1.name.compareTo(shopAssistant2.name);
                    }
                }
            }
        });

        experiment.put(new ShopAssistant("Ivan", "Georgiev"), 12863.25);
        experiment.put(new ShopAssistant("Teodor", "Georgiev"), 8432.62);
        experiment.put(new ShopAssistant("Konstantin", "Georgiev"), 9571.75);
        experiment.put(new ShopAssistant("Ivan", "Penev"), 6684.00);
        experiment.put(new ShopAssistant("Alexander", "Ivanov"), 9348.66);
        experiment.put(new ShopAssistant("Peter", "Trendafilov"), 10582.33);

        // Елементите на на Map-ът вече са сортирани по указаният от мен начин (т.е. по фамилия, а след това по име)
        experiment.entrySet()
                .forEach(a -> System.out.printf("%s %s = %.2f lv.%n", a.getKey().name, a.getKey().surname, a.getValue()));

        System.out.println("------------------------------------------------------------");

        experiment.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(a -> System.out.printf("%s %s = %.2f lv.%n", a.getKey().name, a.getKey().surname, a.getValue()));
    }
}

class ShopAssistant {
    String name;
    String surname;

    ShopAssistant(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}