package oop.validation;

import java.util.ArrayList;
import java.util.Scanner;

public class StartBookLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Book> library = new ArrayList<>();
        String title, author;
        int pages;

        getMessage();

        while(!(input.nextLine()).equalsIgnoreCase("end")) {
            System.out.println("Enter a title:");
            title = input.nextLine();
            System.out.println("Enter an author:");
            author = input.nextLine();
            System.out.println("Enter pages:");
            pages = Integer.parseInt(input.nextLine());

            try {
                library.add(new Book(title, author, pages));
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            getMessage();
        }

        for(Book book : library) {
            System.out.println(book);
        }
    }

    private static void getMessage() {
        System.out.println("If you want to finish, write \"end\". If you want to add a book, write \"add\".");
    }
}



//Test

//add
//Beginning JavaScript
//Jeremy McPeak
//768
//add
//Ajax on Java
//Steven Olson
//222
//end

