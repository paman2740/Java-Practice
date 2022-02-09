import java.util.Scanner;
public class TestFile
{
   public static void main(String args[])
   {
   
   String fName="Aman";
   String lName="Patel";
   Date dob;
   int i,day,month,year;
   
   Scanner get=new Scanner(System.in);
   Pearson list[];
   System.out.print("Please enter how many entries you want to enter?");
   list=new Pearson[get.nextInt()];
   System.out.println();
   
   for(i=0;i<list.length;i++)
   {
   get.nextLine();//to take care of return key.
   System.out.printf("Please enter the %d-th first name?",i+1);
   fName=get.nextLine();
   System.out.printf("PLease enter the %d-th last name?\n",i+1);
   lName=get.nextLine();
   System.out.printf("Please enter the day when you were born");
   day=get.nextInt();
   System.out.printf("Please enter the month when you were born");
   month=get.nextInt();
   System.out.printf("Please enter the year when you were born");
   year=get.nextInt();
   
   dob=new Date(month,day,year);
   list[i]=new Pearson(fName,lName,dob);
   System.out.print(list[i]);
   }
   
   
  // String fName="Aman";
  //String lName="Patel";
   Date date=new Date(7,9,2019);
   double grade = 22.5;
   Pearson s=new Student(fName,lName,date,grade);
   System.out.print(s);
  
   
   
   
   
   
     
   
   
   }
   

}