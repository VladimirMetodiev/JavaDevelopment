package oopExercises.familyTree.thirdAttemp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vladimir Metodiev
 * @version 3.12
 */

public class StartFamilyTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person mainPerson = new Person();

        String expression = input.nextLine();

        if(Pattern.matches("(\\d{2}/)(\\d{2}/)(\\d{4})", expression)) {
            mainPerson.setBirthDate(expression);
        }
        else if(Pattern.matches("[A-Z][a-z]+\\s+[A-Z][a-z]+", expression)){
            mainPerson.setName(expression);
        }
        else {
            return;
        }

        LinkedHashMap<String, String> relation = new LinkedHashMap<>();
        LinkedHashMap<String, String> personalData = new LinkedHashMap<>();

        while (!(expression = input.nextLine()).equals("End")) {
            Pattern pattern;
            Matcher matcher;

            if(Pattern.matches("([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}/\\d{2}/\\d{4})\\s-\\s([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}/\\d{2}/\\d{4})", expression)) {
                pattern = Pattern.compile("([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}/\\d{2}/\\d{4})\\s-\\s([A-Z][a-z]+\\s+[A-Z][a-z]+|\\d{2}/\\d{2}/\\d{4})");
                matcher = pattern.matcher(expression);

                while (matcher.find()) {
                    relation.put(matcher.group(1), matcher.group(2));
                }
            }
            else {
                pattern = Pattern.compile("([A-Z][a-z]+\\s+[A-Z][a-z]+)\\s(\\d{2}/\\d{2}/\\d{4})");
                matcher = pattern.matcher(expression);

                while (matcher.find()) {
                    personalData.put(matcher.group(1), matcher.group(2));
                }
            }
        }

        for(Map.Entry<String, String> element : personalData.entrySet()) {
            if(element.getKey().equals(mainPerson.getName())) {
                mainPerson.setBirthDate(element.getValue());
                personalData.remove(element.getKey());
                break;
            }
            if(element.getValue().equals(mainPerson.getBirthDate())) {
                mainPerson.setName(element.getKey());
                personalData.remove(element.getKey());
                break;
            }
        }

//        Relative relatives = new Relative(mainPerson);

        Relative relatives = new Relative();
        if(mainPerson.getName() != null && mainPerson.getBirthDate() != null) {
            relatives.setPerson(mainPerson);
        }
        else {
            return;
        }

        for(Map.Entry<String, String> element : relation.entrySet()) {
            if(element.getKey().equals(relatives.getPerson().getName()) || element.getKey().equals(relatives.getPerson().getBirthDate())) {
                for(Map.Entry<String, String> el : personalData.entrySet()) {
                    if(element.getValue().equals(el.getKey()) || element.getValue().equals(el.getValue())) {
                        relatives.addChild(new Person(el.getKey(), el.getValue()));
                        break;
                    }
                }
                continue;
            }
            if(element.getValue().equals(relatives.getPerson().getName()) || element.getValue().equals(relatives.getPerson().getBirthDate())) {
                for(Map.Entry<String, String> el : personalData.entrySet()) {
                    if(element.getKey().equals(el.getKey()) || element.getKey().equals(el.getValue())) {
                        relatives.addParent(new Person(el.getKey(), el.getValue()));
                        break;
                    }
                }
            }
        }

        relatives.print();
    }
}



//Condition

//You want to build your family tree, so you went to ask your grandmother, sadly your grandmother keeps remembering information about
//your predecessors in pieces, so it falls to you to group the information and build the family tree.

//On the first line of the input you will receive either a name or a birth-date in the format “<FirstName> <LastName>” or
//“day/month/year” – your task is to find the person’s information in the family tree. On the next lines until the command “End”
//is received you will receive information about your predecessors that you will use to build the family tree.

//The information will be in one of the following formats:
//>>>	“FirstName LastName - FirstName LastName”
//>>>	“FirstName LastName - day/month/year”
//>>>	“day/month/year - FirstName LastName”
//>>>	“day/month/year - day/month/year”
//>>>	“FirstName LastName day/month/year”

//The first 4 formats reveal a family tie – the person on the left is parent to the person on the right (as you can see the format
//does not need to contain names, for example the 4th format means the person born on the left date is parent to
//the person born on the right date). The last format ties different information together – i.e. the person with that name was born on that date.
//Names and birth-dates are unique – there won’t be 2 people with the same name or birth-date, there will always be enough entries
//to construct the family tree (all people’s names and birth-dates are known and they have at least one connection to another person in the tree).

//After the command “End” is received you should print all information about the person whose name or birth-date you received
//on the first line – his name, birthday, parents and children (check the examples for the format). The people in the parents and children lists
//should be ordered by their first appearance in the input (regardless if they appeared as a birth-date or a name, for example
//in the first input Stamat is before Penka because he first appeared in the second line, while she appears in the third.).



//Tests

//Допълнително тествах това решение в:
//https://www.tutorialspoint.com/compile_java_online.php

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



//02/07/1976
//Georgy Ivanov 02/07/1976
//End

//Georgy Ivanov 02/07/1976
//Parents:
//Children:



//Georgy Ivanov
//04/06/1954 - 02/07/1976
//Martin Petrov 15/01/1979
//Teodor Ivanov - 05/08/1983
//End
