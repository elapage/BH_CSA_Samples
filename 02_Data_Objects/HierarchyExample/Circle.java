/**
 * Shapes hierarchy example
 */

 public class Circle extends Shape
 {
    private double radius;

    public Circle(int startingPoint, double radius)
    {
        super(startingPoint, "PINK");
        this.radius = radius;
    }

    public String toString()
    {
        String message = "CIRCLE " + super.toString() + ", " + radius;
        return message;
    }    
 }