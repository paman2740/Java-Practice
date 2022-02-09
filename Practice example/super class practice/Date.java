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
   
   public void setMonth(int m)
   {month=m;}
   public void setDay(int d)
   {day=d;}
   public void setYear(int y)
   {year=y;}
   
   public int getMonth()
   {return month;}
   public int getDay()
   {return day;}
   public int getYear()
   {return year;}
   
   public String toString()
   {
   return String.format("%02d/%02d/%04d",month,day,year);
   }
   
   
   
   


}
