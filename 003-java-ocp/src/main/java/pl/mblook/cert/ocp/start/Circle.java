package pl.mblook.cert.ocp.start;

/**
 * Hello world!
 *
 */
public class Circle
{
    public static double circleArea(double circleRadius) {
        return 3.14 * circleRadius * circleRadius;
    }
    public static void main( String[] args ) {
        System.out.println( Circle.circleArea(4));
    }
}
