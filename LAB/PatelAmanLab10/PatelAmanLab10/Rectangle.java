/*
/*
this method is for creating Rectangle object.
parameters length,width.
special methods area, perimeter, toString.
*/
public class Rectangle extends Shape
{
   private double length;
   private double width;
   
   //default constructor just create shape with name Rectangle with no length and with
   public Rectangle()
   {
   super("Rectangle");
   }
   
   public Rectangle(double l, double w)
   {
   super("Rectangle");
   setLength(l);
   setWidth(w);
   }
   
   //set method
   public void setLength(double l)
   {
   if(l>0)
      length=l;
   else
      length=1.0; //length cannot be negative or 0
   }
   
   public void setWidth(double w)
   {
   if(w>0)
      width=w;
   else
      width=1.0; //width cannot be negative or 0
   }

   //get methods
   public double getLength(){return length;}
   public double getWidth(){return width;}
   
   //define area
   public double area()
   {
   return length*width;
   }
   
   //define perimeter
   public double perimeter()
   {
   return 2*(length+width);
   }
   
   public String toString()
   {
   return String.format("%s[%.2fx%6.2f] %11.2f %15.2f\n",getName(),length,width,area(),perimeter());
   }
} 