/*
this method is for creating circle object.
parameters radius
special methods area, perimeter, toString
*/
public class Circle extends Shape
{
   private double radius;
   //private double width;
   
   //default constructor just create shape with name Rectangle with no length and with
   public Circle()
   {
   super("Circle");
   }
   
   public Circle(double r)
   {
   super("Circle");
   setRadius(r);
   //setWidth(w);
   }
   
   //set method
   public void setRadius(double r)
   {
   if(r>0)
      radius=r;
   else
      radius=r; //radius cannot be negative or 0
   }
   
   //get methods
   public double getRadius(){return radius;}
   
   
   //define area
   public double area()
   {
   return 3.14*(radius)*(radius);
   }
   
   //define perimeter
   public double perimeter()
   {
   return 2*3.14*radius;
   }
   
   public String toString()
   {
   return String.format("%s[%-6.2f] %20.2f %15.2f \n",getName(),radius,area(),perimeter());
   }
}