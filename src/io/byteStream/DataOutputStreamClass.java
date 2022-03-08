package io.byteStream;

import java.io.*;

public class DataOutputStreamClass {
    public static void main(String[] args) throws IOException {

        DataOutputStream dos = null;
        DataInputStream dis = null;
        InputStreamReader isr = null;
        StringBuilder expression = new StringBuilder();
        String name = "", surname = "";
        char letter;
        int age;
        double height;
        boolean married;

        try {
            isr = new InputStreamReader(System.in);
            while ((letter = (char)isr.read()) != (char)10){
                expression.append(letter);
            }

            name = expression.toString();
            expression.setLength(0);

            while ((letter = (char)isr.read()) != (char)10){
                expression.append(letter);
            }

            surname = expression.toString();
            expression.setLength(0);

            while ((letter = (char)isr.read()) != (char)10){
                expression.append(letter);
            }

            age = Integer.parseInt(expression.toString());
            expression.setLength(0);

            while ((letter = (char)isr.read()) != (char)10){
                expression.append(letter);
            }

            height = Double.parseDouble(expression.toString());
            expression.setLength(0);

            while ((letter = (char)isr.read()) != (char)10){
                expression.append(letter);
            }

            married = expression.toString().equals("true");
            expression.setLength(0);
        }
        finally {
            if(isr != null) isr.close();
        }

        Person person = new Person(name, surname, age, height, married);

        try {
            dos = new DataOutputStream(new FileOutputStream("text\\Data.bin", true));

            dos.writeUTF(person.name);
            dos.writeUTF(person.surname);
            dos.writeInt(person.age);
            dos.writeDouble(person.height);
            dos.writeBoolean(person.married);
            System.out.println("File has been written.");
        }
        finally {
            if(dos != null) dos.close();
        }

        try {
            dis = new DataInputStream(new FileInputStream("text\\Data.bin"));

            while (true) {
                name = dis.readUTF();
                surname = dis.readUTF();
                age = dis.readInt();
                height = dis.readDouble();
                married = dis.readBoolean();

                System.out.printf("%s %s is %d years old, %.1f tall and %s married.%n", name, surname, age, height, (married) ? "is" : "isn't");
            }
        }
        catch (EOFException ex1) {
            System.out.println("End of file.");
        }
        catch (FileNotFoundException ex2){
            System.out.println("No such file.");
        }
        finally {
            if(dis != null) dis.close();
        }
    }
}

class Person {
    String name;
    String surname;
    int age;
    double height;
    boolean married;

    public Person(String name, String surname, int age, double height, boolean married) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}



//Tests

//Konstantin
//Petrov
//35
//182.5
//true

//Anna
//Dimitrova
//38
//170
//false

//Victoria
//Todorova
//32
//168.5
//false

//Liubomir
//Stoilov
//25
//176.5
//false
