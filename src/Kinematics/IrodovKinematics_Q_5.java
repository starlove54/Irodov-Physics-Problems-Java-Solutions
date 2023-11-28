package Kinematics;


//question
// 5. Two particles, 1 and 2, move with constant velocities v1 and v2.
// At the initial moment, their radius vectors are equal to r1 and r2.
// How must these four vectors be interrelated for the particles to collide?
public class IrodovKinematics_Q_5 {

    public static void main(String[] args) {
        printCollisionRelationship();
    }

    public static void printCollisionRelationship() {
        System.out.println("For two particles to collide, their initial position vectors r1 and r2");
        System.out.println("must satisfy the following relationship with their constant velocity vectors v1 and v2:");

        System.out.println("(r2 - r1) / |r2 - r1| = (v2 - v1) / |v2 - v1|");

        System.out.println("\nExplanation:");
        System.out.println("From the vector triangle law of addition, we have:");
        System.out.println("r3 = r1 + v1t = r2 + v2t");

        System.out.println("So, we can find the time of collision (t) as:");
        System.out.println("t = |r1 - r2| / |v2 - v1|");

        System.out.println("Substituting this value of t back into the original relationship, we get the desired equation.");
    }
}
