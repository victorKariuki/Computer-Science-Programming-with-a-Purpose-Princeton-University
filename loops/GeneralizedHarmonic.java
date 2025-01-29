public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // Parse command-line arguments
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double harmonicNumber = 0.0;

        // Compute the generalized harmonic number using a for loop
        for (int k = 1; k <= n; k++) {
            double term = 1.0;
            for (int i = 0; i < r; i++) {
                term /= k;
            }
            harmonicNumber += term;
        }

        // Print the result
        System.out.println(harmonicNumber);
    }
}
