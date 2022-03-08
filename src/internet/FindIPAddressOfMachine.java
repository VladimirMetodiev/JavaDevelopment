package internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIPAddressOfMachine {
    public static void main(String[] args) {
        try {
            InetAddress ipAddress = InetAddress.getLoopbackAddress();
            System.out.println(ipAddress);

            ipAddress = InetAddress.getLocalHost();
            System.out.println("IP address of the machine is: " + ipAddress);

            ipAddress = InetAddress.getByName("DESKTOP-0G16AOQ");
            System.out.println("An IP address for the given host name: " + ipAddress);

            InetAddress[] array = InetAddress.getAllByName("DESKTOP-0G16AOQ");
            System.out.println("All the IP addresses for the given host name:");
            for(InetAddress i : array) System.out.println(">>> " + i);
        }
        catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
