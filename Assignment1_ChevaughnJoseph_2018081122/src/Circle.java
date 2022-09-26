public class Circle {

    private final double PI = 3.14;

    public double Area(double radius){
        double area = PI * (radius * radius);
        return area;
    }

    public double Circumference(double radius){
        double circumference = 2 * PI * radius;
        return circumference;
    }

}
