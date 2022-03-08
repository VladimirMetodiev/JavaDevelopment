package basicSyntaxExercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double quantity = Double.parseDouble(input.nextLine());

        BigDecimal cost = new BigDecimal(quantity * 1.2);

        BigDecimal rate = new BigDecimal(4210500000000L);
        cost = cost.multiply(rate);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(cost) + " marks");
    }
}



//Condition

//You need to calculate the price of a given quantity of "wurst" in Deutsche Marks. Read the quantity as a double value
//and print the price in marks, given the following:
//The price of 1 kg wurst is 1.20 BGN
//The exchange rate is 4210500000000 DM : 1 BGN
//Print the price, rounded to the second digit after the decimal separator.



//Tests

//1
//5052600000000,00 marks

//2.35
//11873610000000,00 marks

//15
//75789000000000,00 marks
