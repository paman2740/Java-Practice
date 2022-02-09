/*
My name is Aman Patel.
I am trying to write a code for determining the average grade for each student of four students.
step 1: declaring variables for subjects, Average(percentage),student names,grades.
step 2: take information for first student.
step 3: after taking the information of student take average. 
step 4: after taking information of one student determine grade with the help of average for that student and if and else if statements then repeat step 2,3 and 4 for rest of three students.
step 4: Now display your results as needed. 
*/

import java.util.Scanner;
public class AmanPatelHomework1
{
        public static void main(String args[])
        {
        //declaring four different subjects for four different students. 
        int math1,math2,math3,math4,eng1,eng2,eng3,eng4,phy1,phy2,phy3,phy4,science1,science2,science3,science4;
        //declaring Average grade or percentage for each student.
        double Average1,Average2,Average3,Average4;
        //declaring variable for student name.
        String student1,student2,student3,student4;
        //declaring variables for grade for each student.
        char Grade1,Grade2,Grade3,Grade4;
       
        //calling scanner method.
        Scanner input=new Scanner(System.in);
                                        //////////Student 1 start//////////
        System.out.print("Student 1 enter your name : ");//taking information for first student//
        student1=input.next();
        System.out.print("MATHS: ");
        math1=input.nextInt();
        System.out.print("ENGLISH : ");
        eng1=input.nextInt();
        System.out.print("PHYSICS : ");
        phy1=input.nextInt();  
        System.out.print("SCIENCE : ");
        science1=input.nextInt(); 
        
        Average1=(math1+eng1+phy1+science1)/4;           //Taking average to determine grade //
        
        if(Average1>=90 && Average1<100)                 //using if else statement for deciding what grade student get//
        Grade1 = 'A';
        else if(Average1>=80 && Average1<90)
        Grade1 = 'B';
        else if(Average1>=70 && Average1<80)
        Grade1 ='C';
        else if(Average1>=60 && Average1<70)     
        Grade1 = 'D';
        else 
        Grade1 = 'F';
                                        //////////Student1 end//////////
                                        //////////Student2 start/////////
        System.out.print("Student 2 enter your name : ");// taking information for second user//
        student2=input.next();
        System.out.print("MATHS: ");
        math2=input.nextInt();
        System.out.print("ENGLISH : ");
        eng2=input.nextInt();
        System.out.print("PHYSICS : ");
        phy2=input.nextInt();  
        System.out.print("SCIENCE : ");
        science2=input.nextInt(); 
       
        Average2=(math2+eng2+phy2+science2)/4;           //Taking average to determine grade //
        
        if(Average2>=90 && Average2<100)                 //using if else statement for deciding what grade student get//
        Grade2 = 'A';
        else if(Average2>=80 && Average2<90)
        Grade2 = 'B';
        else if(Average2>=70 && Average2<80)
        Grade2 ='C';
        else if(Average2>=60 && Average2<70)     
        Grade2 = 'D';
        else 
        Grade2 = 'F';
                                         ///////Student2 end.
                                        ///////Student3 start
        System.out.print("Student 3 enter your name : ");//taking information for third student//
        student3=input.next();
        System.out.print("MATHS: ");
        math3=input.nextInt();
        System.out.print("ENGLISH : ");
        eng3=input.nextInt();
        System.out.print("PHYSICS : ");
        phy3=input.nextInt();  
        System.out.print("SCIENCE : ");
        science3=input.nextInt(); 
        
        Average3=(math3+eng3+phy3+science3)/4;           //Taking average to determine grade //
        
        if(Average3>=90 && Average3<100)                 //using if else statement for deciding what grade student get//
        Grade3 = 'A';
        else if(Average3>=80 && Average3<90)
        Grade3 = 'B';
        else if(Average3>=70 && Average3<80)
        Grade3 ='C';
        else if(Average3>=60 && Average3<70)     
        Grade3 = 'D';
        else 
        Grade3 = 'F';        
                                   ////////Student3 end.
                                   ////////Student4 start
        System.out.print("Student 4 enter your name : ");//taking informaton for forth student//
        student4=input.next();
        System.out.print("MATHS: ");
        math4=input.nextInt();
        System.out.print("ENGLISH : ");
        eng4=input.nextInt();
        System.out.print("PHYSICS : ");
        phy4=input.nextInt();  
        System.out.print("SCIENCE : ");
        science4=input.nextInt(); 
        
        Average4=(math4+eng4+phy4+science4)/4;           //Taking average to determine grade //
        
        if(Average4>=90 && Average4<100)                 //using if else statement for deciding what grade student get//
        Grade4 = 'A';
        else if(Average4>=80 && Average4<90)
        Grade4 = 'B';
        else if(Average4>=70 && Average4<80)
        Grade4 ='C';
        else if(Average4>=60 && Average4<70)     
        Grade4 = 'D';
        else 
        Grade4 = 'F';     
                                        /////Student4 end.   
        //Display input as needed//
        
        System.out.println("     Student      Grades             Average             Grade");
        System.out.println("--------------------------------------------------------------");
        System.out.println("     "+ student1+"       { "+ math1+", "+ eng1+", "+ phy1+", "+ science1+" }      "+ Average1+"               "+ Grade1);
        System.out.println("     "+ student2+"       { "+ math2+", "+ eng2+", "+ phy2+", "+ science2+" }      "+ Average2+"               "+ Grade2);
        System.out.println("     "+ student3+"       { "+ math3+", "+ eng3+", "+ phy3+", "+ science3+" }      "+ Average3+"               "+ Grade3);
        System.out.println("     "+ student4+"       { "+ math4+", "+ eng4+", "+ phy4+", "+ science4+" }      "+ Average4+"               "+ Grade4); 
         
         
         
        }



}