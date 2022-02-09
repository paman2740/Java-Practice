/*
this is a subclass of Employee class.
*/
public class Faculty extends Employee
{
   private double salary;
   
   public Faculty()
   {
   super();
   }
   public Faculty(String f,String l,Date d, String t,double s)
   {
   super(f,l,d,t);
   setSalary(s);
   }
   //set method//
   public void setSalary(double s)
   {
   salary=s;
   }
   //get method//
   public double getSalary(){return salary;}
   
   public String toString()
   {
   return String.format("%s %s(%s :%s)",getFirst(),getLast(),getEmail(),getTitle());
   }

}