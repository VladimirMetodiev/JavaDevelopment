package regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckUpIP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some IP:");

        String data = input.nextLine();

        if(checkUp(data)) System.out.println("It is valid.");
        else System.out.println("It isn't valid.");
    }

    private static boolean checkUp(String data) {
        return Pattern.matches("((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])", data);
    }
}



//IP address
//0-255.0-255.0-255.0-255



//Tests

//0.0.0.0
//255.255.255.255
//25.204.116.83
//109.11.2.249
//225.222.201.180
//3.245.72.146
//6.7.8.9
//180.3.262.15
//2.035.200.100
