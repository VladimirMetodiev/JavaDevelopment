package arrayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> source = new ArrayList<>();
        int length = 0, counter;
        String command;
        char[][] matrix = null;

        String rotation = input.nextLine();
        int rotate = Integer.parseInt(rotation.substring(rotation.indexOf("(")+ 1, rotation.indexOf(")")));

        while(rotate != 0 && rotate != 90 && rotate != 180 && rotate != 270 ) {
            rotate -= 360;
            if(rotate < 0) {
                return;
            }
        }

        while(!(command = input.nextLine()).equals("END")) {
            source.add(command);
            if(length < command.length()) {
                length = command.length();
            }
        }

        if(rotate == 0 || rotate == 180) {
            matrix = new char[source.size()][length];
            if(rotate == 0) {
                for (int a = 0; a < source.size(); a++) {
                    matrix[a] = source.get(a).toCharArray();
                }
            }
            else {
                for(char[] m : matrix) Arrays.fill(m, (char)32);
                for (int e = source.size() - 1; e >= 0; e--) {
                    counter = length - 1;
                    for (int f = source.get(e).length() - 1; f >= 0; f--) {
                        matrix[source.size() - 1 - e][counter--] = source.get(e).charAt(source.get(e).length() - 1 - f);
                    }
                }
            }
        }

        if(rotate == 90 || rotate == 270) {
            matrix = new char[length][source.size()];
            for(char[] m : matrix) Arrays.fill(m, (char)32);
            if(rotate == 90) {
                for (int g = source.size() - 1; g >= 0; g--) {
                    for (int h = 0; h < source.get(g).length(); h++) {
                        matrix[h][source.size() - 1 - g] = source.get(g).charAt(h);
                    }
                }
            }
            else {
                for (int i = 0; i < source.size(); i++) {
                    for (int j = length - 1; j > length - 1 - source.get(i).length(); j--) {
                        matrix[j][i] = source.get(i).charAt(length - 1 - j);
                    }
                }
            }
        }

        for(char[] arr : matrix) {
            for(char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}



//Condition

//You are given a sequence of text lines. Assume these text lines form a matrix of characters (pad the missing positions with spaces
//to build a rectangular matrix). Write a program to rotate the matrix by 90, 180, 270, 360, … degrees. Print the result at the console
//as sequence of strings after receiving the “END” command.

//Input
//The input is read from the console:
//>>> The first line holds a command in format "Rotate(X)" where X are the degrees of the requested rotation.
//>>> The next lines contain the lines of the matrix for rotation.
//>>> The input ends with the command "END".
//The input data will always be VALID and in the format described. There is no need to check it explicitly.

//Output
//Print at the console the rotated matrix as a sequence of text lines.

//Constraints
//>>> The rotation degrees is positive integer in the range [0…90000], where degrees is multiple of 90.
//>>> The number of matrix lines is in the range [1 … 1 000].
//>>> The matrix lines are strings of length 1 … 1 000.
//>>> Allowed working time: 0.2 seconds. Allowed memory: 16 MB.



//Tests

//Input
//Rotate(0)
//Java
//JavaScript
//C++
//Python
//END

//Output
//Java
//JavaScript
//C++
//Python



//Input
//Rotate(180)
//Java
//JavaScript
//C++
//Python
//END

//Output
//    nohtyP
//       ++C
//tpircSavaJ
//      avaJ



//Input
//Rotate(90)
//Java
//JavaScript
//C++
//Python
//END

//Output
//PCJJ
//y+aa
//t+vv
//h aa
//o S
//n c
//  r
//  i
//  p
//  t



//Input
//Rotate(270)
//Java
//JavaScript
//C++
//Python
//END

//Output
// t
// p
// i
// r
// c n
// S o
//aa h
//vv+t
//aa+y
//JJCP



//Input - 270
//Rotate(630)
//Java
//JavaScript
//C++
//Python
//END

//Output
// t
// p
// i
// r
// c n
// S o
//aa h
//vv+t
//aa+y
//JJCP



//Input - 180
//Rotate(1620)
//Java
//JavaScript
//C++
//Python
//END

//Output
//    nohtyP
//       ++C
//tpircSavaJ
//      avaJ



//Input - 0
//Rotate(720)
//Java
//JavaScript
//C++
//Python
//END

//Output
//Java
//JavaScript
//C++
//Python



//Input - 0
//Rotate(1080)
//Java
//JavaScript
//C++
//Python
//END

//Output
//Java
//JavaScript
//C++
//Python



//Input - 90
//Rotate(810)
//Java
//JavaScript
//C++
//Python
//END

//Output
//PCJJ
//y+aa
//t+vv
//h aa
//o S
//n c
//  r
//  i
//  p
//  t


//Input - 90
//Rotate(810)
//C++
//Java
//Python
//JavaScript
//END

//Output
//JPJC
//aya+
//vtv+
//aha
//So
//cn
//r
//i
//p
//t
