package oop.validation;

public class Book {
    private String bookTitle;
    private String authorName;
    private String authorSurname;
    private int pages;

    public Book(String bookTitle, String authorNames, int pages) {
        this.setBookTitle(bookTitle);
        this.setAuthorNames(authorNames);
        this.setPages(pages);
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle.length() < 3) throw new IllegalArgumentException("This is not a title.");
        this.bookTitle = bookTitle;
    }

    public void setAuthorNames(String authorNames) {
        String[] names = authorNames.split("\\s+");
        if(names.length < 2 || names[0].length() < 2 || names[1].length() < 2) throw new IllegalArgumentException("This is not a name.");
        this.authorName = names[0];
        this.authorSurname = names[1];
    }

    public void setPages(int pages) {
        if(pages < 1) throw new IllegalArgumentException("Pages can't be zero or negative.");
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s [%d p.]", authorName, authorSurname,  bookTitle, pages);
    }
}
