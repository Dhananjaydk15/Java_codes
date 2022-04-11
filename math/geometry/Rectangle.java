package math.geometry;
import java.lang.Math;
public final class Rectangle {
    public static double AreaOfRectangle(double lenght, double width){
        return lenght * width ;
    }
    public static double PerimeterOfRectangle(double lenght, double width){
        return 2*(lenght*width);
    }
    public static double DiagonalOfRectangle(double lenght, double width){
        double diagonal = (double)Math.sqrt(((lenght*lenght) + (width*width)));
        return Math.round(diagonal);
     }
}
