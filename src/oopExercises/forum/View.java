package oopExercises.forum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private static String forumLink = "src\\oopExercises\\forum\\Forum.txt";
    public static void setDataBase(String newDataBase) {
        dataBase = newDataBase;
    }
    private static List<Topic> all = new ArrayList<>();

    public static void startAUserSession(User user) throws IOException {
        Scanner input = new Scanner(System.in);
        getTopics(all);
        printListOfTopics();

        while (true) {
            System.out.println("Choose: \"Topics\", \"Read\", \"New topic\", \"Edit\", \"Comment\" or \"End\".");
            String command = input.nextLine().toLowerCase();
            if(command.equals("end")) {
                save();
                break;
            }

            switch (command) {
                case "topics": {
                    printListOfTopics();
                    break;
                }
                case "read": {
                    System.out.println("Enter the topic:");
                    readTopic(input.nextLine());
                    break;
                }
                case "new topic": {
                    createANewTopic(user);
                    break;
                }
                case "edit": {
                    System.out.println("Enter the topic:");
                    String topic = input.nextLine();
                    System.out.println("Enter the message number:");
                    int number = Integer.parseInt(input.nextLine());
                    edit(topic, number, user);
                    break;
                }
                case "comment": {
                    System.out.println("Enter the topic:");
                    String topic = input.nextLine();
                    comment(topic, user);
                    break;
                }
                default: {
                    System.out.println("Wrong command!");
                    break;
                }
            }
        }
    }

    public static void startAnAdminSession(User user) throws IOException {
        Scanner input = new Scanner(System.in);
        getTopics(all);
        printListOfTopics();

        while (true) {
            System.out.println("Choose: \"Topics\", \"Read\", \"New topic\", \"Edit\", \"Comment\", \"Delete\", \"Status\", \"Statistics\" or \"End\".");
            String command = input.nextLine().toLowerCase();
            if(command.equals("end")) {
                save();
                break;
            }

            switch (command) {
                case "topics": {
                    printListOfTopics();
                    break;
                }
                case "read": {
                    System.out.println("Enter the topic:");
                    readTopic(input.nextLine());
                    break;
                }
                case "new topic": {
                    createANewTopic(user);
                    break;
                }
                case "edit": {
                    System.out.println("Enter the topic:");
                    String topic = input.nextLine();
                    System.out.println("Enter the message number:");
                    int number = Integer.parseInt(input.nextLine());
                    edit(topic, number, user);
                    break;
                }
                case "comment": {
                    System.out.println("Enter the topic:");
                    String topic = input.nextLine();
                    comment(topic, user);
                    break;
                }
                case "delete": {
                    System.out.println("Choose a topic or a message: [topic] or [message]");
                    String current = input.nextLine().toLowerCase();
                    switch (current) {
                        case "topic": {
                            System.out.println("Enter the topic:");
                            String topic = input.nextLine();
                            readTopic(topic);
                            System.out.println("Do you want to delete this topic? [Yes] or [No]");
                            if(input.nextLine().equals("Yes")) {
                                for (int a = 0; a < all.size(); a++) {
                                    if(all.get(a).getTitle().equals(topic)) {
                                        all.remove(a);
                                    }
                                }
                            }
                            break;
                        }
                        case "message": {
                            System.out.println("Enter the topic:");
                            String topic = input.nextLine();
                            System.out.println("Enter the message number:");
                            int number = Integer.parseInt(input.nextLine());
                            for (int a = 1; a < all.size(); a++) {
                                if(all.get(a).getTitle().equals(topic)) {
                                    System.out.println(all.get(a).getMessages().get(number));
                                    System.out.println("Do you want to delete this message? [Yes] or [No]");
                                    if(input.nextLine().equals("Yes")) {
                                        all.get(a).getMessages().remove(number);
                                    }
                                }
                            }
                            break;
                        }
                        default: {
                            System.out.println("Wrong command!");
                            break;
                        }
                    }
                    break;
                }
                case "status": {
                    List<User> users = new ArrayList<>();
                    Main.getUserList(users);

                    System.out.println("Choose a user, enter name and surname:");
                    String data = input.nextLine();
                    String name = data.substring(0, data.indexOf(" "));
                    String surname = data.substring(data.indexOf(" ") + 1);

                    for (int a = 0; a < users.size(); a++) {
                        if(users.get(a).getName().equals(name) && users.get(a).getSurname().equals(surname)) {
                            System.out.println("Enter the new status:");
                            String status = input.nextLine().toLowerCase();
                            switch (status) {
                                case "administrator": users.get(a).setStatus(Status.ADMINISTRATOR); break;
                                case "user": users.get(a).setStatus(Status.USER); break;
                                case "banned": users.get(a).setStatus(Status.BANNED); break;
                                default: System.out.println("Wrong status!"); break;
                            }
                            BufferedWriter writer = new BufferedWriter(new FileWriter(dataBase, false));
                            for (int b = 0; b < users.size(); b++) {
                                writer.write("#");
                                writer.newLine();
                                writer.write(users.get(b).getName());
                                writer.newLine();
                                writer.write(users.get(b).getSurname());
                                writer.newLine();
                                if(users.get(b).getSex().equals(Sex.MALE)) writer.write("M");
                                else writer.write("F");
                                writer.newLine();
                                writer.write("" + users.get(b).getAge());
                                writer.newLine();
                                writer.write(users.get(b).getEmail());
                                writer.newLine();
                                writer.write(users.get(b).getPassword());
                                writer.newLine();
                                writer.write(users.get(b).getStatus().toString());
                                writer.newLine();
                                writer.newLine();
                            }
                            writer.close();
                            System.out.println(users.get(a));
                        }
                    }
                    break;
                }
                case "statistics": {
                    int allAdmin = 0;
                    int allUsers = 0;
                    int banned = 0;

                    List<User> users = new ArrayList<>();
                    Main.getUserList(users);

                    for(User u : users) {
                        if(u.getStatus().equals(Status.ADMINISTRATOR)) ++allAdmin;
                        if(u.getStatus().equals(Status.USER)) ++allUsers;
                        if(u.getStatus().equals(Status.BANNED)) ++banned;
                    }

                    System.out.println("Administrator(s) = " + allAdmin);
                    System.out.println("User(s) = " + allUsers);
                    System.out.println("Banned = " + banned);

                    System.out.println("Topics = " + all.size());

                    int counter = 0;
                    for(Topic top : all) {
                        counter += top.getMessages().size();
                    }

                    System.out.println("Messages = " + counter);
                    break;
                }
                default: {
                    System.out.println("Wrong command!");
                    break;
                }
            }
        }
    }

    public static String getForumLink() {
        return forumLink;
    }

    public static void setForumLink(String newForumLink) {
        forumLink = newForumLink;
    }

    private static String dataBase = "src\\oopExercises\\forum\\Users.txt";

    public static String getDataBase() {
        return dataBase;
    }

    private static void getTopics(List<Topic> all) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(forumLink));
        String temporary, author, text;

        while ((temporary = reader.readLine()) != null){
            if(temporary.equals("#")) {
                author = reader.readLine();
                text = reader.readLine();
                all.add(new Topic(author, text));
            }
            if(temporary.equals("<!>")) {
                author = reader.readLine();
                text = reader.readLine();
                all.get(all.size() - 1).setNewMessages(new Message(author, text));
            }
        }

        reader.close();
    }

    private static void printListOfTopics() {
        for (Topic title : all) {
            System.out.printf(">>> %s%n", title.getTitle());
        }
    }

    private static void readTopic(String someTopic) {
        for (int a = 0; a < all.size(); a++) {
            if(all.get(a).getTitle().equals(someTopic)) {
                all.get(a).display();
            }
        }
    }

    private static void createANewTopic(User user) {
        Scanner input = new Scanner(System.in);
        String author = String.format("%s %s", user.getName(), user.getSurname());
        System.out.println("Enter a new title:");
        String title = input.nextLine();
        System.out.println("Enter a text:");
        String text = input.nextLine();
        try {
            all.add(new Topic(author, title, text));
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void edit(String topic, int index, User user) {
        Scanner input = new Scanner(System.in);
        String author = String.format("%s %s", user.getName(), user.getSurname());

        for (int a = 0; a < all.size(); a++) {
            if(all.get(a).getTitle().equals(topic)) {
                System.out.println("Enter the new message:");
                try {
                    all.get(a).getMessages().get(index).edits(author, input.nextLine());
                } catch (IndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                } catch (IllegalArgumentException ex) {
                    System.err.println(ex.getMessage());
                }

            }
        }
    }

    private static void comment(String topic, User user) {
        Scanner input = new Scanner(System.in);
        String author = String.format("%s %s", user.getName(), user.getSurname());

        for (int a = 0; a < all.size(); a++) {
            if(all.get(a).getTitle().equals(topic)) {
                System.out.println("Enter a new message:");
                try {
                    all.get(a).getMessages().add(new Message(author, input.nextLine()));
                } catch (IllegalArgumentException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    private static void save() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(forumLink));

        for (int a = 0; a < all.size(); a++) {
            Topic current = all.get(a);
            writer.write("#");
            writer.newLine();
            writer.write(current.getAuthor());
            writer.newLine();
            writer.write(current.getTitle());
            writer.newLine();

            for (int b = 0; b < current.getMessages().size(); b++) {
                Message message = current.getMessages().get(b);
                writer.write("<!>");
                writer.newLine();
                writer.write(message.getAuthor());
                writer.newLine();
                writer.write(message.getText());
                writer.newLine();
            }
        }

        writer.close();
    }
}
