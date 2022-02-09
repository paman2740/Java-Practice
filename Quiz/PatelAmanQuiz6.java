/*
My name is Aman Patel.
Prob  : I am trying to bild an array and then ask user how many number of signs
        does need "+" sign if positive number and "-" if negative.
Step 1: define array and necessary variables.
Step 2: ask user how many line they ned in other words size of array and define
        the size of array.
Step 3: Create a loop for asking all the number you neer for displaying signs. 
Step 4: Now create another loop for displaying the signs using if statement for
        positive number entered and negative and also for zero.
*/
import java.util.Scanner;
public class PatelAmanQuiz6
{

   public static void main(String args[])
   {
   int n[];// Array
   int size,i,s;// for loop and size of array.
   String sign;// for signs 
   Scanner get=new Scanner(System.in);
   System.out.print("How many lines do you need? ");
   size=get.nextInt();
   n=new int[size];//defining the size of array.
   for(s=0; s<size; s++)//taking input for signs 
   {
   System.out.printf("Please enter %dth number ? ",s+1);
   n[s]=get.nextInt();
   }
   for(s=0; s<size; s++)//for displaying signs.
   {
   sign="";
   if(n[s] >0)// for positive number 
   {
      for(i=1; i<=n[s]; i++)
      {
      sign=sign+"+";
      }
   }
   else if(n[s]<0)// for negative number 
   {
      for(i=-1;i>=n[s];i--)
      {
      sign=sign+"-";
      }
   }
   else// for zero
      sign="";
   
   System.out.printf("%d : %s\n",s+1,sign);
   
   }// end of loop for displaying signs.

 }// end of main method.

}// end of class.