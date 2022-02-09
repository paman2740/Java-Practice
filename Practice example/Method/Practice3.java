import java.util.Scanner;
public class Practice3
{

   public static void main(String args[])
   {
   int a,b,power1;
   Scanner get=new Scanner(System.in);
   System.out.print("Please enter base number : ");
   a= get.nextInt();
   System.out.print("Please enter power number : ");
   b= get.nextInt();
   power1=power(a,b);
   System.out.println(power1);
   
   
   
   }
   
   public static int power(int a, int b)
   {
   int c,a1;
   a1=a;
   for(c=1;c<b;c++)
   {
   a1=a1*a;
   }
   return a1; 
   }

}