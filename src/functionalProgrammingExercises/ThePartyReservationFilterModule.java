package functionalProgrammingExercises;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = Arrays.stream(input.nextLine().split("\\s+")).collect(Collectors.toList());

        ArrayList<String> filters = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();
        String command = input.nextLine();

        BiConsumer<String, String> doesItContain = (f, p) -> {
            for (int a = 0; a < filters.size(); a++) {
                if(filters.get(a).equals(f) && parameters.get(a).equals(p)) {
                    filters.remove(a);
                    parameters.remove(a);
                    a--;
                }
            }
        };

        while (true) {
            if (command.equals("Print")) {
                break;
            }

            String[] data = command.split(";");

            switch (data[0]) {
                case "Add filter": {
                    filters.add(data[1]);
                    parameters.add(data[2]);
                    break;
                }
                case "Remove filter": {
                    doesItContain.accept(data[1], data[2]);
                    break;
                }
                default: break;
            }

            command = input.nextLine();
        }

        list = checkUp(list, filters, parameters);

        list.forEach(e -> System.out.print(e + " "));
    }

    private static List<String> checkUp(List<String> list, ArrayList<String> filter, ArrayList<String> parameter){
        BiPredicate<String, String> starts = (str, p) -> str.indexOf(p) == 0;
        BiPredicate<String, String> ends = (str, p) -> str.lastIndexOf(p) != -1;
        BiPredicate<String, Integer> hasALength = (str, p) -> str.length() == p;

        for (int b = 0; b < filter.size(); b++) {
            switch (filter.get(b)) {
                case "Starts with": {
                    for (int c = 0; c < list.size(); c++) {
                        if(starts.test(list.get(c), parameter.get(b))) {
                            list.remove(c);
                            c--;
                        }
                    }
                    break;
                }
                case "Ends with": {
                    for (int d = 0; d < list.size(); d++) {
                        if(ends.test(list.get(d), parameter.get(b))) {
                            list.remove(d);
                            d--;
                        }
                    }
                    break;
                }
                case "Length": {
                    for (int e = 0; e < list.size(); e++) {
                        if(hasALength.test(list.get(e), Integer.parseInt(parameter.get(b)))) {
                            list.remove(e);
                            e--;
                        }
                    }
                    break;
                }
                case "Contains": {
                    for (int f = 0; f < list.size(); f++) {
                        if(list.get(f).contains(parameter.get(b))) {
                            list.remove(f);
                            f--;
                        }
                    }
                    break;
                }
                default: break;
            }
        }

        return list;
    }
}



//Condition

//You are a young and talented developer. The first task you need to do is to implement a filtering module to a party
//reservation software. First, The Party Reservation Filter Module is passed a list with invitations. Next The Party Reservation Filter Module
//receives a sequence of commands that specify if you need to add or remove a given filter. The Party Reservation Filter Module
//commands are in the given format {command;filter type;filter parameter}. You can receive the following The Party Reservation Filter Module
//commands: "Add filter", "Remove filter" or "Print". The possible The Party Reservation Filter Module filter types are:
//"Starts with", "Ends with", "Length" and "Contains". All The Party Reservation Filter Module filter parameters will be a string
//(or an integer for the length filter). The input will end with a "Print" command.



//Tests

//Input
//Peter Mario Stefan
//Add filter;Starts with;P
//Add filter;Starts with;M
//Print

//Output
//Stefan


//Input
//Peter Mario John
//Add filter;Starts with;P
//Add filter;Starts with;M
//Remove filter;Starts with;M
//Print

//Output
//Mario John


//Input
//Alice Alexander Marina Vladimir Anna Boris Gabriela Nina Peter David Emma Catherine
//Add filter;Starts with;Dav
//Add filter;Contains;in
//Add filter;Starts with;Bo
//Remove filter;Starts with;Bo
//Add filter;Ends with;ice
//Add filter;Ends with;Peter
//Print

//Output
//Alexander Vladimir Anna Boris Gabriela Emma


//Input
//Silvia Alexander Marina Vladimir Anna Boris Gabriela Peter David Emma Catherine
//Add filter;Length;5
//Add filter;Starts with;Sil
//Add filter;Contains;ri
//Print

//Output
//Alexander Vladimir Anna Emma


//Input
//Alice Alexander Marina Olga Vladimir Anna Boris Gabriela Peter Nina David Emma Catherine
//Add filter;Starts with;A
//Add filter;Length;8
//Remove filter;Starts with;A
//Add filter;Contains;ex
//Remove filter;Starts with;A
//Add filter;Length;5
//Print

//Output
//Marina Olga Anna Nina Emma Catherine
