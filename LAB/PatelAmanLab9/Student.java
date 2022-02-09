/*
This class represent object student with the following parameters

Parameter   First Name //string
            Last Name  //string
            grades     //array of integers
         
            
Methods
            Constructors
            Set/Get method
            max, min,average methods
*/

public class Student
{
   //variables
   private String fName;
   private String lName;
   private int grade[];
   //default value constructer
   public Student()
   {
   
   }
   //initial value constructor
   public Student(String fName,String lName,int grade[])
   {
   setFirst(fName);
   setLast(lName);
   setGrade(grade);
   } 
   //set and get method.
   public void setFirst(String n)
   {
   this.fName=n;
   }
   public void setLast(String n)
   {
   this.lName=n;
   }
   public void setGrade(int g[])
   {
   int i;
   //set size of g to grade
   this.grade=new int[g.length];
   //copy array g into grade
    for(i=0;i<g.length;i++)
    this.grade[i]=g[i];
   }
   public String getFirst()
   {
   return this.fName;
   }
   public String getLast()
   {
   return this.lName;
   }
   public int[] getGrades()
   {
   return this.grade;
   }
   //this is the max method which will return the maximum grade of a particular student.
   public int max()
   {
   int i,m;
   m=grade[0];
   for(i=1;i<grade.length;i++)
   if(grade[i]>m)
   m=grade[i];
   return m;
   }
   //this method will return the minimum grade of a prticular student.
   public int min()
   {
   int i,m;
   m=grade[0];
   for(i=1;i<grade.length;i++)
   if(grade[i]<m)
   m=grade[i];
   return m;
   }
   //this method will return the average of all their grades also of a particular student.
   public double average()
   {
   int i;
   double sum=0.00;
   for(i=0;i<grade.length;i++)
   sum=sum+grade[i];
   return sum/grade.length;
   }
   //this method will convert object in to string which we might not need in this code.
   public String toString()
   {
   String str;
   str="";
   int i;
   for(i=0;i<grade.length;i++)
   str=str+" "+grade[i];
   
   return String.format("Name :%s\nLast :%s\nGrades:%s",this.fName,this.lName,str);
   }
   
}   