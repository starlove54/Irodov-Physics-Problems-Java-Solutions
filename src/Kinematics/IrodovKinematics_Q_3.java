package Kinematics;
// question
// A car starts moving rectilinearly,
// first with acceleration ω = 5.0 m/s2 (the initial velocity is equal to zero),
// then uniformly, and finally, decelerating at the same rate ω, comes to a stop.
// The total time of motion equals τ = 25 s. The average velocity during that time is
// equal to (v) = 72 km per hour. How long does the car move uniformly?

import java.util.Scanner;
public class IrodovKinematics_Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the acceleration (ω) m/s²:");
        double ω = scanner.nextDouble();

        System.out.println("Enter the total time of motion (τ) in secs:");
        double τ = scanner.nextDouble();

        System.out.println("Enter the average velocity (v) in km/h:");
        double v = scanner.nextDouble();

        // Validate input constraints
        if (ω <= 0 || τ <= 0 || v <= 0) {
            System.out.println("Acceleration, total time, and average velocity must be positive. Please enter valid values.");
            return;
        }

        // Example: Calculate time for uniform motion using the provided method
        double timeForUniformMotion = calculate(ω, τ, v);

        // Print the result rounded to 2 decimal places
        System.out.printf("Time for Uniform Motion: %.2f seconds%n", timeForUniformMotion);
    }


    public static double calculate(double ω, double τ, double v) {
        // convert v in m/s
        double newV = (v*1000/(60*60));
        // time for acceleration and deceleration would be same let that time be t
        // distance covered during acceleration and deceleration would be same
        // for constant velocity, time can be calculated as total time - 2t =>  τ- 2t
        // velocity when no acceleration
        // from v = u + at  we have => v  = ωt
        // distances covered during both acceleration and deceleration would be
        // 2(1/2ωt²)  => ωt²
        // distance covered during constant velocity is ωt( τ- 2t)
        // avg velocity  = total distance/total time
        // total distance = ωt²  + ωt(τ- 2t)
        // equation becomes => total distance  / τ  =  newV
        // solving for t we get = (ωτ  ± Math.sqrt(ω²τ² - 4ωτnewV))/ 2ω
        // two possible values of t let us called it
        double t_oneValue =  (ω*τ  + (Math.sqrt(Math.pow(ω,2)*Math.pow(τ,2)- 4*ω*τ*newV)))/ (2*ω);
        double t_otherValue =  (ω*τ  - (Math.sqrt(Math.pow(ω,2)*Math.pow(τ,2)- 4*ω*τ*newV)))/ (2*ω);

        // t1 be the time for when velocity is constant
        if(2*t_oneValue >=  τ){
            double t1 = τ- 2*t_otherValue;
            return t1;

        }else{
            double t1 = τ- 2*t_oneValue;
            return t1;
        }
    }

}