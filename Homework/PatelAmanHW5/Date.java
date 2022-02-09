/*
This is just a help for the homework which will help me assign a date and also compare it.

*/
public class Date
{
   private int day;
   private int month;
   private int year;
   
   public Date()
   {
   
   }
   public Date(int month, int day, int year)
   {
   setMonth(month);
   setDay(day);
   setYear(year);
   }
   //set methods//
   public void setMonth(int m)
   {month=m;}
   public void setDay(int d)
   {day=d;}
   public void setYear(int y)
   {year=y;}
   //get methods//
   public int getMonth()
   {return month;}
   public int getDay()
   {return day;}
   public int getYear()
   {return year;}
   //returns date as a string.//
   public String toString()
   {
   return String.format("%02d/%02d/%04d",month,day,year);
   }
   /*
   this method will count the number of days from the given date till 12/30/2019.
   which will help me comparing two dates.
   
   */
   public int days()
   {
   return ( ((2019-getYear())*365) + (30-getDay()) + (12-getMonth()) );
   }
   
   
   
   


}