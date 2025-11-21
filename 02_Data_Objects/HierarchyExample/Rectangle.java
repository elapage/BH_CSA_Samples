/**
 * Rectangle
 */

 public class Rectangle extends Shape
 {
    private double length, width;

    public Rectangle(int startingPoint, double length, double width)
    {
        super(startingPoint, "PURPLE");
        this.length = length;
        this.width = width;
    }

    public String toString()
    {
        String message = "RECTANGLE " + super.toString() + " " + length + " x " + width;
        return message;
    }

 }