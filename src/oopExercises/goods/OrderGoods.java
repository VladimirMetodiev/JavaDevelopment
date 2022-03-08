package oopExercises.goods;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderGoods {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        ArrayList<NarMag> order = new ArrayList<>();
        String command, tradeItem, type;
        int quantity;
        double price;

        System.out.println("Choose: \"add\" or \"end\":");
        command = input.nextLine().toLowerCase();

        while (!command.equals("end")){
            if(command.equals("add")) {
                System.out.println("Enter a trade item:");
                tradeItem = input.nextLine();
                System.out.println("Enter product type:");
                type = input.nextLine().toLowerCase();
                System.out.println("Enter quantity:");
                quantity = Integer.parseInt(input.nextLine());
                System.out.println("Enter price:");
                price = Double.parseDouble(input.nextLine());

                NarMag item = new NarMag(tradeItem, type, quantity, price);
                item.calculateDeliveryPrice();
                order.add(item);
            }
            else{
                System.out.println("Wrong command!");
            }

            System.out.println("Choose: \"add\" or \"end\":");
            command = input.nextLine().toLowerCase();
        }

        if(NarMag.total > 0) {
            System.out.println("Your order includes:");
        }

        for (int a = 0; a < order.size(); a++) {
            System.out.println(order.get(a).toString());
        }

        if(NarMag.total > 0) {
            System.out.println("==================================================");
            System.out.printf("TOTAL: %.2f", NarMag.total);
        }

        input.close();
    }
}



//Test

//info
//add
//Laptop Acer
//computer
//1
//1850
//add
//Sony Playstation 4 SLIM, 500 GB, Black
//game_console
//1
//599.99
//add
//Console game God of War III
//game_console
//1
//60
//end


//add
//Black leather jacket
//clothes
//1
//435
//add
//Blue shirt
//clothes
//2
//65
//add
//Casio wristwatch
//accessories
//1
//256
//end


//add
//Principles of Economics by N.grid.Mankiw
//book
//1
//145.99
//add
//200-page notebook
//school_supplies
//5
//3.8
//end
