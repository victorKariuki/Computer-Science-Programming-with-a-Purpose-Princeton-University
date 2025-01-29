public class RandomWalkers {

    // Method to simulate a single random walk and return the number of steps
    public static int randomWalk(int r) {
        // Initialize the starting position (0, 0)
        int x = 0;
        int y = 0;
        int steps = 0;

        // Keep walking until Manhattan distance is r
        while (Math.abs(x) + Math.abs(y) < r) {
            // Randomly choose one of the four directions (north, east, south, west)
            double random = Math.random();
            if (random < 0.25) {
                y++;  // Move north
            }
            else if (random < 0.5) {
                x++;  // Move east
            }
            else if (random < 0.75) {
                y--;  // Move south
            }
            else {
                x--;  // Move west
            }

            // Increment the step counter
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        // Read the command-line arguments
        int r = Integer.parseInt(args[0]);  // Manhattan distance
        int trials = Integer.parseInt(args[1]);  // Number of trials

        // Accumulate the total number of steps for all trials
        int totalSteps = 0;

        // Run the random walk trials
        for (int i = 0; i < trials; i++) {
            totalSteps += randomWalk(r);
        }

        // Calculate the average number of steps
        double averageSteps = totalSteps / (double) trials;

        // Print the result
        System.out.println("average number of steps = " + averageSteps);
    }
}