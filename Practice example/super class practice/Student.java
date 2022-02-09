public class Student extends Pearson
{
   private double grade;
   
   public Student()
   {
   super();
   }
   public Student(String first,String last,Date dob, double grade)
   {
   super(first,last,dob);
   setGrade(grade);
   }
   public void setGrade(double g)
   {
   if(g<0 || g>4)
   grade=1;
   else
   grade=g;
   }
   public double getGrade()
   {return grade;}
   
   public String toString()
   {
   return String.format("Students name is %s grade is %.2f",super.toString(),grade);
   }
   


}