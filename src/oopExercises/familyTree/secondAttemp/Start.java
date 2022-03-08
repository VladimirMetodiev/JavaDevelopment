package oopExercises.familyTree.secondAttemp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<InfoPair> information = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();

        String expression = reader.readLine();

        boolean isItDate = Pattern.matches("(\\d{2}\\/)(\\d{2}\\/)(\\d{4})", expression);
        people.add(new Person());

        if(isItDate){
            people.get(0).setBirthDate(expression);
        }
        else {
            people.get(0).setName(expression);
        }

        while (!(expression = reader.readLine()).equalsIgnoreCase("end")) {
            Pattern pattern = Pattern.compile("[A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}\\/\\d{2}\\/\\d{4}");
            Matcher matcher;
            if(Pattern.matches("([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}\\/\\d{2}\\/\\d{4})\\s-\\s([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}\\/\\d{2}\\/\\d{4})", expression)) {
                matcher = pattern.matcher(expression);
                information.add(new InfoPair());

                while (matcher.find()) {
                    if(information.get(information.size() - 1).getTheFirst() == null) information.get(information.size() - 1).setTheFirst(matcher.group());
                    else information.get(information.size() - 1).setTheSecond(matcher.group());
                }
            }
            else {
                matcher = pattern.matcher(expression);
                people.add(new Person());

                while (matcher.find()) {
                    if(people.get(people.size() - 1).getName() == null) people.get(people.size() - 1).setName(matcher.group());
                    else people.get(people.size() - 1).setBirthDate(matcher.group());
                }

                if(people.get(0).getName() == null) {
                    for (int i = 1; i < people.size(); i++) {
                        if(people.get(0).getBirthDate().equals(people.get(i).getBirthDate())) {
                            people.get(0).setName(people.get(i).getName());
                            people.remove(i);
                            break;
                        }
                    }
                }
                else {
                    for (int k = 1; k < people.size(); k++) {
                        if(people.get(0).getName().equals(people.get(k).getName())) {
                            people.get(0).setBirthDate(people.get(k).getBirthDate());
                            people.remove(k);
                            break;
                        }
                    }
                }
            }
        }

        Relative relatives;

        if(people.get(0).getName() != null && people.get(0).getBirthDate() != null) {
            relatives = new Relative(people.get(0));
        }
        else {
            return;
        }

        for (int a = 0; a < information.size(); a++) {
            if(relatives.getPerson().getName().equals(information.get(a).getTheFirst()) || relatives.getPerson().getBirthDate().equals(information.get(a).getTheFirst())) {
                for (int b = 1; b < people.size(); b++) {
                    if(information.get(a).getTheSecond().equals(people.get(b).getName())) {
                        relatives.setChildren(people.get(b));
                        break;
                    }

                    if(information.get(a).getTheSecond().equals(people.get(b).getBirthDate())) {
                        relatives.setChildren(people.get(b));
                        break;
                    }
                }
            }

            if(relatives.getPerson().getName().equals(information.get(a).getTheSecond()) || relatives.getPerson().getBirthDate().equals(information.get(a).getTheSecond())) {
                for (int b = 1; b < people.size(); b++) {
                    if(information.get(a).getTheFirst().equals(people.get(b).getName())) {
                        relatives.setParents(people.get(b));
                        break;
                    }

                    if(information.get(a).getTheFirst().equals(people.get(b).getBirthDate())) {
                        relatives.setParents(people.get(b));
                        break;
                    }
                }
            }
        }

        relatives.print();

//        System.out.println(relatives.getPerson());
//        System.out.println("Parents:");
//        relatives.getParents().forEach(p -> System.out.println(p));
//        System.out.println("Children:");
//        relatives.getChildren().forEach(c -> System.out.println(c));

        reader.close();
    }
}



//Condition

//You want to build your family tree, so you went to ask your grandmother, sadly your grandmother keeps remembering information about
//your predecessors in pieces, so it falls to you to group the information and build the family tree.
//
//On the first line of the input you will receive either a name or a birth-date in the format “<FirstName> <LastName>” or
//“day/month/year” – your task is to find the person’s information in the family tree. On the next lines until the command “End”
//is received you will receive information about your predecessors that you will use to build the family tree.
//
//The information will be in one of the following formats:
//>>>	“FirstName LastName - FirstName LastName”
//>>>	“FirstName LastName - day/month/year”
//>>>	“day/month/year - FirstName LastName”
//>>>	“day/month/year - day/month/year”
//>>>	“FirstName LastName day/month/year”
//
//The first 4 formats reveal a family tie – the person on the left is parent to the person on the right (as you can see the format
//does not need to contain names, for example the 4th format means the person born on the left date is parent to
//the person born on the right date). The last format ties different information together – i.e. the person with that name was born on that date.
//Names and birth-dates are unique – there won’t be 2 people with the same name or birth-date, there will always be enough entries
//to construct the family tree (all people’s names and birth-dates are known and they have at least one connection to another person in the tree).
//
//After the command “End” is received you should print all information about the person whose name or birth-date you received
//on the first line – his name, birthday, parents and children (check the examples for the format). The people in the parents and children lists
//should be ordered by their first appearance in the input (regardless if they appeared as a birth-date or a name, for example
//in the first input Stamat is before Penka because he first appeared in the second line, while she appears in the third.).



