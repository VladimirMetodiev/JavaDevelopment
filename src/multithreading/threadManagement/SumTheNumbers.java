package multithreading.threadManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumTheNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Thread> sellers = new ArrayList<>();

        System.out.println("Enter the count of sellers:");
        int count = Integer.parseInt(reader.nextLine());

        for (int a = 0; a < count; a++) {
            System.out.println("Enter sales:");
            double[] values = Arrays.stream(reader.nextLine().split(",\\s+")).mapToDouble(Double::parseDouble).toArray();
            sellers.add(new Thread(new Sum(values)));
        }

        for(int b = 0; b < count; b++){
            sellers.get(b).start();
            try{
                if(sellers.get(b).isAlive()) sellers.get(b).join();     // Ако нишката се изпълнява, изчакай докато приключи
                System.out.printf("seller %d%n", b + 1);
            }
            catch (InterruptedException ex){
            }
        }
    }
}

class Sum implements Runnable {
    private double total = 0.0;
    private double[] values = null;

    public Sum(double[] values) {
        this.values = values;
    }

    @Override
    public void run() {
        for(double val : values){
            total += val;
        }
        System.out.printf("[TOTAL: %.2f] ", total);
    }
}



//Test

//3
//5600, 4200, 650.5, 9820, 4326.85
//15846.6, 2045, 8321.16, 9450
//5000, 5000, 650.75, 2640.8, 1200, 8647.85
