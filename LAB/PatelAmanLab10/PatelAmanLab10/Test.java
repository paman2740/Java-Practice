/*
My name is Aman Patel.
Step 1: Declare variables we need.
Step 2: Call the input file from which we will read the input.
Step 3: with the help of loop and if statements read all th inputs from the input file.
Step 4: Call the sort meathod and re print the shape array.
*/
import java.util.Scanner;
import java.io.File;
public class Test
{
    public static void main(String args[])throws Exception
 
    {
     Shape list[];
     String name;
     int i;
     double length,width,radius;
     File toReadFrom=new File("input.txt"); //read input filr from input.txt
     Scanner get=new Scanner(toReadFrom); //Scanner object to read from file

     System.out.println("How many shapes will you like to enter ?");
     list=new Shape[get.nextInt()];//determining the size of array.
     
     for(i=0;i<list.length;i++)
     {
     System.out.println("Enter 1 for rectangle and 2 for circle :  ");
     String n=get.next();
        
        if(n.charAt(0)=='R')// for rectangle
        {
         System.out.println("Please enter length of rectangle ");
         length=get.nextDouble();
         System.out.println("Please enter width of rectangle ");
         width=get.nextDouble();
         list[i]= new Rectangle(length,width);         
        }
        
        if(n.charAt(0)=='C')// for circle
        {
         System.out.println("Please enter radius of a circle ");
         radius=get.nextDouble();
         list[i]= new Circle(radius);
        } 
      
     }//end for loop
     
     System.out.printf("Objects %23sarea %5s perimeter\n", " ", " ");
     System.out.printf("-------%24s----%7s---------\n", " ", " ");
     for(i=0;i<list.length;i++)
     System.out.print(list[i]);
  
     sortByArea(list);
     System.out.printf("-------%24s----%7s---------\n", " ", " ");
     System.out.printf("Here is the sorted list with respect to area.\n");
     System.out.printf("Objects %23sarea %5s perimeter\n", " ", " ");
     System.out.printf("-------%24s----%7s---------\n", " ", " ");
     for(i=0;i<list.length;i++)
     System.out.print(list[i]);   

    }//end main method
/*
Sorting array.
With the idea of bubble sort technique.
using nested loop sort the shape array with respect to area inj increasing order. 


*/

    public static void sortByArea(Shape s[])
   {
   //variables
   Shape temp;
   int i,j;
   
   //bubble sort
   for(i=1;i<s.length;i++)
      {
      for(j=0;j<s.length-1;j++)
         {
         if(s[j].area()>(s[j+1].area())) //so s[j]'s area comes after s[j+1]'s area
            {
            temp=s[j];
            s[j]=s[j+1];
            s[j+1]=temp;
            }//enf of if
          }//end of inner loop
       } //end of outher loop
    }//end of sort method 
 

}//end class