package basicSyntaxExercises;

import java.util.Scanner;

public class DeliveryRoutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the count of customers:");
        int customers = Integer.parseInt(input.nextLine());
        int routes = 1;

        if(customers == 0) return;

        do {
            routes *= customers;
        }
        while (customers-- > 1);

        if(routes > 1) System.out.println("The routes are " + routes);
        else System.out.println("The route is 1");
    }
}



//Condition

//Имаме малка компания, която доставя произведените от нея стоки сама и разполага само с един камион.
//Тя има N на брой клиенти, на (всички) които, ежедневно доставя стока.
//Колко са възможните маршрути за доставка на стока?

