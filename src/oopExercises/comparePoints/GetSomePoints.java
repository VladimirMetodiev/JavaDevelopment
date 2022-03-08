package oopExercises.comparePoints;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSomePoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = Integer.parseInt(input.nextLine());
        ArrayList<SomePoints> points = new ArrayList<>();

        for (int a = 0; a < count; a++) {
            int x = input.nextInt();
            int y = input.nextInt();
            points.add(new SomePoints(x, y));
        }

        points = SomePoints.sort(points);
        for(SomePoints p : points) System.out.println(p);
    }
}



//Condition

//Програмата получава цяло число N като вход. То е последвано от N двойки от стойностите x, y. Това са координатите на текущата точка.
//Необходимо е да се сортират всички точки, по отдалечеността им от началото на координатната система, в нарастващ порядък.
//След което сортираният списък (от точки) да се принтира във формат:
//(1; 2)
//(3; 4)
//и т.н.



//Tests

//Input
//5
//1 2
//3 7
//-2 3
//1 1
//3 5
//Output
//(1; 1)
//(1; 2)
//(-2; 3)
//(3; 5)
//(3; 7)


//Input
//7
//1 2
//5 4
//79 48
//132 -1
//-1 -3
//5 6
//123 123
//Output
//(1; 2)
//(-1; -3)
//(5; 4)
//(5; 6)
//(79; 48)
//(132; -1)
//(123; 123)


//Input
//1
//1 1
//Output
//(1; 1)



//Another solution

//class GetSomePoints{
//    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        int[][] points = new int[input.nextInt()][2];
//        for (int a = 0; a < points.length; a++) {
//            points[a][0] = input.nextInt();
//            points[a][1] = input.nextInt();
//        }
//        Arrays.sort(points, Comparator.comparingInt(e -> Math.abs(e[0]) + Math.abs(e[1])));
//        for (int[] rows : points) System.out.println("(" + rows[0] + "; " + rows[1] + ")");
//    }
//}
