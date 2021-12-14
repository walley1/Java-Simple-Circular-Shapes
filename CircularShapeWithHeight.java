/**
 * Add class comment and @tags
* This class will model an abstract superclass of a generic circular shape that has a radius and a height. 
*
* @author Austin Walley
* @version 10/3/21
 */

public abstract class CircularShapeWithHeight 
{
    /**
    * Declare and initialize 2 instance variables.
    */
    private double radius;
    private double height;
        
    /**
    * Create a constructor.
    * @param radius of radius.
    * @param height of height.
    */
    public CircularShapeWithHeight(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }
        
    /**
    * Accessor method that returns diameter.
    * @return radius
    */
    public double getDiameter()
    {
        return this.radius*2;
    }

    /**
    * Accessor method that returns radius.
    * @return radius
    */
    public double getRadius()
    {
        return this.radius;
    }
        
    /**
    * Accessor method that returns height.
    * @return height
    */
    public double getHeight()
    {
        return this.height;
    }

    /**
    * Accessor method that returns the cross section area.
    * @return 3.14159265 * radius * radius
    */
    public double getCrossSectionArea()
    {
        return 3.14159265 * radius * radius;
    }

    /**
    * Accessor method that returns the cross section perimeter.
    * @return 2 * 3.14159265 * radius
    */
    public double getCrossSectionPerimeter()
    {
        return 2 * 3.14159265 * radius;
    }
}
