import java.util.Scanner;
public class PatelAmanHomework3
{
//ddd-dd-dddd
   public static void main(String[] args)
   
   {
   String ss1,ss2,ss3,ss4;
   String first,second,third,last;
   String f1,f2,f3,v1,vf1,vf2,vf3;
   String s1,s2,s3,v2,vs1,vs2,vs3;
   String t1,t2,t3,v3,vt1,vt2,vt3;
   String l1,l2,l3,v4,vl1,vl2,vl3;
   char dash,a1,b1,c1,a2,b2,c2,a3,b3,c3,a4,b4,c4;
   int d1,d2,d3,d4,i;
   i=0;
   vf1="not valid";
   vf2="not valid";
   vf3="not valid";
   vs1="not valid";
   vs2="not valid";
   vs3="not valid";
   vt1="not valid";
   vt2="not valid";
   vt3="not valid";
   vl1="not valid";
   vl2="not valid";
   vl3="not valid";
   
   
   Scanner get=new Scanner(System.in);
   
   System.out.println("Please enter your social security number : ");
   ss1=get.nextLine();
   System.out.println("Please enter your social security number : ");
   ss2=get.nextLine();
   System.out.println("Please enter your social security number : ");
   ss3=get.nextLine();
   System.out.println("Please enter your social security number : ");
   ss4=get.nextLine();
   
   first=ss1;
   //Determining dictionary order.
   if(ss2.compareTo(first)<0)
      first=ss2;
   if(ss3.compareTo(first)<0)
      first=ss3;
   if(ss4.compareTo(first)<0)
      first=ss4;
      
   last=ss1;//Determining last number.
   if(ss2.compareTo(last)>0)
      last=ss2;   
   if(ss3.compareTo(last)>0)
      last=ss3; 
   if(ss4.compareTo(last)>0)
      last=ss4; 
     
   second=ss2;                         //determining second number.
   if(first.equals(ss1) && last.equals(ss2)) 
      {
      second=ss3;
      if(ss4.compareTo(second)<0)
      second=ss4;
      }
   else if(first.equals(ss2) && last.equals(ss1)) 
      {
      second=ss3;
      if(ss4.compareTo(second)<0)
      second=ss4;
      second=ss2;
      if(ss4.compareTo(second)<0)
      second=ss4;
      }
   else if(first.equals(ss3) && last.equals(ss1))  
      {
      second=ss2;
      if(ss4.compareTo(second)<0)
      second=ss4;
      }   
   else if(first.equals(ss1) && last.equals(ss4))   
      {
      second=ss2;
      if(ss3.compareTo(second)<0)
      second=ss3;
      }
   else if(first.equals(ss4) && last.equals(ss1))   
      {
      second=ss2;
      if(ss3.compareTo(second)<0)
      second=ss3;
      }      
   else if(first.equals(ss3) && last.equals(ss2))   
      {
      second=ss1;
      if(ss4.compareTo(second)<0)
      second=ss4;
      }
   else if(first.equals(ss2) && last.equals(ss3))   
      {
      second=ss1;
      if(ss4.compareTo(second)<0)
      second=ss4;
      }   
   else if(first.equals(ss4) && last.equals(ss2))   
      {
      second=ss1;
      if(ss3.compareTo(second)<0)
      second=ss3;
      }
   else if(first.equals(ss2) && last.equals(ss4))   
      {
      second=ss1;
      if(ss3.compareTo(second)<0)
      second=ss3;
      }   
   else if(first.equals(ss3) && last.equals(ss4))   
      {
      second=ss2;
      if(ss1.compareTo(second)<0)
      second=ss1;
      }
   else if(first.equals(ss4) && last.equals(ss3))   
      {
      second=ss2;
      if(ss1.compareTo(second)<0)
      second=ss1;
      }
      
    third=ss1;                          //determining third number.
    if(first.equals(ss1) && last.equals(ss2))   
      {
      third=ss3;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss2) && last.equals(ss1))   
      {
      third=ss3;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss1) && last.equals(ss3))   
      {
      third=ss2;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss3) && last.equals(ss1))   
      {
      third=ss2;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss1) && last.equals(ss4))   
      {
      third=ss2;
      if(ss3.compareTo(third)>0)
      third=ss3;
      }
   else if(first.equals(ss4) && last.equals(ss1))   
      {
      third=ss2;
      if(ss3.compareTo(third)>0)
      third=ss3;
      }
   else if(first.equals(ss3) && last.equals(ss2))   
      {
      third=ss1;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss2) && last.equals(ss3))   
      {
      third=ss1;
      if(ss4.compareTo(third)>0)
      third=ss4;
      }
   else if(first.equals(ss4) && last.equals(ss2))   
      {
      third=ss1;
      if(ss3.compareTo(third)>0)
      third=ss3;
      }
   else if(first.equals(ss2) && last.equals(ss4))   
      {
      third=ss1;
      if(ss3.compareTo(third)>0)
      third=ss3;
      }
   else if(first.equals(ss3) && last.equals(ss4))   
      {
      third=ss2;
      if(ss1.compareTo(third)>0)
      third=ss1;
      } 
   else if(first.equals(ss4) && last.equals(ss3))   
      {
      third=ss2;
      if(ss1.compareTo(third)>0)
      third=ss1;
      }    
  
   v1="not valid";                               
   if(first.length()==11)
   {
   a1=first.charAt(0);//using some methods which will help me later in determining validity of social security number.
   b1=first.charAt(3);
   c1=first.charAt(6);
   f1=first.substring(0,4);
   f2=first.substring(5,7);
   f3=first.substring(8,11);
    
   if(a1!='0' && b1=='-' && c1=='-')
   {
   while(i<f1.length())
   {
   if(f1.charAt(i)>='0' && f1.charAt(i)<='9')
   vf1="valid";
   i++;
   }
   i=0;
   while(i<f2.length())
   {
   if(f2.charAt(i)>='0' && f2.charAt(i)<='9')
   vf2="valid";
   i++;
   }
   i=0;
   while(i<f3.length())
   {
   if(f3.charAt(i)>='0' && f3.charAt(i)<='9')
   vf3="valid";
   i++;
   if(vf3.equals("valid") && vf2.equals("valid") && vf1.equals("valid"))
   v1="valid";
   }
   }
   
   } 
  i=0;
   v2="not valid";
   if(second.length()==11)
   {
   s1=second.substring(0,4);
   s2=second.substring(5,7);
   s3=second.substring(8,11);
   a2=second.charAt(0);
   b2=second.charAt(3);
   c2=second.charAt(6);
   d2=second.length();
   if(a2!='0' && b2=='-' && c2=='-')
   {
   while(i<s1.length())
   {
   if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
   vs1="valid";
   i++;
   }
   i=0;
   while(i<s2.length())
   {
   if(s2.charAt(i)>='0' && s2.charAt(i)<='9')
   vs2="valid";
   i++;
   }
   i=0;
   while(i<s3.length())
   {
   if(s3.charAt(i)>='0' && s3.charAt(i)<='9')
   vs3="valid";
   i++;
   if(vs3.equals("valid") && vs2.equals("valid") &&vs1.equals("valid"))
   v2="valid";
   }
   }
   
   } 
  i=0;
   v3="not valid";
   if(third.length()==11)
   {
   t1=third.substring(0,4);
   t2=third.substring(5,7);
   t3=third.substring(8,11);
   a3=third.charAt(0);
   b3=third.charAt(3);
   c3=third.charAt(6);
   d3=third.length();
    if(a3!='0' && b3=='-' && c3=='-')
   {
   while(i<t1.length())
   {
   if(t1.charAt(i)>='0' && t1.charAt(i)<='9')
   vt1="valid";
   i++;
   }
   i=0;
   while(i<t2.length())
   {
   if(t2.charAt(i)>='0' && t2.charAt(i)<='9')
   vt2="valid";
   i++;
   }
   i=0;
   while(i<t3.length())
   {
   if(t3.charAt(i)>='0' && t3.charAt(i)<='9')
   vt3="valid";
   i++;
   if(vt3.equals("valid") && vt2.equals("valid") &&vt1.equals("valid"))
   v3="valid";
   }
   }
   
   } 
  i=0;
   
   v4="not valid";
   if(last.length()==11)
   {
   l1=last.substring(0,4);
   l2=last.substring(5,7);
   l3=last.substring(8,11); 
   a4=last.charAt(0);
   b4=last.charAt(3);
   c4=last.charAt(6);
   d4=last.length();
    if(a4!='0' && b4=='-' && c4=='-')
   {
   while(i<l1.length())
   {
   if(l1.charAt(i)>='0' && l1.charAt(i)<='9')
   vl1="valid";
   i++;
   }
   i=0;
   while(i<l2.length())
   {
   if(l2.charAt(i)>='0' && l2.charAt(i)<='9')
   vl2="valid";
   i++;
   }
   i=0;
   while(i<l3.length())
   {
   if(l3.charAt(i)>='0' && l3.charAt(i)<='9')
   vl3="valid";
   i++;
   if(vl3.equals("valid") && vl2.equals("valid") &&vl1.equals("valid"))
   v4="valid";
   }
   }
   
   } 
  i=0;


   
                                        
   
   System.out.printf("Social security number %-28s Validity \n"," ");
   System.out.printf("---------------------- %-28s ---------\n"," ");
   System.out.printf("%-50s %s\n",first,v1);
   System.out.printf("%-50s %s\n",second,v2);
   System.out.printf("%-50s %s\n",third,v3);
   System.out.printf("%-50s %s\n",last,v4);
  
    


}

}