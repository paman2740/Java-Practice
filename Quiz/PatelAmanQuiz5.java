/*
This code draws half horizontal lines and half vertical.
My name is Aman Patel.
Step 1: write a code to draw line.
step 2: make x1 and y1 constant to draw horizontal lines.
step 3: make x2 and y2 constant to draw verticle lines. 
*/

import java.awt.*;
import javax.swing.*;
import java.util.Random;
 
public class PatelAmanQuiz5 extends JPanel 
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
    frame.setSize(800, 800);
    //----------------------------------- 
    PatelAmanQuiz5 panel = new PatelAmanQuiz5();
    
    frame.add(panel);
    frame.setVisible(true);
   }
  


   public void paintComponent(Graphics g) 
   {
     //variable
     int i;
     int n; //for random color
     Random run=new Random();
     
      
     //inital point
     x1=10;
     y1=800;
     
  
     i=0;
     while(i<390)
        {
        
        x2=10+i;
        y2=10+i;
        
        
        n=run.nextInt(4);
        switch(n)
         {
         case 0: g.setColor(Color.blue);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 1: g.setColor(Color.red);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 2: g.setColor(Color.yellow);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 3: g.setColor(Color.green);
                 g.drawLine(x1, x2, y1, y2);
         }
        i=i+2;
        }
        //initial for vertical lines.
        i=0;
        x2=400;
        y2=800;
           
     while(i<800)
        {
   
        y1=10+i;
        x1=10+i;
        ;
        n=run.nextInt(4);
        switch(n)
         {
         case 0: g.setColor(Color.blue);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 1: g.setColor(Color.red);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 2: g.setColor(Color.pink);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 3: g.setColor(Color.green);
                 g.drawLine(x1, x2, y1, y2);
         }
        i=i+5;
        }
   /*      i=0;
     while(i<800)
        {
        
        x2=400;
        y1=i+10;
        y2=600;
        x1=i+10;
        
        n=run.nextInt(4);
        switch(n)
         {
         case 0: g.setColor(Color.blue);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 1: g.setColor(Color.red);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 2: g.setColor(Color.orange);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 3: g.setColor(Color.green);
                 g.drawLine(x1, x2, y1, y2);
         }
        i=i+15;
        } 
        i=600;
     while(i<800 && i>=600)
        {
        
        x2=10+i;
        y1=800;
        y2=10+i;
        x1=10;
        ;
        n=run.nextInt(4);
        switch(n)
         {
         case 0: g.setColor(Color.blue);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 1: g.setColor(Color.red);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 2: g.setColor(Color.yellow);
                 g.drawLine(x1, x2, y1, y2);
                 break;
         case 3: g.setColor(Color.green);
                 g.drawLine(x1, x2, y1, y2);
         }
        i=i+20;
        }*/
}
}