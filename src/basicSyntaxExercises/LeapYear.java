package basicSyntaxExercises;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int year = Integer.parseInt(input.nextLine());

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}



//Note

//Една година е високосна, ако нейното число е кратно на 4, но не кратно на 100, а също така и ако е кратно на 400;



//Tests

//1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940
//1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980
//1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020
//2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060
//2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104
