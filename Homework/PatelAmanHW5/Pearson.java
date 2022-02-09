/*
this is a pearson class. It is an abstract class because we cannot tell yet how much is the salary of a person or the gpa.

*/
public abstract class Pearson
{
   public String fName;
   public String lName;
   public Date date=new Date();
   
   public Pearson()
   {
   }
   
   public Pearson(String f,String l, Date d)
   {
   setFirst(f);
   setLast(l);
   setDate(d);
   }
   //set methods//
   public void setFirst(String f)
   {
   fName=f;
   }
   public void setLast(String l)
   {
   lName=l;
   }
   public void setDate(Date d)
   {
   date=d;
   }
   //get methods.//
   public String getFirst(){return fName;}
   public String getLast(){return lName;}
   public Date getDate(){return date;}
   //Abstract methods// or the methods we dont have all the parameters for.
   public abstract double getSalary();
   public abstract double getGpa();
   public abstract String toString();
  

}
