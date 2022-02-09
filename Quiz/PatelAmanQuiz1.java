import java.util.Scanner;

public class AmanPatelQuiz1

{


   public static void main(String args[])
   {
   
   double num1,num2,sum;
   
   Scanner input= new Scanner(System.in);
   
   System.out.print("Enter first number : ");// not used println, because if used user has to enter input in next line.//
   num1=input.nextDouble();
   
   System.out.print("Enter second number : ");
   num2=input.nextDouble();
   
   sum=(num1+num2);
   
   System.out.println("Sum of "+num1+" and "+num2+" is "+sum+". ");
   
    }//end method   



}//end class