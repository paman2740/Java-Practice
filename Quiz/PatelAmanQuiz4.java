/* This code draws a visual line between given two points */

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
 
public class DrawLine extends JPanel 
{
    static int x1,x2;
    static int y1,y2;
  
    public static void main(String[] args) 
    {
    
    //for frame--------------------------
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Draw Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(400, 400);
    //-----------------------------------
    
      
    
    DrawLine panel = new DrawLine();
    x1=y1=x2=y2=200;

    //show panel
    frame.add(panel);
    frame.setVisible(true);
   
    }
  

   
   public void paintComponent(Graphics g) 
   {
      Scanner input=new Scanner(System.in); //to read numbers from keyboard

     int n,e;
     g.setColor(Color.blue);
     g.drawLine(x1, x2, y1, y2);
     n=1;
     while(n<=5)
     {
     n++;
     System.out.println("Please enter a number : ");
     e=input.nextInt();
     if(e==8)
     {
     x1=x1;
     x2=x2-10;
     y1=y1;
     y2=y2-10;
     }
     else if(e==2)
     {
     x1=x1;
     x2=x2+10;
     y1=y1;
     y2=y2+10;
     }
     else if(e==6)
     {
     x1=x1+10;
     x2=x2;
     y1=y1+10;
     y2=y2;
     }
     else if(e==4)
     {
     x1=x1-10;
     x2=x2;
     y1=y1-10;
     y2=y2;
     }
   
     }
   }
}