/**
 *  Shape super class
 */

 public class Shape
 {
    private int startingPoint;
    private String colour;

    public Shape(int startingPoint, String colour)
    {
        this.startingPoint = startingPoint;
        this.colour = colour;
    }

    public int getStartingPoint()
    {
        return startingPoint;
    }

    public String getColour()
    {
        return colour;
    }

    public String toString()
    {
        String message = "(" + colour + ") @ " + startingPoint;
        return message;
    }
 }