/*
My name is Aman Patel.
I am trying to read input from a file and create an object corresponding to that.
Step 1: read input from the file, with the help of if statement and for loop.
Step 2: As you readn the information keep creating objects.
Step 3: Print the arrayof objects and ask user what task they want to perform bu=y giving them choice.
*/
import java.io.File;
import java.util.Scanner;
public class TestPearson

{


   public static void main(String args[]) throws Exception
   {
   //local variables
   String first,last,rank,email;
   Date date=new Date();
   double salary,gpa,hour,wage,week;
   String str;
   int i,x,month,day,year;//x is for if statement for task to perform.
   Pearson list[];
   Employee list2[];
   File toReadFrom=new File("input.txt"); //read input filr from input.txt
   Scanner get=new Scanner(toReadFrom); //Scanner object to read from file
   Scanner input=new Scanner(System.in);
   //System.out.println("Please enter the number of entries you want to enter?");
   list=new Pearson[get.nextInt()];
   //this loop is for reading the information from the input file.
   for(i=0;i<list.length;i++)
   {
   str=get.next();
   if((str).compareTo("Stu")==0)
   {

   first=get.next();
   last=get.next();
   
   month=get.nextInt();
   day=get.nextInt();
   year=get.nextInt();
   date=new Date(month,day,year);//creating date using date class.
  
   gpa=get.nextDouble();
   rank=get.next();
   
   list[i] =new Student(first,last,date,gpa,rank);
   }
   
   else if((str).compareTo("Fac")==0)
   {
   first=get.next();
   last=get.next();
   
   month=get.nextInt();
   day=get.nextInt();
   year=get.nextInt();
   date=new Date(month,day,year);//creating date using date class.
   
   rank=get.next();
   salary=get.nextDouble();
   
   list[i]=new Faculty(first,last,date,rank,salary);
   }
   
   else if((str).compareTo("Sta")==0)
   {
   first=get.next();
   last=get.next();
   
   month=get.nextInt();
   day=get.nextInt();
   year=get.nextInt();
   date=new Date(month,day,year);//creating date using date class.

   rank=get.next();
   hour=get.nextDouble();
   wage=get.nextDouble();
   week=get.nextDouble();
 
   list[i]=new Staff(first,last,date,rank,hour,wage,week);
   }//end else statement   
   
   
   }// end loop
    
   //printing the array.   
   for(i=0;i<list.length;i++)
   System.out.println(list[i]);
   
   //giving user choices if they want to perform following tasks.
   System.out.print("\n-----------------------------------------------------------------------\n\n");
   System.out.println("Enter 1 to display all the persons sorted by last name in increasing order");
   System.out.println("Enter 2 to display student's name with best gpa");
   System.out.println("Enter 3 to display employee that is hired earliest");
   System.out.println("Enter 4 to display highest paid employee");
   System.out.println("Enter 5 to ask for a last name you want to search");
   System.out.println("Enter 6 or any other number to quit");
   System.out.print("\n----------------------------------------------------------------------\n");
   
   x=input.nextInt();
   while(x==1||x==2||x==3||x==4||x==5)
   {
      
      if(x==1)
      {
      sortByLast(list);
      for(i=0;i<list.length;i++)
      System.out.println(list[i]);
      System.out.println("\n\nPlease enter numbers between 1 and 6");
      x=input.nextInt();
      }
      else if(x==2)
      {
      maxGpa(list);
      System.out.println("\n\nPlease enter numbers between 1 and 6");
      x=input.nextInt();
      } 
      else if(x==3)
      {
      seniorEmployee(list);
      System.out.println("\n\nPlease enter numbers between 1 and 6");
      x=input.nextInt();
      }
      else if(x==4)
      {
      maxSalary(list);
      System.out.println("\n\nPlease enter numbers between 1 and 6");
      x=input.nextInt();
      }
      else if(x==5)
      {
      System.out.println("Please enter the last name you want to search ?");
      String temp=input.next();
      searchLast(list,temp);
      System.out.println("\n\nPlease enter numbers between 1 and 6");
      x=input.nextInt(); 
      }
      

      
    } //end while loop 
   
   
}// end main method
   
