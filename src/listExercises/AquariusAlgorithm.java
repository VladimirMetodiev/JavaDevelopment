package listExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AquariusAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aM = Integer.parseInt(input.nextLine());
        int bM = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());

        List<String> result = new ArrayList<>();
        int counter = 0, a = 0, b = 0;
        boolean isItImpossible = true;

        if(aM == n) {
            System.out.println(">A");
            return;
        }

        if(bM == n) {
            System.out.println(">B");
            return;
        }

        if(aM < bM) {
            a = aM;
            result.add(">A");

        }
        else if (bM < aM) {
            b = bM;
            result.add(">B");
        }

        while(counter < 100000) {
            if(aM > bM) {
                if(n > aM) {
                    break;
                }
                else {
                    if(b < bM) {
                        b = bM;
                        result.add(">B");
                    }
                    else if(a == aM) {
                        a = 0;
                        result.add("A>");
                    }
                    else if(b == bM) {
                        if(a == 0) {
                            a = b;
                            b = 0;
                        }
                        else {
                            int current = aM - a;
                            a += aM - a >= b ? b : aM - a;
                            b -= current >= b ? b : current;
                        }
                        result.add("B>A");
                    }
                }
            }
            else if(bM > aM) {
                if(n > bM) {
                    break;
                }
                else {
                    if(a < aM) {
                        a = aM;
                        result.add(">A");
                    }
                    else if(b == bM) {
                        b = 0;
                        result.add("B>");
                    }
                    else if(a == aM) {
                        if(b == 0) {
                            b = a;
                            a = 0;
                        }
                        else {
                            int current = bM - b;
                            b += bM - b >= a ? a : bM - b;
                            a -= current >= a ? a : current;
                        }
                        result.add("A>B");
                    }
                }
            }

            if(a == n || b == n) {
                isItImpossible = false;
                break;
            }
            ++counter;
        }

        if(!isItImpossible) {
            for(String str : result) {
                System.out.println(str);
            }
        }
        else {
            System.out.println("Impossible");
        }
    }
}



//??????????????

//?????????????????????? "??????????????" ?????????????????? ?? ?????? ????????, ?????????????? ?? ???????? ?? ??????????, ?????????????? ?? ???????? ?? ??????????, ?? ???????? ???????? ?? ?? ???????? ???? ????????.
//???????????????? ???????? ???? ???????????????? ???????????????? ????????????????:

//?????????????? ?????? A (???????????????????? ?? >A);
//?????????????? ?????? B (???????????????????? ?? >B);
//???????????? ???????????? ???? ?????? ?? (???????????????????? ?? A>);
//???????????? ???????????? ???? ?????? B (???????????????????? ?? B>);
//???????????? ???????????? ???? ?????? ?? ?? ?????? B (???????????????????? ???????? A>B);
//???????????? ???????????? ???? ?????? B ?? ?????? ?? (???????????????????? ???????? B>A);
//?????????????????? ???? ?????????????????? ???? ?????????????? ?????? ?? ??????????????, ???????? ???? ????????, ???? ?????? ?????????????? ?????? ?? ?????????????? ??????????????????, ?????? ?????????????? ?????? ?? ?????????????? ????????????????.

//???????????? ??????????
//???????????????????? ???????????????? ???????? ???????? ?????? ???????????????????? ?????????? A, B, N, (???? ????-???????????? ???? 10^4).

//??????????
//???????????????????? ?? ???? ??????????????????, ?????????????????? ???? ???????????????? ???? ??????????????, ?????????? ?????????????????? ???? ????????????????, ?????????? N ??????????, ?? ???????? ???? ???????????????? (?????????? ???? ?? ?????????? A ?? B).
//?????? ?????????? ???? ?????????? ????????????????, ?????????? N ??????????, ?? ???????? ???? ???????????????? ?????????????????????? ???????????????????? ???? ??????????????.
//?????? ?????????? ?????????????????? ???? ????????????????????, ???????????? ???????????????????? ???????????? ???? ???????????????? Impossible.

//?????????? ???? ???????????????????? ?? ???????????????????? ???? ???????????? ???? ?????????????????? 10^5. ?????????????????????? ??, ???? ?????? ???????????????? ?????? ??????????????, ???? ???????? ??????????????,
//?????????????? ???? ???????????? ???? 10^5 ????????????????.



//??????????????

//Input
//3
//5
//1
//Output
//>A
//A>B
//>A
//A>B


//Input
//6000
//50
//350
//Output
//>B
//B>A
//>B
//B>A
//>B
//B>A
//>B
//B>A
//>B
//B>A
//>B
//B>A
//>B
//B>A


//Input
//100
//26
//78
//Output
//>B
//B>A
//>B
//B>A
//>B
//B>A


//Input
//55
//15
//55
//Output
//>A


//Input
//12
//8
//8
//Output
//>B
