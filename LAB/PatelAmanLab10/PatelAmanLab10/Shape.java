/* The following class is describing a Shape class
   This is a description of geometric shape and we do only know 
   name of the object. 
   Most of methods such as 
      area() //computes area of the shape
      perimeter() //perimeter of the sahape
      ..
   cannot be defined because there is no enough parameters
*/
   
   
public abstract class Shape
{
   private String name;
   
   public Shape()
   {
   }
   
   public Shape(String name)
   {
   setName(name);
   }
   
   //set methods
   public void setName(String name)
   {
   this.name=name;
   }
   
   //get methods
   public String getName(){return name;}

   //abstract methods that cannot be defined as this point
   public abstract double area();
   public abstract double perimeter();
   public abstract String toString();
 }