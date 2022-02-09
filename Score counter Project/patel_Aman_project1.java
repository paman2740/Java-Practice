import java.util.Scanner;

public class patel_Aman_project1 {

   public static void main(String args[]) {
      int n;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a total score: ");
      n=input.nextInt();
      
     if (n<=1)// 1 if statement 
     System.out.println("Sorry not possible.");
//--------------------------------------------------------------------------------------//     
     /*
     //ex: 2,3,8,9.            
     else if(n<=9) // 2 if statement 
     {
      if(n==2)// 3 if statment
      System.out.printf("1: Saftey point\nTotal 1 score.");
      else if(n==3)// 4 if statment
      System.out.printf("1: Field point\nTotal 1 score.");
      else if(n==4)// 5 if statment
      System.out.printf("2: Saftey points\nTotal 2 scores.");
      else if(n==5)// 6 if statment
      System.out.printf("1: Saftey point\n1: Field point\nTotal 2 scores.");
      else if(n==6)// 7 if statment
      System.out.printf("1: Six pointer\nTotal 1 score.");
      else if(n==7)// 8 if statment
      System.out.printf("1: Seven point\nTotal 1 score.");
      else if(n==8)// 9 if statment
      System.out.printf("1: Eight point\nTotal 1 score.");
      else if(n==9)// 10 if statment
      System.out.printf("1: Saftey point\n1: Seven pointer\nTotal 2 score.");
      }//end if statement*/
//---------------------------------------------------------------------------------------//     
     //ex: 64,88,80.
     else if(n%8==0) //3 if statment
     System.out.printf("%d: Eight pointer\nTotal %d score.",n/8, n/8);
//---------------------------------------------------------------------------------------//     
     //ex: 66,70,67,71.
     else if((n-2)%8==0)//4 if statement
     System.out.printf("%d: Eight pointer\n1: Saftey point \nTotal %d Scores", n/8, ((n/8)+1) );
     else if((n-3)%8==0)//5 if statement 
     System.out.printf("%d: Eight pointer\n1: Field goal \nTotal %d Scores", n/8, ((n/8)+1) );
     else if((n-6)%8==0)// 6 if statement 
     System.out.printf("%d: Eight pointer\n1: Six pointer \nTotal %d Scores", n/8, ((n/8)+1) );
     else if((n-7)%8==0)// 7 if statement 
     System.out.printf("%d: Eight pointer\n1: Seven pointer \nTotal %d Scores", n/8, ((n/8)+1) );
//---------------------------------------------------------------------------------------//     
     //ex: 68,69,84,89.
     else if((n-4)%8==0)// 8 if statement
     System.out.printf("%d: Eight pointer\n2: Saftey points \nTotal %d Scores", n/8, ((n/8)+2) );
     else if((n-5)%8==0)// 9 if statement 
     System.out.printf("%d: Eight pointer\n1: Saftey point \n1: Field goal \nTotal %d Scores", n/8, ((n/8)+2) );
//---------------------------------------------------------------------------------------//     
     //ex: 65,57,89,81.     
     else if((n-9)%8==0)// 10 if statement
     System.out.printf("%d: Eight pointer\n1: Seven pointer point\n1: Saftey point \nTotal %d Scores", (n-8)/8, (((n-8)/8)+2) ); 

   }//end main method
}//end class