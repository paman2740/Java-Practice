/* 
Aman PAtel
CS 180 Lab1

Problem: Computing discounted price of an item when original price 
         and discount rate are given

My solution:
1) First define three variables, price, rate, and discPrice
   to store original price, discount rate, and discounted price respectively.  
   Also define Scanner variable to read price and rate from the keyboard
2) use formula given to determine discounted price
3) Display result as indicated in the lab

*/


import java.util.Scanner;

public class PatelAmanLab1

{

   public static void main(String args[])
   
   {
   /*
    -> declaring variables.
    -> discrate is discounted rate.
    -> rate is the original price of product.
    -> and disc is the discountgive to that product.  
   */ 
   
   double discrate,rate;
   int disc;
   
   Scanner input=new Scanner(System.in);
   
   //taking input from user//
   System.out.print("enter the original cost of product : "+"$ ");
   rate=input.nextDouble();
   System.out.print("enter the percentage of discount for the product : ");
   disc=input.nextInt();

   //formula for discount//
   discrate=rate-rate*disc/100.0;
   
   // Display //
   System.out.println("Original Price:  " +"$ "+ rate);
   System.out.println("Discount: "+ disc+ "%"); 
   System.out.println("Discounted Price: " +"$ "+ discrate);
   
   
   
   }
}
