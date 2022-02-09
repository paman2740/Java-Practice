/*
My name is Aman Patel.
I am trying to get three strings and decide weather they are all digits or not, and then I am trying to list them in dictionary order.
Step 1: Difine variables.
Step 2: take input and decide the dictionary order for the given strings.
Step 3: after deciding the dictionary order decide that all letters entered in stingds are digits or not. 
 



*/
import java.util.Scanner;
public class PatelAmanLab4
{
   public static void main(String args[])
   {
   String str1,str2,str3;
   String first,second,third;
   String str1Yesno,str2Yesno,str3Yesno;
   int i=0;
   Scanner get=new Scanner(System.in);
   
   System.out.printf("Please enter a string : ");
   str1=get.nextLine();
   System.out.printf("Please enter a string : ");
   str2=get.nextLine();
   System.out.printf("Please enter a string : ");
   str3=get.nextLine();
   
   first=str1;//just for sake assigning stri to first 
   if(str2.compareTo(first)<0)//checking if the second number be a first string.
   first=str2;
   if(str3.compareTo(first)<0)//checkiung if the third number be the first string. 
   first=str3;
   
     
   third=str1;                //using the same logic as we used to find first number to find third string.
   if(str2.compareTo(third)>0)
   third =str2;
   if(str3.compareTo(third)>0)
   third=str3;
   
 
   if(first.equals(str1)&&third.equals(str3))//using the equal method to determine which will be the second string.
   second=str2;
   else if(first.equals(str3)&&third.equals(str1))
   second=str2; 
   else if(first.equals(str2)&&third.equals(str1))
   second=str3;
   else if(first.equals(str1)&&third.equals(str2))
   second=str3;
   else
   second=str1;
   
   //checking if all character are digits or not.
   str1Yesno="All DIGITS";
   while(i<first.length())
   {
   if(first.charAt(i)<'0' || first.charAt(i)>'9')
   str1Yesno="NOT ALL DIGITS";
   else
   str1Yesno="ALL DIGITS";
   i++;
   }
   i=0;//stting i to zero again.
   str2Yesno="All DIGITS";
   while(i<second.length())
   {
   if(second.charAt(i)<'0' || second.charAt(i)>'9')
   str2Yesno="NOT ALL DIGITS";
   else
   str2Yesno="ALL DIGITS";
   i++;
   }
   i=0;//setting i to zero again.
   str3Yesno="All DIGITS";
   while(i<third.length())
   {
   if(third.charAt(i)<'0' || third.charAt(i)>'9')
   str3Yesno="NOT ALL DIGITS";
   i++;
   }
   
   System.out.printf("String                                  Character\n");
   System.out.printf("-------                                ----------\n");
   System.out.printf("%-40s %s\n",first,str1Yesno);                   
   System.out.printf("%-40s %s\n",second,str2Yesno);
   System.out.printf("%-40s %s\n",third,str3Yesno); 
   
   
   
   
   
   
   }




}