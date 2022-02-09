/*
My name is Aman Patel.
I am trying to create a code for a pick 3 lottery game.
Step 1: Declare variables for lottery numbers and the numbers the user is going to guess.
Step 2: Call random method.
Step 3: Now write a code so computer generates three random numbers between 0 and 9 bu do not display them.
Step 4: Take numbers from the user. 
Step 5: Now display what the Lottery number and display the numbers what user guessed.
Step 6: Now using if and else if statements determine what user is wining. And display what he or she wins. 

*/

import java.util.Random;
import java.util.Scanner;
public class AmanPatelLab3
{

      public static void main(String args[])
      {
      
      int firstnumber,firstguess,secondnumber,secondguess,thirdnumber,thirdguess;//declaring variables
      Scanner input= new Scanner(System.in);//calling scanner method
      Random rand = new Random();// calling random method
      
      firstnumber=rand.nextInt(9)+0;// computer is chossing random numbers
      secondnumber=rand.nextInt(9)+0;
      thirdnumber=rand.nextInt(9)+0;
      
      System.out.println("--------------------Welcom to Pick 3 game-----------------");
      System.out.print("Enter your first guess between     0-9 :  ");// user is guessing his/her numbers
      firstguess=input.nextInt();
      System.out.print("Enter your second guess between     0-9 :  ");
      secondguess=input.nextInt();
      System.out.print("Enter your third guess between     0-9 :  ");
      thirdguess=input.nextInt();
      
      System.out.println("Lottery Numbers : "+firstnumber+" "+secondnumber+" "+thirdnumber);
      System.out.println("Your Numbers    : "+firstguess+" "+secondguess+" "+thirdguess);
      
      //top prize if all number matches in given order user wins $10,000.
      if(firstnumber==firstguess && secondnumber==secondguess && thirdnumber==thirdguess)
      System.out.println("Congratulations you won $ 10000");
      
      // second prize if last two number matches in a given order user win $3000
      else if(secondnumber==secondguess && thirdnumber==thirdguess)
      System.out.println("Congratulations you won $ 3000");
      
      // second prize if first number and last number matches in a given order user wins $3000
      else if(firstnumber==firstguess && thirdnumber==thirdguess)
      System.out.println("Congratulations you won $ 3000");
      
      // second prize if first two number matches in a given order user wins $3000
      else if(firstnumber==firstguess && secondnumber==secondguess)
      System.out.println("Congratulations you won $ 3000");
                                                        
      //third prize if any one number matches in any order user wins $1000
      else if(firstnumber==firstguess || secondnumber==secondguess || thirdnumber==thirdguess || firstnumber==secondguess || secondnumber==thirdguess || thirdnumber==firstguess || firstnumber==thirdguess || secondnumber==firstguess || thirdnumber==secondguess )
      System.out.println("Congratulations you won $ 1000"); 
      //if non of the number matches user wins nothing.
      else
      System.out.println("Sorry you lost, try again later");
       
     
      
      
      
      
      
      }
      
      



}
