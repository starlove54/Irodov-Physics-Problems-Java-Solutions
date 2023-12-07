package Kinematics;

public class IrodovKinematics_Q_10 {

    public static void main(String[] args) {

        double result = calculate(1.7, 60, 25);
        System.out.println(roundToTwoDecimalPlaces(result));
    }

    private  static double calculate(double t, double angle, double v){
        //get the final state of both bodies and calculate distance between them
//      int x1 = 0;   x displacement of first body never changes after t secs
//      int y1  = 25*t - 1/2*g*t²   y displacement after t secs

//        int x2  =  25*cos60*t x displacement of second body after t secs
//        int y2 = 25*sin60*t  - 1/2*g*t² y displacement of second body after t secs
// Convert angle to radians
        double angleInRadians = Math.toRadians(angle);

        double cosSixety =  Math.cos(angleInRadians) ;
        double sineSixety = Math.sin(angleInRadians) ;

        // distance = square root of (x2  - x1 )²  - (y2 - y1)²
        return Math.sqrt(Math.pow(25*cosSixety*t,2)  + Math.pow(25*sineSixety*t - 25*t,2));

    }
    private static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
