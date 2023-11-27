package Kinematics;

import java.util.Scanner;


// question
// A motorboat going downstream overcame a raft at a point A; T = 60 min later it turned back and
// after some time passed the raft at a distance l = 6.0 km from the point A. Find the flow velocity
// assuming the duty of the engine to be constant.


public class IrodovKinematics_Q_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the displacement (l) of raft before it meets motorboat again in kilometres:");
        double l = scanner.nextDouble();

        System.out.println("Enter the total time (t) in minutes before the raft turns back:");
        double t = scanner.nextDouble();

        // Validate input constraints
        if (l <= 0 || t <= 0) {
            System.out.println("Displacement and total time must be positive. Please enter valid values.");
            return;
        }

        // Example: Calculate speed of raft using the provided method
        double speedOfRaft = calculate(l, t);

        // Print the result
        System.out.printf("Speed of Raft: %.2f m/s%n", speedOfRaft);
    }

    public static double calculate(double l, double t){
        //frame of reference from the ground
        //let speed of raft = v0 = speed of downstream river
        // let speed of motorboat = vm
        // let time taken for the boat from turning to crossing raft be t1
        // let t + t1 = total time
        // displacement of raft = l = (t + t1 ) * v0
        // t1 = (l/v0) - t    equation 1
        // t*(vm + v0) + t1(-vm  + v0) = (t1 + t) * v0   equation 2
        // substituting equation 1 into equation 2 we get
        // 2t*vm = l*vm/(v0)
        // v0 = l/2t
        double newL = l*1000; //in metres
        double newT = t*60;  // in secs
        return newL/(2*newT);
    }
}
