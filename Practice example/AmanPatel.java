import java.util.Random;
import java.util.Scanner;
public class AmanPatel
{
   public static void main(String args[])
   {
   int n[],i,size;
   Random get=new Random();
   size= get.nextInt(51)+10;
   Scanner key = new Scanner(System.in);
   n=new int[size];
   for(i=0;i<size;i++)
   n[i]=get.nextInt(51)+10;
   printArray(n);
   System.out.println();
   System.out.println();
   //int x[]=reverse(n);
   printArray(reverse(n));
  // System.out.print("What is the number you want ot search ?");
   //int x=key.nextInt();
  // search(n,x);
   }//end of main method.
  
   
   public static void printArray(int n[])
   {
   int i;
   //System.out.printf("%3d",n[0]);
   for(i=0;i<n.length;i++)      
     {
      if((i+1)%10==0)
      System.out.printf("%6d\n",n[i]);
      else
      System.out.printf("%6d",n[i]);
      
 
     }
     
   }//end of pintArray method.
  
   
   
   public static int[] reverse(int n[])
   {
   int rev[],i;
   rev=new int[n.length];
   for(i=0;i<n.length;i++)
      rev[i]=n[n.length-i-1];
   return rev;
   }//end of reverse method.   
   /*
   public static void search(int n[],int x)
   {
   int i;
   for(i=0;i<n.length;i++)
   {
   if(n[i]==x)
   System.out.print("yes the number is in the array"+x);
   }
   else
   System.out.print("No the number is in the array"+x);
   
   }
   */
   
   
   
   


}//end of class.