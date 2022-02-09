/*
My name is Aman Patel.
Problem : Determining first N EMIRP.
Step1 :Take input for the boundary till what number we need to
       find the EMIRP numbers.
Step2 :Create method prime for determining prime number first:
Step3 :Create method reverse for reversing prime number and 
       use method prime to see if that reversed number is prime or not.   
Step4 :Display it in main method.
*/
import java.util.Scanner;
public class PatelAmanHomework3

{
      public static void main(String args[])
      {
       int n=2;
       int counter,N;
       counter=0;
       Scanner get=new Scanner(System.in);
       System.out.print("Please enter an integer : ");
       N=get.nextInt();//for boundary till what number we want EMPRIM number.
       while(counter<N)
         if(prime(n)==true)
            {
            if(reverse(n)==true)
         {
         System.out.printf("%-3d : %5d \n",counter,n);
         n++;
         counter++;
         }
         else
         n++;//because counter cannot be increased if the prime number is not the EMIRP. 
         }
         else
         n++;//because counter cannot be increased if the number is not even prime number. 
      }//end main method.
      
      public static boolean prime(int n)
      {
      int d;//for finding if the given number is prime number
            // or not by dividing it by d.
      for(d=2; d<=n/2; d++)
         {
         if(n%d==0)
         return false;
         }
    
         return true;
      }//end prime method
      
       public static boolean reverse(int n)
       {
       String str1;//for converting int into string.
       String str2;//for creating reverse string.
       int n1,i;//n1 for converting str2 to number.
                //i for representing index of numbers.
       n1=0;
       str2="";
       str1=""+n;
       i=str1.length()-1;
       while(i>=0)
       {
       str2=str2+str1.charAt(i);
       i--;
       n1=Integer.parseInt(str2);
       }
       if(prime(n1)==true)
       return true;
       else 
       return false;
       }//end reverse method.
      


}//end class.