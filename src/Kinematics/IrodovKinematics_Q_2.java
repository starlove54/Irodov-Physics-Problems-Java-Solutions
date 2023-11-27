package Kinematics;

import java.util.Scanner;

// question
//A point traversed half the distance with a velocity v0.
// The remaining part of the distance was covered with velocity v1 for half the time,
// and with velocity v2 for the other half of the time. Find the mean velocity of the point
// averaged over the whole time of motion.

public class IrodovKinematics_Q_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the velocity v0m/s for the first half:");
        double v0 = scanner.nextInt();

        System.out.println("Enter the velocity v1m/s for the second half:");
        double v1 = scanner.nextInt();

        System.out.println("Enter the velocity v2m/s for the second half:");
        double v2 = scanner.nextInt();

        // Validate input velocities
        if (v0 <= 0 || v1 <= 0 || v2 <= 0) {
            System.out.println("Velocities must be positive. Please enter valid values.");
            return;
        }

        // Example: Calculate mean velocity using the provided method
        double meanVelocity = calculate(v0, v1, v2);
        System.out.printf("Mean Velocity: %.2f m/s%n", meanVelocity);
    }

    public static double calculate(double v0 , double v1 , double v2){
//        meanVelocity = totaldistance/totaltime;
        return (2 * v0 * (v1 + v2)) / (v2 + v1 + 2*v0);
    }
}
