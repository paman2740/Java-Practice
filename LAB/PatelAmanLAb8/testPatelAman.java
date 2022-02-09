public class testPatelAman
{

   private String brand;
   private double price;
   private int door;


   public testPatelAman()
   {
   }
   public testPatelAman(String brand,double price,int door)
   {
   setBrand(brand);
   setPrice(price);
   setDoor(door); 
   }
   
   //from this all are the set and get methods.
   public void setBrand(String s)
   {
   this.brand=s;
   }
   public void setPrice(double s)
   {
   if(s>0)
     this.price=s;
   else
     this.price=1;
   }
   public void setDoor(int s)
   {
   if(s>0)
     this.door=s;
   else
     this.door=1;
   }
   public String getBrand()
   {
   return this.brand;
   }
   public double getPrice()
   {
   return this.price;
   }
   public int getDoor()
   {
   return this.door;
   }
   
   //this method returns the object as a long string with all the information.
   public String toString()
   {
   return String.format("%s-$%.2f(%d door)",brand,price,door);
   //return String.format("%s[%4d:%5.2f]",s,n,d);
  
   }
   
   //this methid meturn the final sales price after taxes.
   public double taxprice(int tax)
   {
   //adding tax amount to the original price.
   double taxprice=(((price*tax)/100)+this.price);
   return taxprice;
   }
   
   //this methhod returns the discounted price after taxes.
   public double disprice(int rate,int tax)
   {
   //subtracting discounted price from total price.
   double finalprice =( (taxprice(tax))-((taxprice(tax))*rate)/100);
   return finalprice;
   }
   


}