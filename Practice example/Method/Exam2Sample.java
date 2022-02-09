import java.util.Scanner;
public class Exam2Sample
{

   public static void main(String args[])
   {
   int a,b,c,i,minimum,N;
   Scanner get=new Scanner(System.in);
   System.out.println("How many triple integer will you enter?");
   N=get.nextInt();
   for(i=1;i<=N;i++)
   {
   System.out.printf("Enter %dth triple integer ? ",i);
   a=get.nextInt(); b=get.nextInt(); c=get.nextInt();
   //b=get.nextInt();
   //c=get.nextInt();
   minimum=min(a,b,c);
   System.out.printf("Minimun=m of %d,%d,%d is %d\n",a,b,c,minimum);
   
   }
   
   }
   
   public static int min(int a, int b, int c)
   {
   int minimum;
   minimum=a;
   if(b<minimum)
   minimum=b;
   if(c<minimum)
   minimum=c;
   return minimum; 
   }
   
   
   
   
   



}