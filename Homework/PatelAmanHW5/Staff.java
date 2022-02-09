/*
this is a subclass of Employee class.
*/
public class Staff extends Employee
{
   private double hour;
   private double wage;
   private double week;
   private double salary;
   
   public Staff()
   {
   super();
   }
   public Staff(String f,String l,Date d,String t,double h,double w,double we)
   {
   super(f,l,d,t);
   setHour(h);
   setWage(w);
   setWeek(we);
   setSalary();
   }
   //set methods//
   public void setHour(double h)
   {
   hour=h;
   }
   public void setWage(double w)
   {
   wage=w;
   }
   public void setWeek(double w)
   {
   week=w;
   }
   public void setSalary()
   {
   salary=hour*week*wage;
   }
   //get methods//
   public double getHour(){return hour;}
   public double getWage(){return wage;}
   public double getWeek(){return week;}
   public double getSalary(){return salary;}
   
   
   public String toString()
   {
   return String.format("%s %s(%s : %s)",getFirst(),getLast(),getEmail(),getTitle());
   }

   
}