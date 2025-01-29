public class BandMatrix {
    public static void main(String[] args) {
        // Parse command-line arguments
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column
            for (int j = 0; j < n; j++) {
                // Check if the element is within the band based on distance
                int distance = i - j;
                if (distance < 0) {
                    distance = -distance; // Absolute value without Math.abs
                }
                if (distance <= width) {
                    System.out.print("*"); // Print an asterisk
                }
                else {
                    System.out.print("0"); // Print a zero
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
