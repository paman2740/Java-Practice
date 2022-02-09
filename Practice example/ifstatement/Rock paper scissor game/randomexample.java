import java.util.Scanner;
import java.util.Random;

public class randomexample
{

   public static void main(String args[])
   
   {
      int computer,player;
      
      // 1= Paper || 2= Rock || 3= Scissors //
      
      Scanner input=new Scanner(System.in);
      Random rand=new Random();
      System.out.println("Please enter integers between 1 and 3 : ");
      player=input.nextInt();
      computer=rand.nextInt((3-1)+1)+1;
      System.out.println(" System chosses : " + computer);
      
      if(player==1)
         {
            if(computer==1)
            System.out.println("Its a tie.");
            else if(computer==2)
            System.out.println("Player wins.");
            else if(computer==3)
            System.out.println("Player losses.");
          
         }
         
        else if(player==2)
         {
            if(computer==1)
            System.out.println("Player losses.");
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
            System.out.println("Player losses.");
            else if(computer==3)
            System.out.println("Its a tie.");
          
         }
         else 
         System.out.println(" Only numbers given");
         
                  
      
   
   
   }





}