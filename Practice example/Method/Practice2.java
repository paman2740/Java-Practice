import java.util.Scanner;
public class Practice2
{

   public static void main(String args[])
   {
   int a;
   Scanner get=new Scanner(System.in);
   System.out.print("Please enter number : ");
   a=get.nextInt();
   table(a);
   }
   
   public static void table(int a)
   {
   int b,c;
   for(b=0;b<=10;b++)
   {
   c=b*a;
   System.out.printf("%-3d * %-3d = %-3d\n",b,a,c);
  
   }
   
   
   }


}