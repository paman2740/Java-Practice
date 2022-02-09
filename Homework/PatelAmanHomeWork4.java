import java.util.Scanner;
import java.util.Random;
public class PatelAmanHomeWork4
{

   public static void main(String args[])
   {
   int slot[],n,i;
   Scanner get = new Scanner(System.in);
  
   
   System.out.printf("Enter the number of slots in the bean machine:  ");
   slot=new int[get.nextInt()];
   System.out.printf("Enter the number of balls to drop:  ");
   n=get.nextInt(); 
   boxSimulater(slot,n);
   }
   public static void boxSimulater(int slot[],int n)
   {
   int i,j,x,dup[];
   dup=new int[slot.length];
   String path;
    Random key = new Random();
   for(i=0;i<n;i++)
   {
   path="";
   j=key.nextInt(slot.length);
   dup[j]++;
   for(x=0;x<j;x++)
   {
   path=path+"R";
   }
   for(x=j;x<slot.length;x++)
   {
   path=path+"L";
   }
   System.out.printf("Ball %-5d path: %-10s \n",i+1,path);
   }
   display(dup);
   
   }
   public static int maxArray(int n[])
   {
   int i, m;
   m=n[0];
   for(i=1;i<n.length;i++)
   if(n[i]>m)
   m=n[i];
   
   return m;
   }
   public static void display(int n[])
   {
   int m,i,j; 
   m=maxArray(n);

   for(i=m;i>0;i--)
      {
      for(j=0;j<n.length;j++)
      {
      if(n[j]>=m)
      System.out.print("* ");
      else
      System.out.print("  ");
      }
      System.out.println();
      m--;
      }
      
    for(i=0;i<n.length;i++)
      if((i+1)%10==0)
      System.out.printf("%d \n",i);
      else
      System.out.printf("%d ",i);
     
   
   
   }
   public static void printArray(int n[])
   {
   int i;
   for(i=0;i<n.length;i++)
   if((i+1)%10==0)
   System.out.printf("%d \n",n[i]);
   else
   System.out.printf("%d ",n[i]);
   }


}