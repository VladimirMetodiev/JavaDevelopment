package oopExercises.bookshop;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Bookshop {
    private static Scanner input = new Scanner(System.in);
    private static String title;
    private static ArrayList<Author> authors;

    public static void main(String[] args) {
        ArrayList<Book> allBooks = new ArrayList<>();
        File file = new File("src\\oopExercises\\bookshop\\Store.txt");
        String command;

        if(file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader("src\\oopExercises\\bookshop\\Store.txt"))) {
                while ((command = reader.readLine()) != null) {
                    authors = new ArrayList<>();
                    if(command.startsWith("<1>")) {
                        allBooks.add(new Book());
                        allBooks.get(allBooks.size() - 1).setTitle(command.substring(3));
                    }
                    if(command.startsWith("<2>")) {
                        command = command.substring(3);
                        List<String> currentList = Arrays.stream(command.split(":")).collect(Collectors.toList());
                        for(String str : currentList) {
                            authors.add(new Author(str.substring(0, str.indexOf(" ")), str.substring(str.indexOf(" ") + 1)));
                        }
                        allBooks.get(allBooks.size() - 1).setAuthors(authors);
                    }
                    if(command.startsWith("<3>") && !command.substring(3).equals("-1.0")) {
                        allBooks.get(allBooks.size() - 1).setPrice(Double.parseDouble(command.substring(3)));
                    }
                    if(command.startsWith("<4>") && !command.substring(3).equals("-1")) {
                        allBooks.get(allBooks.size() - 1).setIssueYear(Integer.parseInt(command.substring(3)));
                    }
                    if(command.startsWith("<5>") && !command.substring(3).equals("0")) {
                        allBooks.get(allBooks.size() - 1).setQuantity(Integer.parseInt(command.substring(3)));
                    }
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        getMessage();

        while(!(command = input.nextLine()).equals("end")) {
            switch(command) {
                case "add a title": addATitle(allBooks); break;
                case "add a book": addABook(allBooks); break;
                case "add": add(allBooks); break;
                case "check up": checkUp(allBooks); break;
                case "sell": sell(allBooks); break;
                case "print": print(allBooks); break;
                case "delete": delete(allBooks); break;
                default: System.out.println("Wrong command!"); break;
            }
            getMessage();
        }

        Collections.sort(allBooks);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\oopExercises\\bookshop\\Store.txt"))) {
            for(int y = 0; y < allBooks.size(); y++) {
                command = "<1>" + allBooks.get(y).getTitle();
                writer.write(command);
                writer.newLine();
                for(int z = 0; z < allBooks.get(y).getAuthors().size(); z++) {
                    if(z == 0) {
                        if(z < allBooks.get(y).getAuthors().size() - 1) {
                            command = "<2>" + allBooks.get(y).getAuthors().get(z).getName() + " " + allBooks.get(y).getAuthors().get(z).getSurname() + ":";
                        }
                        else {
                            command = "<2>" + allBooks.get(y).getAuthors().get(z).getName() + " " + allBooks.get(y).getAuthors().get(z).getSurname();
                        }
                    }
                    else if(z < allBooks.get(y).getAuthors().size() - 1) {
                        command = "" + allBooks.get(y).getAuthors().get(z).getName() + " " + allBooks.get(y).getAuthors().get(z).getSurname() + ":";
                    }
                    else {
                        command = "" + allBooks.get(y).getAuthors().get(z).getName() + " " + allBooks.get(y).getAuthors().get(z).getSurname();
                    }
                    writer.write(command);
                }
                writer.newLine();
                command = "<3>" + allBooks.get(y).getPrice();
                writer.write(command);
                writer.newLine();
                command = "<4>" + allBooks.get(y).getIssueYear();
                writer.write(command);
                writer.newLine();
                command = "<5>" + allBooks.get(y).getQuantity();
                writer.write(command);
                writer.newLine();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void getMessage() {
        System.out.println("Choose: \"add a title\", \"add a book\", \"add\", \"check up\", \"sell\", \"print\", \"delete\", \"end\"");
    }

    private static void addATitle(ArrayList<Book> allBooks) {
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            if (!checkUpTheBook(allBooks, title, authors)) {
                allBooks.add(new Book(title, authors));
            }
            else {
                System.out.println("The title is available.");
            }
        }
    }

    private static void addABook(ArrayList<Book> allBooks) {
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            if (!checkUpTheBook(allBooks, title, authors)) {
                allBooks.add(new Book(title, authors));
            }
        }
        for(int f = 0; f < allBooks.size(); f++) {
            if(allBooks.get(f).getTitle().equals(title) && checkUpAuthors(allBooks, f, authors)) {
                if(allBooks.get(f).getIssueYear() == -1) {
                    int issueYear = -1;
                    while (issueYear == -1) {
                        System.out.println("Enter year of issue");
                        try {
                            issueYear = Integer.parseInt(input.nextLine());
                            allBooks.get(f).setIssueYear(issueYear);
                        } catch (NumberFormatException ex) {
                            issueYear = -1;
                        } catch (IllegalArgumentException ex) {
                            issueYear = -1;
                        }
                    }
                }
                if(allBooks.get(f).getPrice() == -1) {
                    double price = 0.0;
                    while (price <= 0) {
                        System.out.println("Enter a price:");
                        try {
                            price = Double.parseDouble(input.nextLine());
                        } catch (NumberFormatException ex) {
                            System.out.println("This isn't a price.");
                        } catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    allBooks.get(f).setPrice(price);
                }
                int quantity = 0;
                while(quantity <= 0) {
                    System.out.println("Enter quantity:");
                    try {
                        quantity = Integer.parseInt(input.nextLine());
                    }
                    catch (NumberFormatException ex) {
                        System.out.println("This isn't quantity.");
                    }
                    catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                allBooks.get(f).setQuantity(allBooks.get(f).getQuantity() + quantity);
            }
        }
    }

    private static void add(ArrayList<Book> allBooks) {
        boolean flag = false;
        int number = -1;
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            for (int m = 0; m < allBooks.size(); m++) {
                if (allBooks.get(m).getTitle().equals(title) && checkUpAuthors(allBooks, m, authors)) {
                    System.out.println("Enter the count of books which you want to add:");
                    while (number < 0) {
                        try {
                            number = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Wrong count!");
                        }
                    }
                    allBooks.get(m).setQuantity(allBooks.get(m).getQuantity() + number);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) {
            System.out.println("The book wasn't found.");
        }
        else {
            if(number == 1) System.out.println("1 book was added.");
            else System.out.printf("%d book(s) were added.%n", number);
        }
    }

    private static void checkUp(ArrayList<Book> allBooks) {
        boolean flag = false;
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            for (int m = 0; m < allBooks.size(); m++) {
                if (allBooks.get(m).getTitle().equals(title) && checkUpAuthors(allBooks, m, authors)) {
                    System.out.println(allBooks.get(m));
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) System.out.println("The book wasn't found.");
    }

    private static boolean checkUpTheBook(ArrayList<Book> allBooks, String title, ArrayList<Author> authors) {
        for(int a = 0; a < allBooks.size(); a++) {
            if(allBooks.get(a).getTitle().equals(title) && checkUpAuthors(allBooks, a, authors)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUpAuthors(ArrayList<Book> allBooks, int index, ArrayList<Author> authors) {
        if(allBooks.get(index).getAuthors().size() != authors.size()) {
            return false;
        }
        for(int b = 0; b < authors.size(); b++) {
            if(!allBooks.get(index).getAuthors().get(b).getName().equals(authors.get(b).getName()) ||
                    !allBooks.get(index).getAuthors().get(b).getSurname().equals(authors.get(b).getSurname())) {
                return false;
            }
        }
        return true;
    }

    private static void sell(ArrayList<Book> allBooks) {
        boolean flag = false;
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            for (int n = 0; n < allBooks.size(); n++) {
                if (allBooks.get(n).getTitle().equals(title) && checkUpAuthors(allBooks, n, authors) && allBooks.get(n).getQuantity() > 0) {
                    allBooks.get(n).setQuantity(allBooks.get(n).getQuantity() - 1);
                    System.out.println("One book was sold.");
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) System.out.println("The book wasn't found.");
    }

    private static void delete(ArrayList<Book> allBooks) {
        getInfo();
        if(!title.isEmpty() && !authors.isEmpty()) {
            for (int p = 0; p < allBooks.size(); p++) {
                if (allBooks.get(p).getTitle().equals(title) && checkUpAuthors(allBooks, p, authors)) {
                    allBooks.remove(p);
                    break;
                }
            }
        }
    }

    private static void print(ArrayList<Book> allBooks) {
        Collections.sort(allBooks);
        for(Book book : allBooks) System.out.println(book);
    }

    private static void getInfo() {
        System.out.println("Enter a title:");
        title = input.nextLine();
        if(!title.isEmpty()) {
            System.out.println("Enter count of authors:");
            int count;
            try {
                count = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Wrong count!");
                count = -1;
            }
            authors = new ArrayList<>();
            for (int e = 0; e < count; e++) {
                System.out.println("Enter a name:");
                String name = input.nextLine();
                System.out.println("Enter a surname:");
                String surname = input.nextLine();
                if(!name.isEmpty() && !surname.isEmpty()) {
                    authors.add(new Author(name, surname));
                }
            }
        }
    }
}


//Java: A Beginner's Guide - Herbert Schildt - 2018 - $39.98
//Introduction to Programming in Java - Robert Sedgewick, Kevin Wayne - 2017 - $35.99
//Java Persistence API и Hibernate - Christian Bauer, Gavin King, Gary Gregory - 2015 - $58.0
//Spring in Action - Craig Walls - 2016 - $39.76
//Algorithms - Robert Sedgewick - 2011 - $68.55
//Effective Java - Joshua Bloch - 2018 - $40.0
//Java Generics and Collections - Maurice Naftalin, Philip Wadler - 2007 - $25.0
//Java Threads. Understanding and Mastering Concurrent Programming - Scott Oaks, Henry Wong - 2004 - $38.0
