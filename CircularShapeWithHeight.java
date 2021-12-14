/**
* This class will model an abstract superclass of a generic circular shape that has a radius and a height. 
*
* @author Austin Walley
* @version 10/3/21
 */

public abstract class CircularShapeWithHeight 
{

    private double radius;
    private double height;
        
    public CircularShapeWithHeight(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }
        
    public double getDiameter()
    {
        return this.radius*2;
    }

    public double getRadius()
    {
        return this.radius;
    }
        
    public double getHeight()
    {
        return this.height;
    }

    public double getCrossSectionArea()
    {
        return 3.14159265 * radius * radius;
    }

    public double getCrossSectionPerimeter()
    {
        return 2 * 3.14159265 * radius;
    }
}
