/*
this is a subclass of a Pearson class and here we dont have the salary of an employee so its abstract.
*/
public abstract class Employee extends Pearson
{
   private String title;
   private String email;
   private static int count=0;
   
   public Employee()
   {
   super();
   }
   public Employee(String f,String l,Date d, String t)
   {
   super(f,l,d);//as we have defined set and get methods in super class we dont have to define them again in subclass//
   setTitle(t);
   setEmail();
   count++;//for creating email.//
   }
   //set methods.
   public void setTitle(String t)
   {
   title=t;
   }
   public void setEmail()
   {
   email=getLast()+"."+getFirst()+count+"@.wku.edu";
   }
   //get methods//
   public String getTitle(){return title;}
   public String getEmail(){return email;}
   public double getGpa(){return 0;}//because employee do not have GPA.

   //Abstract class.//
   public abstract double getSalary();
   public abstract String toString();
   
   
   

}