   /*
   This method is for sorting all the person objects in dictionary order with respect to last name.
   Step : we create temporary person object.
   Step : with the help of nested for loop or Bubble sort method we sort the array.
   Step : as we are just sorting the array there will not be any output given, but the originalarray will be changed.
   */
   public static void sortByLast(Pearson s[])
   {
   //variables
   Pearson temp;
   int i,j;
   
   //bubble sort
   for(i=1;i<s.length;i++)
      {
      for(j=0;j<s.length-1;j++)
         {
         if(s[j].getLast().compareTo(s[j+1].getLast())>0) //so s[j]'s last name comes after s[j+1]'s name.
            {
            temp=s[j];
            s[j]=s[j+1];
            s[j+1]=temp;
            }//enf of if
          }//end of inner loop
       } //end of outher loop
    }//end of sort method 
    
    /*
    this method will determine person with the highest GPA.
    As we find themax number in the array we willfind the pirticular parameter in the object.
    We will assign first person's GPA to m and then keep comparing it to rest of the list 
    and will change it if it is smaller then the number. 
    And after comparing all the numbers we will find the maximum Gpa, and this method will 
    return nothing but will give a display.
    */
    public static void maxGpa(Pearson n[])
   {
   double  m;
   int x,i;
   x=0;
   m=n[0].getGpa();//initiating m with first Gpa.
   
   for(i=1;i<n.length;i++)
      if(n[i].getGpa()>m)//giving condition if it follows the condition m will we overwritten with the new one.
      {
      m=n[i].getGpa();
      x=i;
      }//end if statement.
   System.out.print(n[x]);
   System.out.print(" has the best GPA in the class.");
   }//end maxgpa method
   
   
   /*
   We are using the same logic as previous method.
   
   */
   public static void maxSalary(Pearson n[])
   {
   double  m;
   int x,i;
   x=0;
   m=n[0].getSalary();
   for(i=1;i<n.length;i++)
      if(n[i].getSalary()>m)
      {
      m=n[i].getSalary();
      x=i;
      }//end if Statement.
   System.out.print(n[x]);
   System.out.print(" is the highest paid employee." );

   }//end maxsalary method
   
   /*
   This method will find find the given last name.
   What it will do is it will compare the last name with everyone's last name and will give us the out put of correspondong first name.
   */
   public static void searchLast(Pearson list[],String name)
   {
   int i;
   for(i=0;i<list.length;i++)
      if(name.compareTo(list[i].getLast())==0)//comparing all the last name with the given last name and 
      System.out.println(list[i]);             // if those are zero then it will print the corresponding last name and first name.
      else
      System.out.print("");
   }//end searchLast method.
   
   
   /*
   This method will determine which employee is the oldest in the company.
   step 1:for this we will create and integer array for storing number of days
   step 2:with the help of if statement we will determine weather a person is student of an employee
   step 3:if he/she is an employee then we will call the days method from the Date class to count number of days till today.
   step 4:And if he/she is student then we will simply put zero in number of days array.
          and then we will call the max method to identify the oldest method and will print that.
    */
   public static void seniorEmployee(Pearson s[])
   {
   
   int i,m,list[];
   Date date=new Date(); 
   list=new int[s.length];
   
   for(i=0;i<s.length;i++)
   {
   if(s[i].getSalary()>0)
      {
      date=s[i].getDate();
      list[i]=date.days();//lists them to new array in the same order as they belong to original. 
      }
   else//because if salary is zero or below zero person is student not an employee.
      list[i]=0;
   }
   m=maxArray(list);
   System.out.print(s[m]);
   System.out.print(" is the most senior employee.");

   }//end seniorEmolpyee method
   
   /*
   this method returns which index stores the highest number in integer array.
   */
   public static int maxArray(int n[])
   {
   int i, m,x;
   x=0;
   m=n[0];
   for(i=1;i<n.length;i++)
   if(n[i]>m && n[i]!=0)
   {
    x=i;
   m=n[i];
   }
   return x;
   }//end maxArray method.
   

}