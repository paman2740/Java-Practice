/*
Aman Patel.
Problem : Take input for five integers and revese them.
Step 1: take input for 5 numbers.
Step 2: write a code for method reverse that take the
        information and return the reverse of that number.
Step 3: Convert the integer into string.
Step 4: Using charAt and length methods reverse string. 
Step 5: Now using parse method convert that string into integer.
Step 6: Using the method we created for reverse display the output.
*/ 

import java.util.Scanner;
public class PatelAmanLab6
{

   public static void main(String args[])
   
   {
   int n1,n2,n3,n4,n5;//defining variables for five integers.
   Scanner input=new Scanner(System.in);
   System.out.println("Please enter 5 positive numbers : ");
   n1=input.nextInt();
   n2=input.nextInt();
   n3=input.nextInt();
   n4=input.nextInt();
   n5=input.nextInt();
   
   System.out.printf("Order %-10s Numbers %-10s Reverse\n"," "," ");
   System.out.printf("----- %-10s -------- %-10s---------\n"," "," ");
   System.out.printf("  1   %-10s %-20d %d\n"," ",n1,reverse(n1)); //calling method for first integer and so on            
   System.out.printf("  2   %-10s %-20d %d\n"," ",n2,reverse(n2));
   System.out.printf("  3   %-10s %-20d %d\n"," ",n3,reverse(n3));
   System.out.printf("  4   %-10s %-20d %d\n"," ",n4,reverse(n4));
   System.out.printf("  5   %-10s %-20d %d\n"," ",n5,reverse(n5));
  
 
   }
   public static int reverse(int n)
   {
   String str1,str2;// will help me for converting int to string and later cganging it to int.
   int m,d;// d is for getting integer back from str2 and 
           //m for index of str1 that we will be using in loop.
   str1=""+n;//converting int n into string str1.
   str2="";
   m=str1.length()-1;// because length starts with 1 and index with 0.
   while(m>=0)
   {
   str2=str2+str1.charAt(m);
   m--;
   }
   d=Integer.parseInt(str2);//converting str2 into string.
   return d;

   }

}