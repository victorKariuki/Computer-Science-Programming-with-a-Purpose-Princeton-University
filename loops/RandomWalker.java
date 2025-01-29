public class RandomWalker {
    public static void main(String[] args) {
        // Check if the command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java RandomWalker <distance>");
            return;
        }

        // Parse the input command-line argument
        int r = Integer.parseInt(args[0]);

        // Initialize variables for the starting point (0, 0)
        int x = 0;
        int y = 0;
        int steps = 0;

        // Print the starting point
        System.out.println("(" + x + ", " + y + ")");

        // Continue walking until the Manhattan distance reaches r
        while (Math.abs(x) + Math.abs(y) != r) {
            // Generate a random direction (north, east, south, west) without using Random
            int direction = (int) (System.currentTimeMillis()
                    % 4); // % 4 will give values between 0 and 3

            // Update the coordinates based on the random direction
            if (direction == 0) {
                y++;  // Move north
            }
            else if (direction == 1) {
                x++;  // Move east
            }
            else if (direction == 2) {
                y--;  // Move south
            }
            else {
                x--;  // Move west
            }

            // Increment the step count
            steps++;

            // Print the current coordinates
            System.out.println("(" + x + ", " + y + ")");
        }

        // Print the total number of steps taken
        System.out.println("steps = " + steps);
    }
}