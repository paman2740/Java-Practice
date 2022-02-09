import java.util.Scanner;
public class AmanPatelquiz1
{

   public static void main(String args[])
   {
   int number;
   
   Scanner input=new Scanner(System.in);
   System.out.print("Enter the number of the day of month : ");
   number=input.nextInt();
  
   if(number>31)
   System.out.println("Error");
   
   if(number<1)
   System.out.println("Error");
   
   
  else 
  
  {
   number=number%7;
   if(number==1)
   
   {
    System.out.println("Today is Sunday.");
   }
   
    if(number==2)
   {
    System.out.println("Today is Monday.");
   }
   
    if(number==3)
   {
    System.out.println("Today is Tuesday.");
   }
   
    if(number==4)
   {
    System.out.println("Today is Wednesday.");
   }
   
    if(number==5)
   {
    System.out.println("Today is Thursday.");
   }
   
    if(number==6)
   {
    System.out.println("Today is Friday.");
   }
   
    if(number==7)
   {
    System.out.println("Today is Saturday.");
   }
   
  } 
   
   
  }
   



}