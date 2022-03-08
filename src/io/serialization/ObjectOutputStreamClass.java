package io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public class ObjectOutputStreamClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> people = new LinkedHashMap<>();
        people.put(100, "Vladimir Metodiev");
        people.put(101, "Anna Dimitrova");
        people.put(102, "Nevena Popova");
        people.put(103, "Teodor Iordanov");
        people.put(104, "Irina Georgieva");
        people.put(105, "Martin Hristov");

        /*
         * Може да бъде сериализиран само обект, който имплементира интерфейс Serializable
         * LinkedHashMap наследява HashMap, който имплементира Serializable
         * Integer наследява Number, който имплементира Serializable
         * String имплементира Serializable
         */

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\io\\serialization\\people.bin"))){
            oos.writeObject(people);
            System.out.println("The object was saved.");
        }
        catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        }
        catch (IOException ex2) {
            ex2.printStackTrace();
        }
    }
}
