/*
My name is Aman Patel.
Here I am trying to reate an array of object of an students awith first name,last name and grades.
Step 1: Ask user how many student they want to create.and ste that as a size of an array.
Step 2: Ask user how thay want to enter values for each students.
Step 3: Accordin to the user's response if manual let user enter all the values and if random then call random method.
Step 4: Call sort method and sort them according to their last name.
Step 5: Call the search method to search the particular last name and print the last name and corresponding first name.  

*/
import java.util.Random;
import java.util.Scanner;

public class TestStudent
{
   public static void main(String args[])
   {
   //variables
   String first,last;
   Student list[];
   int i,j,select,grade[];
   Scanner get=new Scanner(System.in);
   first="";
   last="";
      
   //first ask number of students
   System.out.printf("How many students: ");
   list=new Student[get.nextInt()]; //set size of student array
   //ask if user how they want to create student info. 
   System.out.println("Would you like to enter all student names info from keyboard or create them randomly");
   System.out.println("Enter 1 for to entering yourself and 2 for creating randomly");
   select=get.nextInt();
   
   if(select==1)//for manaually entering information.
   {
    for(i=0;i<list.length;i++)
         {
         System.out.printf("First name of the %d-th student : \n",i+1);
         first=get.next();  
         System.out.printf("Last  name of the %d-th student : \n",i+1);   
         last=get.next();
         //now we need to get i-th student grades So we will ask how many grades student has
         System.out.printf("How many grades %5d-th student has : \n",i+1);
         grade=new int[get.nextInt()]; //set grade array size
         
         //now read grades
         for(j=0;j<grade.length;j++)
            {
            System.out.printf("Enter %d-th student %d-th grade: \n",i+1,j+1);
            grade[j]=get.nextInt();
            }
         //now we have all three parameter for i-th student
         list[i]=new Student(first,last,grade);
         }
    }
    
   if(select==2)//for creating it randomly.
     for(i=0;i<list.length;i++)
     list[i]=randomStudent();// calling random mathod.   
  
   sortLast(list);//calling sorting method to sort the students by their last names.
   System.out.printf("%-15s %-12s %-12s %-7s \n","Student name","Min Grade","Max Grade","Average");
   for(i=0;i<list.length;i++)
      System.out.printf("%-8s,%-7s %-12d %-12d %-7.02f \n",list[i].getLast(),list[i].getFirst(),list[i].min(),list[i].max(),list[i].average());
  
  System.out.print("What last name you want to search?");
  searchStudent(list,get.next());//calling search method for finding perticular students with gioven last name.
   }
   
   /*
   Sort method to sort students based on their Last name
   Using bubble sort techqunie sort last name in increasing order.
   */
   public static void sortLast(Student s[])
   {
   //variables
   Student temp;
   int i,j;
   
   //bubble sort
   for(i=1;i<s.length;i++)
      {
      for(j=0;j<s.length-1;j++)
         {
         if(s[j].getLast().compareTo(s[j+1].getLast())>0) //so s[j]'s last name comes after s[j+1]'s last name
            {
            temp=s[j];
            s[j]=s[j+1];
            s[j+1]=temp;
            }//enf of if
          }//end of inner loop
       } //end of outher loop
    }
    
   //to save some time we will have method to create random student
   
   public static Student randomStudent()
   {
   String name[]={"Aimee","Nick","Sam","John","Riley","Katie","Scott","Zack","Cory","Luke"};
   String last[]={"Summer","Happy","Scott","Miller","Willson","Davis","Smith","Williams","Young","Zimmer"};
   Random r=new Random();
   int g[]=new int[3+r.nextInt(5)]; //so at least 3 and atmost 7 grades
   int i,j,k;
   
   i=r.nextInt(name.length);
   j=r.nextInt(last.length);
   
   //now fill grade array with random grades between 0 and 100
   for(k=0;k<g.length;k++)
      g[k]=r.nextInt(101);
      
   //now we can create a student object
   Student s=new Student(name[i],last[j],g);
   
   //return Student
   return s;
   }
   /*
   This method searches for the student with the given last name.
   This method will compare the given last name with the one in the list of students
   and if they match it will print them and if not it will not print anything.
   */
   public static void searchStudent(Student list[],String name)
   {
   
   int i;
   for(i=0;i<list.length;i++)
   {
   if(name.compareTo(list[i].getLast())==0)//comparing all the last name with the given last name and 
                                           // if those are zero then it will print the corresponding last name and first name.
   System.out.printf("%s,%s \n",list[i].getLast(),list[i].getFirst());
   else
   System.out.print("");
   }
   
   
   
   }
}