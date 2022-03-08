package oopExercises.forum;

public class Message {
    private String author;
    private int limitation = 500;
    private String text;


    public Message(String author, String text) {
        this.author = author;
        if(text.length() > limitation)
            throw new IllegalArgumentException(String.format("The text can be up to %d characters in length.", limitation));
        this.text = text;
    }

    public void edits(String author, String text) {
        if(this.author.equals(author)) {
            if (text.length() > limitation)
                throw new IllegalArgumentException(String.format("The text can be up to %d characters in length.", limitation));
            this.text = text;
        }
        else {
            System.out.println("You do not have access!");
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public int getLimitation() {
        return limitation;
    }

    public void setLimitation(int limitation) {
        this.limitation = limitation;
    }

    @Override
    public String toString() {
        return String.format("%s", text);
    }
}
