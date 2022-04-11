
package math.geometry;
public final class Circle {
    protected static final double PI = 3.14 ;
    public static double AreaOfCircle(double radius) {
        double area;
        area = PI * (radius * radius);
        return area;
    }
    public static double CircumfereceOfCircle(double radius){
        double circumferece;
        circumferece = 2 * PI * radius;
        return circumferece;
    }
}
