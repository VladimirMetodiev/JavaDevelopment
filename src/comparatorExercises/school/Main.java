package comparatorExercises.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = Integer.parseInt(input.nextLine());

        List<PersonalFile> schoolFiles = new ArrayList<>();

        for(int a = 0; a < count; a++) {
            schoolFiles.add(new PersonalFile(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }

        schoolFiles.stream().sorted(new FileComparator()).forEach(System.out::println);
    }
}



//Условие

//Един ден, училищната секретарка обърка личните досиета на учениците. Сега те отново трябва да бъдат подредени първо по клас,
//а след това във всеки клас по фамилното име на учениците.

//Входни данни
//Първият ред съдържа число N (1 <= N <= 1000) – броят на личните досиета. След това, за всеки от N-те ученици, се дават следните
//данни (всяка от тях на нов ред): фамилия, собствено име, клас, дата на раждане. Фамилията и собственото име са символни низове
//с дължина не повече от 20 символа, класът е низ, състоящ се от число (от 1 до 11) и латинска буква (от "A" до "Z"), датата на раждане
//е в формат "DD.MM.YY". Гарантирано е, че няма съименници в рамките на един и същи клас.

//Изход
//Трябва да изведете N реда, всеки от които съдържа данни за един ученик: първо клас, а след това фамилия, име и дата на раждане.



//Тест

//Input
//4
//Ivanov
//Peter
//9A
//14.06.93
//Georgieva
//Ralitza
//9A
//08.08.93
//Metodiev
//Vladimir
//11B
//10.05.90
//Dimitrova
//Anna
//9B
//05.09.93

//Output
//9A Georgieva Ralitza 08.08.93
//9A Ivanov Peter 14.06.93
//9B Dimitrova Anna 05.09.93
//11B Metodiev Vladimir 10.05.90
