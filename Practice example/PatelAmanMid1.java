/*My name is Aman Patel.
I am writing a code to determinie weather a given numbers forms a right angle or not.
Step 1: define variables.
Step 2: Call Scanner method.
Step 3: take input for three different nubmers from keyboard.
Step 4: using if else statement and or operater determine that given numbers form a right triangle or not.
Step 5: Show the display accordingly. 

*/



import java.util.Scanner;
public class PatelAmanMid1
{

   public static void main(String args[])
   {
   int a,b,c;// defining variables
   Scanner input=new Scanner(System.in);
   
   System.out.println("Please enter first number : ");
   a=input.nextInt();
   System.out.println("Please enter second number : ");
   b=input.nextInt();
   System.out.println("Please enter third number : ");
   c=input.nextInt();
   if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(a*a+c*c==b*b))//using or operator for multiple conditions.
   System.out.println(a+" "+b+" "+c+" "+ "form a right-triangle");
   else 
   System.out.println(a+" "+b+" "+c+" "+ "does not form a right-triangle");
  

    
   
   
   
   }
   


}