public abstract class Food
{
   private String name;
   private double price;
   
   public Food()
   {
   }
   
   public Food(String n,double p)
   {
   this.name=n;
   setPrice(p);
   }
   public void setPrice(double p)
   {
   this.price=p;
   }
   public String getName(){return this.name;}
   public double getPrice(){return this.price;}
   public abstract double cost();
}
