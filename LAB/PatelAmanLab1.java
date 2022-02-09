/* My name is Aman Patel, and this is my first Lab class here at WKU.
   And I am enjoying it. 

*/

import java.util.Scanner;

public class AmanPatelLab1 
{
      
     public static void main(String args[])
     {
       //Variables      
       double firstnumber,secondnumber,thirdnumber,average;
     
       //get input        
       Scanner input=new Scanner(System.in);
       
        // take input for first number. //
       System.out.print("Please enter the First Number : ");
       firstnumber=input.nextDouble();
        // take input for second number. //        
       System.out.print("Please enter the Second Number : ");
       secondnumber=input.nextDouble();
        // take input for third number. //
       System.out.print("Please enter the Third Number : ");
       thirdnumber=input.nextDouble();

        // give the formula for average        
       average=(firstnumber+secondnumber+thirdnumber)/3;
       
       // display
       System.out.println("First Number : "+firstnumber+"\nSecond Number :  "+secondnumber+"\nThird Number :  "+thirdnumber+"\nAverage = " +average);

     }  
   
}