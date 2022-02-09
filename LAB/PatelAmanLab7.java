/*
My name is Aman Patel.
I am trying to get user create an array and then give him the set of
numbers he entered by eliminating repeating numbers.
step 1: Ask user what will be the size of array.And assign it to the size of array.
step 2: Ask user what will be the boundary that they will be entering the numbers.
step 3: take the input from user.
step 4: call print methopd fopr array.
step 5: call eliminate method.
*/  
import java.util.Scanner;
public class PatelAmanLab7
{
   public static void main(String args[])
   {
   int n[],i,M,size;
   Scanner get=new Scanner(System.in);

   System.out.printf("What is your size of array?\n");
   size=get.nextInt();
   n=new int[size];//assigning size of array
   
   System.out.printf("What is your M?\n");
   M=get.nextInt();
   
   for(i=0;i<size;i++)// for getting the numbers for the array
      {
      System.out.printf("%d-th number : ",i+1);
      n[i]=get.nextInt();
      while(n[i]<0 || n[i]>M)
      {
      System.out.printf("number should be less than %d : ",M);
      n[i]=get.nextInt();
      }
     }// end for loop
    
   printArray(n);//calling print method
   eliminate(n);// calling eleminate method
   }
  
   /*
   Printing the given array
   Step 1: create a loop which will print the individual numbers in a
           array at a time and goes to next line after 10 elements. 
   
   */
   public static void printArray(int n[])
   {
   int i;
   for(i=0;i<n.length;i++)
   if((i+1)%10==0)
   System.out.printf("%6d\n",n[i]);
   else
   System.out.printf("%6d",n[i]);
   }
  
  /*
  method eleminates the repeating numbers in array and prints the refined form.
  Step 1: Create the new array of the size of the maximum number in array plus one.
            (call max method for finding maximum number in a array) 
  Step 2: After determining the size initialize all values by zero in array
  Step 3: see if the number is repeating or not if yes then increase it by one.
  Step 4: Now print the position which are more then one because those ar the ones which will be in the array.
  */
  
   public static void eliminate(int n[])
   {
   int m,i,j,x[];
   x=new int[maxArray(n)+1];//calling max method
   for(i=0;i<x.length;i++)//assigning all value in array with zero
   x[i]=0;
  
       
   for(i=0;i<x.length;i++)// determining what number of values we have 
    for(j=0;j<n.length;j++)    
    if(i==n[j])
    x[i]++;
     System.out.printf("\n");
     
   
   for(i=0;i<x.length;i++)// printing thye refined eliminated array.
   if(x[i]>0)
   System.out.printf("%6d",i);
   }
   
   /*
   This method determines the maximum number in the array.
   Step 1: for instance give maximum value to first value in array and then comapre
           them to rest of the values and return the last assigned value to m.
   */
   public static int maxArray(int n[])
   {
   int i, m;
   m=n[0];
   for(i=1;i<n.length;i++)
   if(n[i]>m)
   m=n[i];
   
   return m;
   }
   
}