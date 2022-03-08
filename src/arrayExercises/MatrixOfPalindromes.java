package arrayExercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int column = Integer.parseInt(input.nextLine().trim());

        int start = 97;

        for (int a = start; a < 97 + rows; a++) {
            for (int b = a; b < a + column; b++) {
                System.out.printf("%c%c%c ", (char)a, (char)b, (char)a);
            }
            start++;
            System.out.println();
        }
    }
}



//Tests

//3 2
//aaa aba
//bbb bcb
//ccc cdc

//4 6
//aaa aba aca ada aea afa
//bbb bcb bdb beb bfb bgb
//ccc cdc cec cfc cgc chc
//ddd ded dfd dgd dhd did

//5 15
//aaa aba aca ada aea afa aga aha aia aja aka ala ama ana aoa
//bbb bcb bdb beb bfb bgb bhb bib bjb bkb blb bmb bnb bob bpb
//ccc cdc cec cfc cgc chc cic cjc ckc clc cmc cnc coc cpc cqc
//ddd ded dfd dgd dhd did djd dkd dld dmd dnd dod dpd dqd drd
//eee efe ege ehe eie eje eke ele eme ene eoe epe eqe ere ese
