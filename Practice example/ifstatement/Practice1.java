import java.util.Scanner;
import java.util.Random;

public class Practice
{


   public static void main(String args[])
   {
     int n;
     int a;
     String name;
     Random get=new Random();
     Scanner input= new Scanner(System.in);

     n=get.nextInt(10);
     System.out.println("Computer choose "+ n);
      System.out.print("Please enter your name: ");
     name=input.next();
     a =name.length();
     if(a<n)
     System.out.println("Your name is smaller then number");
      else if(a>n)
     System.out.println("Your name is larger then number");
      else
     System.out.println("Your name is equal to number");
     
     
     
     
     
     
     
   
  
   
   int sub1,sub2,sub3,sub4;
   int su1,su2,su3,su4;
   int ub1,ub2,ub3,ub4;
   int sb1,sb2,sb3,sb4;
         
   double avg1,avg2,avg3,avg4;
   char grade1,grade2,grade3,grade4;
   String name1,name2,name3,name4;
   
   Random get=new Random();
   Scanner input= new Scanner(System.in);
   
   System.out.println(" Enter your name : " );
   name1=input.next();
   System.out.println("please enter your grade for First subject ?");
   sub1=input.nextInt();
   System.out.println("please enter your grade for Second subject ?");
   sub2=input.nextInt();
   System.out.println("please enter your grade for Third subject ?");
   sub3=input.nextInt();
   System.out.println("please enter your grade for Fourth subject ?");
   sub4=input.nextInt();
   avg1=(sub1+sub2+sub3+sub4)/4;
   if(avg1>90)
   grade1='A';
   else if(avg1>80 && avg1<90)
   grade1='B';
   else if(avg1>70 && avg1<80)
   grade1='c';
   else if(avg1>60 && avg1<70)
   grade1='D';
   else 
   grade1='F';
   
   
   //////////////////////////////////////////////////////////////////////////////////
   
   
   System.out.println(" Enter your name : " );
   name2=input.next();
   System.out.println("please enter your grade for First subject ?");
   sub1=input.nextInt();
   System.out.println("please enter your grade for Second subject ?");
   sub2=input.nextInt();
   System.out.println("please enter your grade for Third subject ?");
   sub3=input.nextInt();
   System.out.println("please enter your grade for Fourth subject ?");
   sub4=input.nextInt();
   avg1=(sub1+sub2+sub3+sub4)/4;
   if(avg1>90)
   grade1='A';
   else if(avg1>80 && avg1<90)
   grade1='B';
   else if(avg1>70 && avg1<80)
   grade1='c';
   else if(avg1>60 && avg1<70)
   grade1='D';
   else 
   grade1='F';
   
   
   
   
   
   
   
   
   
   
   }



}