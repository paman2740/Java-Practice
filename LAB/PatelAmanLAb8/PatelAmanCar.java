/*
Myname is Aman Patel.
I am using my own class testPatelAman where I wrote
some methods which will help me creating object from
them and create an array wherewill take information of
a car and display theri sepcs and amount.
step 1: create an array and ask user what number of car they want to enter in the system.
Step 2: not create a for loop which asks user to enter the information of the car.
Step 3: Show the display accordingly.


*/
import java.util.Scanner;
public class PatelAmanCar
{
   public static void main(String args[])
   {
   int i,size,door;
   double price;
   String name;
   testPatelAman list[];//creating an array for the list of cars.
   Scanner get=new Scanner(System.in);
   System.out.println("Please enter the nnumber of cars you want to end: ");
   list=new testPatelAman[get.nextInt()];//assigning the size or the number of cars user wants to give the information of.
   for(i=0;i<list.length;i++)
   {
      System.out.printf("Car %d\n\n",i+1);
      get.nextLine();//to take care of return key from that door.
      System.out.printf("Brand name of car %d         : ",i+1);
      name=get.nextLine();
      System.out.printf("Price of car %d              : ",i+1);
      price=get.nextDouble();
      System.out.printf("Number of doors in the car %d: ",i+1);
      door=get.nextInt();
    
      list[i]=new testPatelAman(name,price,door);//creating array from the information we got.
   
   }//end for loop
      
      System.out.printf("%-30s %-25s %-10s\n","Car","Original Price","Discounted Price");
      System.out.printf("----                           --------------            ----------------\n");
      for(i=0;i<list.length;i++)
      System.out.printf("%-30s $%-25.2f $%-10.2f\n",list[i],list[i].taxprice(6),list[i].disprice(10,6));
   
   
   }//end main method

}//end class