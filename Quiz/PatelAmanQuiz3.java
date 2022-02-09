/*My name is Aman Patel.
Here I am supposed to write a code where a user can play a game with computer. 
game is paper rock and scissors.
step 1:declare variables.
step 2: call random method and take input from computer. 
step 3: take input from user.
step 4 use the input from computer and user to decide who wins. 
step 5 using if statement complet the code and show the winner. 
*/
import java.util.Scanner;
import java.util.Random;

public class PatelAmanQuiz3
{

   public static void main(String args[])
   
   {
      // declaring variables //
      // I have practiced this before on wednesday so my variable name are different from you//
      int computer,player;
      
      // 1= Paper || 2= Rock || 3= Scissors //
      
      Scanner input=new Scanner(System.in);
      //calling random method//
      Random rand=new Random();
      //takiing input from user//
      System.out.println("Enter \n 1 for Paper\n 2 for Rock\n 3 for Scissors");
      player=input.nextInt();
      //taking random input from user//
      computer=rand.nextInt(3)+1;
      System.out.println(" System chosses : " + computer);
      //using if else statement for determining winner //
      if(player==1)
         {
            if(computer==1)
            System.out.println("Its a tie.");
            else if(computer==2)
            System.out.println("Player wins.");
            else if(computer==3)
            System.out.println("Computer Wins.");
          
         }
         
        else if(player==2)
         {
            if(computer==1)
            System.out.println("Computer wins.");
            else if(computer==2)
            System.out.println("Its a tie.");
            else if(computer==3)
            System.out.println("Player wins.");
          
         }
         
         else if(player==3)
         {
            if(computer==1)
            System.out.println("Player wins.");
            else if(computer==2)
            System.out.println("Computer wins.");
            else if(computer==3)
            System.out.println("Its a tie.");
          
         }
         else 
         System.out.println(" Only numbers given");
         
                  
      
   
   
   }





}