package io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectInputStreamClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> people = new LinkedHashMap<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\io\\serialization\\people.bin"))) {
            people = (LinkedHashMap<Integer, String>) ois.readObject();
        }
        catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        }
        catch (IOException ex2) {
            ex2.printStackTrace();
        }
        catch (ClassNotFoundException ex3) {
            ex3.printStackTrace();
        }

        for(Map.Entry<Integer, String> person : people.entrySet()) {
            System.out.printf("[%d] %s%n", person.getKey(), person.getValue());
        }
    }
}
