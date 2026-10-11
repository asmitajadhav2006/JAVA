import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class dnslookup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== DNS Lookup Tool ===");
        System.out.println("1. Find IP Address from Domain Name (Forward Lookup)");
        System.out.println("2. Find Domain Name from IP Address (Reverse Lookup)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Domain Name (e.g., google.com): ");
                String domain = scanner.nextLine().trim();
                performForwardLookup(domain);
                break;

            case 2:
                System.out.print("Enter IP Address (e.g., 8.8.8.8): ");
                String ipAddress = scanner.nextLine().trim();
                performReverseLookup(ipAddress);
                break;

            default:
                System.out.println("Invalid choice! Please restart the program and select 1 or 2.");
        }

        scanner.close();
    }

    /**
     * Resolves a domain name / host name to its corresponding IP address.
     */
    private static void performForwardLookup(String domain) {
        try {
            // Fetch the InetAddress using the domain name
            InetAddress inetAddress = InetAddress.getByName(domain);

            System.out.println("\n--- Forward DNS Lookup Results ---");
            System.out.println("Domain Name: " + domain);
            System.out.println("IP Address : " + inetAddress.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("\nError: Could not resolve domain '" + domain + "'. " + e.getMessage());
        }
    }

    /**
     * Resolves an IP address back to its registered domain / host name.
     */
    private static void performReverseLookup(String ipAddress) {
        try {
            // Get the InetAddress using the literal IP address string
            InetAddress inetAddress = InetAddress.getByName(ipAddress);

            System.out.println("\n--- Reverse DNS Lookup Results ---");
            System.out.println("IP Address : " + ipAddress);

            // getHostName() performs the reverse DNS query if required
            System.out.println("Domain Name: " + inetAddress.getHostName());

        } catch (UnknownHostException e) {
            System.out.println("\nError: Could not resolve IP Address '" + ipAddress + "'. " + e.getMessage());
        }
    }
}