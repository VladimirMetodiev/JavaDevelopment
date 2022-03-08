package oopExercises.forum;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String author;
    private int titleLimitation = 60;
    private String title;
    private List<Message> messages = new ArrayList<>();

    public Topic(String author, String title, String text) {
        this.author = author;
        if(title.length() > titleLimitation)
            throw new IllegalArgumentException(String.format("The title can be up to %d characters in length.", titleLimitation));
        this.title = title;
        messages.add(new Message(author, text));
    }

    public Topic(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String name, String surname) {
        this.author = String.format("%s %s", name, surname);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleLimitation() {
        return titleLimitation;
    }

    public void setTitleLimitation(int titleLimitation) {
        this.titleLimitation = titleLimitation;
    }

    public void editsTheTopicMessage(int index, String author, String title, String text) {
        if(title.length() > titleLimitation)
            throw new IllegalArgumentException(String.format("The title can be up to %d characters in length.", titleLimitation));
        if(this.author.equals(author)) {
            this.setTitle(title);
            messages.get(index).edits(author, text);
        }
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(String author, String text, int number) {
        messages.get(number).edits(author, text);
    }

    public void setNewMessages(Message message) {
        messages.add(message);
    }

    public int getSize() {
        return messages.size();
    }

    public void display() {
        System.out.printf("%s [%d message(s)]%n", title.toUpperCase(), this.getSize());
        System.out.printf("[%s]%n", author);
        System.out.println("--------------------------------------------------");
        System.out.println(messages.get(0));
        printLine();

        for (int index = 1; index < messages.size(); index++) {
            System.out.printf("[%d] [%s]%n", index, messages.get(index).getAuthor());
            System.out.printf("%s%n",messages.get(index));
            printLine();
        }
    }

    private void printLine() {
        System.out.println("--------------------------------------------------\n");
    }
}