//Tests

//Pesho Peshev
//11/11/1951 - 23/05/1980
//Penka Pesheva - 23/05/1980
//Penka Pesheva 09/02/1953
//Pesho Peshev - Gancho Peshev
//Gancho Peshev 01/01/2005
//Stamat Peshev 11/11/1951
//Pesho Peshev 23/05/1980
//End

//Pesho Peshev 23/05/1980
//Parents:
//Stamat Peshev 11/11/1951
//Penka Pesheva 09/02/1953
//Children:
//Gancho Peshev 01/01/2005



//13/12/1993
//25/03/1934 - 04/04/1961
//Peter Tonchev 25/03/1934
//04/04/1961 - Momchil Tonchev
//Teodor Tonchev - Leo Tonchev
//Momchil Tonchev 13/12/1993
//Leo Tonchev 07/07/1995
//Teodor Tonchev 04/04/1961
//End

//Momchil Tonchev 13/12/1993
//Parents:
//Teodor Tonchev 04/04/1961
//Children:










//My old work

//public class Start {
//    private static ArrayList<Relative> relatives = new ArrayList<>();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String command = reader.readLine();
//        String[] data;
//
//        if(command.contains("/")) {
//            relatives.add(new Relative(command));
//        }
//        else {
//            data = command.split("\\s+");
//            relatives.add(new Relative(data[0], data[1]));
//        }
//
//        while(!(command = reader.readLine()).equals("End")) {
//            if(command.contains("-")) {
//                //Данни за роднинска връзка
//                data = command.split("\\s+-\\s+");
//                if(data[0].contains("/")) {
//                    // data[0] -> дата
//                    isThereSuchPerson(data[0], data[1]);
//                }
//                else {
//                    // data[0] -> имена
//                    String[] names = data[0].split("\\s+");
//                    isThereSuchPerson(names[0], names[1], data[1]);
//                }
//            }
//            else {
//                // Данни за човек
//                data = command.split("\\s+");
//
//                for(int w = 0; w <relatives.size(); w++) {
//                    if(relatives.get(w).getName().equals(data[0]) && relatives.get(w).getLastName().equals(data[1])) {
//                        relatives.get(w).setBirthDate(data[2]);
//                        break;
//                    }
//
//                    if(relatives.get(w).getBirthDate().equals(data[2])) {
//                        relatives.get(w).setName(data[0]);
//                        relatives.get(w).setLastName(data[1]);
//                        break;
//                    }
//                }
//            }
//        }
//
//        clearTheClones();
//
//        System.out.printf("%s %s %s%n", relatives.get(0).getName(), relatives.get(0).getLastName(), relatives.get(0).getBirthDate());
//        System.out.println("Parents:");
//        if(relatives.get(0).getParents().size() > 0) {
//            for(int x = 0; x < relatives.get(0).getParents().size(); x++) {
//                System.out.printf("%s %s %s%n", relatives.get(relatives.get(0).getParents().get(x)).getName(), relatives.get(relatives.get(0).getParents().get(x)).getLastName(), relatives.get(relatives.get(0).getParents().get(x)).getBirthDate());
//            }
//        }
//        System.out.println("Children:");
//        if(relatives.get(0).getChildren().size() > 0) {
//            for(int y = 0; y < relatives.get(0).getChildren().size(); y++) {
//                System.out.printf("%s %s %s%n", relatives.get(relatives.get(0).getChildren().get(y)).getName(), relatives.get(relatives.get(0).getChildren().get(y)).getLastName(), relatives.get(relatives.get(0).getChildren().get(y)).getBirthDate());
//            }
//        }
//
//        reader.close();
//    }
//
//    private static void isThereSuchPerson (String date, String rawMaterial){
//        boolean isThere = false;
//
//        for (Relative r : relatives) if(r.getBirthDate().equals(date)) isThere = true;
//
//        if(!isThere) {
//            relatives.add(new Relative(date));
//        }
//
//        checkDate(date, rawMaterial);
//    }
//
//    private static void isThereSuchPerson (String name, String surname, String rawMaterial){
//        boolean isThere = false;
//
//        for (Relative r : relatives) if(r.getName().equals(name) && r.getLastName().equals(surname)) isThere = true;
//
//        if(!isThere) {
//            relatives.add(new Relative(name, surname));
//        }
//
//        checkNames(name, surname, rawMaterial);
//    }
//
//    private static void checkDate (String date, String rawMaterial) {
//        for(int a = 0; a < relatives.size(); a++) {
//            if(relatives.get(a).getBirthDate().equals(date)) {
//                checkParentsAndChildren(a, rawMaterial);
//                break;
//            }
//        }
//    }
//
//    private static void checkNames (String name, String surname, String rawMaterial) {
//        for(int a = 0; a < relatives.size(); a++) {
//            if(relatives.get(a).getName().equals(name) && relatives.get(a).getLastName().equals(surname)) {
//                checkParentsAndChildren(a, rawMaterial);
//                break;
//            }
//        }
//    }
//
//    private static void checkParentsAndChildren (int index, String rawMaterial) {
//        if(rawMaterial.contains("/")) {
//            boolean flag1 = false;
//
//            for(int b = 0; b < relatives.size(); b++) {
//                if(relatives.get(b).getBirthDate().equals(rawMaterial)) {
//                    flag1 = true;
//                    relatives.get(index).getChildren().add(b);
//                    relatives.get(b).getParents().add(index);
//                }
//            }
//
//            if(!flag1) {
//                relatives.add(new Relative(rawMaterial));
//                relatives.get(index).getChildren().add(relatives.size() - 1);
//                relatives.get(relatives.size() - 1).getParents().add(index);
//            }
//        }
//        else {
//            boolean flag2 = false;
//            String[] raw = rawMaterial.split("\\s+");
//
//            for(int c = 0; c < relatives.size(); c++) {
//                if(relatives.get(c).getName().equals(raw[0]) && relatives.get(c).getLastName().equals(raw[1])) {
//                    flag2 = true;
//                    relatives.get(index).getChildren().add(c);
//                    relatives.get(c).getParents().add(index);
//                }
//            }
//
//            if(!flag2) {
//                relatives.add(new Relative(raw[0], raw[1]));
//                relatives.get(index).getChildren().add(relatives.size() - 1);
//                relatives.get(relatives.size() - 1).getParents().add(index);
//            }
//        }
//    }
//
//    // Възникна проблем: ако имам името на даден човек, а след това, получа неговата дата на раждане във връзка с имената или датата на раждане на друг човек,
//    // то тогава ще създам копие на първият човек
//
//    private static void clearTheClones() {
//        for(int m = 0; m < relatives.size(); m++){
//            for(int n = relatives.size() - 1; n > m; n--) {
//                if((relatives.get(m).getName().equals(relatives.get(n).getName()) && relatives.get(m).getLastName().equals(relatives.get(n).getLastName())) || relatives.get(m).getBirthDate().equals(relatives.get(n).getBirthDate()))  {
//                    if(relatives.get(m).getName().isEmpty()) relatives.get(m).setName(relatives.get(n).getName());
//                    if(relatives.get(m).getLastName().isEmpty()) relatives.get(m).setLastName(relatives.get(n).getLastName());
//                    if(relatives.get(m).getBirthDate().isEmpty()) relatives.get(m).setBirthDate(relatives.get(n).getBirthDate());
//                    if(relatives.get(n).getParents().size() > 0) relatives.get(m).setParents(relatives.get(n).getParents());
//                    if(relatives.get(n).getChildren().size() > 0) relatives.get(m).setChildren(relatives.get(n).getChildren());
//                    relatives.get(n).setName("");
//                    relatives.get(n).setLastName("");
//                    relatives.get(n).setBirthDate("");
//                }
//            }
//        }
//    }
//}
//
//public class Relative {
//    private String firstName = "";
//    private String lastName = "";
//    private String birthDate = "";
//    private ArrayList<Integer> parents = new ArrayList<>();
//    private ArrayList<Integer> children = new ArrayList<>();
//
//    public Relative(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Relative(String birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public String getName() {
//        return firstName;
//    }
//
//    public void setName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public ArrayList<Integer> getParents() {
//        return parents;
//    }
//
//    public void setParents(ArrayList<Integer> parents) {
//        this.parents = parents;
//    }
//
//    public ArrayList<Integer> getChildren() {
//        return children;
//    }
//
//    public void setChildren(ArrayList<Integer> children) {
//        this.children = children;
//    }
//}
