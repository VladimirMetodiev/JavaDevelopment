package oopExercises.bookshop;

import java.util.ArrayList;

public class Book implements Comparable<Book> {
    private String title;
    private ArrayList<Author> authors;
    private double price = -1.0;
    private int issueYear = -1;
    private int quantity = 0;

    public Book() {
    }

    public Book(String title, ArrayList<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0) throw new IllegalArgumentException("Wrong price!");
        this.price = price;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        if(issueYear < 2000) throw new IllegalArgumentException();
        this.issueYear = issueYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) throw new IllegalArgumentException("Wrong quantity!");
        this.quantity = quantity;
    }

    private String printAuthors() {
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < authors.size(); a++) {
            if(a < authors.size() - 1) sb.append(authors.get(a) + ", ");
            else sb.append(authors.get(a));
        }
        return "" + sb;
    }

    @Override
    public String toString() {
        return String.format("Book: %s%nAuthor: %s%nYear of issue: %s%nQuantity: %d%nPrice: %.2f%n", title, printAuthors(), issueYear != -1 ? issueYear : " / ", quantity, price != -1 ? price : 0);
    }

    @Override
    public int compareTo(Book book) {
        return this.title.compareTo(book.title);
    }
}
