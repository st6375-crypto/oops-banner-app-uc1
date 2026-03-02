
/**
 * OOPS Banner App
 * UC5: Inline array initialization using String.join()
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization
        String[] lines = {
                String.join(" ", "**", "*", "**"),
                String.join(" ", "*", "   *", "   *"),
                String.join(" ", "", "   *", "**"),
                String.join(" ", "*", "   *", "   *"),
                String.join(" ", "**", "*", "**")
        };

        // Enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}