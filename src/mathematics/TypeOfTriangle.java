package mathematics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> sides = new ArrayList<>();

        for (int a = 0; a < 3; a++) {
            sides.add(Double.parseDouble(input.nextLine()));
        }

        sides.sort(Comparator.naturalOrder());
        double a = sides.get(0);
        double b = sides.get(1);
        double c = sides.get(2);

        if(c >= a + b) {
            System.out.println("impossible");
        }
        else{
            // Pythagorean theorem
            if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) System.out.println("right-angled triangle");
            else if(Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2)) System.out.println("acute triangle");
            else System.out.println("obtuse triangle");
        }
    }
}



//Определете вида на триъгълника (остроъгълен, тъпоъгълен или правоъгълен) по дадени страни.

//Входни данни
//Дадени са три естествени числа - страните на триъгълника.

//Изход
//Ако триъгълника е правоъгълен, принтирайте - right-angled triangle, ако е остроъгълен, принтирайте acute triangle, ако е
//тъпоъгълен, принтирайте obtuse triangle, ако входните числа не образуват триъгълник, принтирайте impossible.



//Тестове

//2
//5
//5
//acute triangle

//2
//4
//5
//obtuse triangle

//3
//4
//5
//right-angled triangle

//6
//3
//5
//obtuse triangle

//5
//3
//2
//impossible
