/*
My name is Aman Patel 
This code will demostrate nested loop to print the following table when integer n is given
   For example if n=6
   
               1
            1  2  1
         1  2  3  2  1
       1 2  3  4  3  2  1
     1 2 3  4  5  4  3  2  1
   1 2 3 4  5  6  5  4  3  2 1

Step 1: Declaring variables.
Step 2: Checking if number is positive or not.
Step 3: Using for loop print white space for that line.
Step 4: Using for loop first half of table which will be increasing.
Step 5: Using onether loop print next half which will be in decending order.
Step 6: Usiong println so it goes to next line and repeat the same process.  
   
*/

import java.util.Scanner;

public class PatelAmanLab5
{
      public static void main(String args[])
      {
      //variables....
      int number; //to store positive integer
      int i,j;    //for loop
      Scanner get=new Scanner(System.in);
      
      //get input number
      System.out.printf("Please enter a positive integer: ");
      number=get.nextInt();
      
      //make sure that user enters positive numnber
      while(number<=0)
           {
           System.out.printf("You have not entered a postive number %d\n",number);
           System.out.printf("Enter a positive integer: ");
           number=get.nextInt();
           }
      
      //now display table
      for(i=1;i<=number;i++)    //outher loop for rows..
         {
         //in i-th row there are number-i white sppace and i number of digits
         //first place number-i white space
         for(j=1;j<=number-i;j++)
            System.out.printf("%3s", " ");
         
         //now follow those white space with digits in degreasing order like 1,2,3,4,5...
            
         for(j=1;j<=i;j++)
            System.out.printf("%3d", j);
         
         //now add ...4,3,2,1.
         for(j=i-1;j>0;j--)
            System.out.printf("%3d", j);
            
         //after i-th row go to next line
         System.out.println();
         } 
      
      }


}