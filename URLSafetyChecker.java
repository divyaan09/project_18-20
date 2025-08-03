import java.net.URL;
import java.util.Scanner;

public class URLSafetyChecker {

    // Simple hardcoded blacklist
    static String[] blacklist = {
        "badwebsite.com",
        "malicious-site.net",
        "phishing-login.org"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== URL Safety Checker ===");

        System.out.print("Enter URL: ");
        String inputUrl = sc.nextLine();

        if (!inputUrl.startsWith("http")) {
            inputUrl = "http://" + inputUrl;
        }

        try {
            URL url = new URL(inputUrl);
            String host = url.getHost();

            System.out.println("\nAnalyzing URL...");
            Thread.sleep(1000);

            // Rule 1: HTTPS Check
            if (url.getProtocol().equals("https")) {
                System.out.println("✔ Uses HTTPS (Good)");
            } else {
                System.out.println("⚠ Uses HTTP (Not Secure)");
            }

            // Rule 2: IP Address Check
            if (host.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
                System.out.println("⚠ URL uses IP address instead of domain (Suspicious)");
            }

            // Rule 3: Subdomain Count
            String[] parts = host.split("\\.");
            if (parts.length > 3) {
                System.out.println("⚠ Too many subdomains (Possibly suspicious)");
            }

            // Rule 4: Blacklist Check
            for (String bad : blacklist) {
                if (host.contains(bad)) {
                    System.out.println("❌ Domain is in known blacklist!");
                    break;
                }
            }

            System.out.println("\n✅ Basic URL safety check completed.");

        } catch (Exception e) {
            System.out.println("❌ Invalid URL format.");
        }
    }
}
