/*
this is a subclass of Pearson class.
*/
public class Student extends Pearson
{
   private double gpa;
   private String rank;
   private String email;
   private static int count=0;
   
   public Student()
   {
   super();
   }
   public Student(String f, String l, Date d, double g,String r)
   {
   super(f,l,d);//We dont have to create new set and get methods for the parameters already assigned in super class//
   setGpa(g);
   setRank(r);
   setEmail();
   count++;//will help for creating email.
   }
   //set methods//
   public void setGpa(double g)
   {
   if(g<1 || g>4)
   gpa=1;
   else
   gpa=g;
   } 
   public void setRank(String r)
   {
   rank=r;
   }
   public void setEmail()
   {
   email=getLast()+"."+getFirst()+count+"@topper.wku.edu";
   }
   //get methods//
   public double getGpa(){return gpa;}
   public String getRank(){return rank;}
   public String getEmail(){return email;}
   //because most of the student dont work.//
   public double getSalary(){return 0;}
   
   public String toString()
   {
   return String.format ("%s %s(%s:%s)",getFirst(),getLast(),email,rank);
   }
   
   

}