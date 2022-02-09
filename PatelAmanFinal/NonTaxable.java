public class NonTaxable extends Food
{
   private String type;
   
   public NonTaxable()
   {
   super();
   }
   public NonTaxable(String n,double p,String t)
   {
   super(n,p);
   this.type=t;
   }
   
   public String getType(){return this.type;}
   public double cost()
   {
   return getPrice();
   }  
}