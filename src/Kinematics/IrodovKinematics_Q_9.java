package Kinematics;

public class IrodovKinematics_Q_9 {

    public static void main(String[] args) {
        double optimalTheta = minimize(2); // Replace 2 with the actual value of n
        System.out.println("Optimal Theta: " + roundToTwoDecimalPlaces(optimalTheta));
    }

    private static double minimize(double n){
        // river velocity = u
        // let us assume a boat with v velocity with some angle Θ to horizontal
        // v sinΘ  component to reach other end
        // v cosΘ  + u velocity that will cause the drift
        // so we have (v cosΘ  + u )* t = x (equation 2) , where x is the drift that has been caused
        // another equation we have is vsinΘ* t = y, where y is the vertical displacement
        // so we can have t = y/(v*sinΘ) (equation 1)
        // we can substitute t from equation 1 to equation 2
        // so we have (v cosΘ + u) * y/vsinΘ = x (equation 3)
        // from the question we know v = u/n
        // solving equation 3 we get (cotΘ + ncosecΘ)y = x
        // now since we want to minimize x so we can take derivative of above solved equation
        // (-cosecΘ²  - ncotΘcosecΘ)y = dx/dΘ
        // now we can have dx/dΘ to be 0 as slope would be zero if there has to be a minimum value there
        // therefore (-cosecΘ²  - ncotΘcosecΘ)y = 0 , solving this we get
        // Using the arccosine function to find the angle Theta
        double cosTheta = -1.0 / n;
        double theta = Math.acos(cosTheta);
        return Math.toDegrees(theta); // Convert radians to degrees if needed
    }


    private static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
