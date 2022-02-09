public class Taxable extends Food
{
   private double taxRate;
   
   public Taxable()
   {
   super();
   }
   public Taxable(String n,double p,double tax)
   {
   super(n,p);
   setTaxRate(tax);
   }
   public void setTaxRate(double t)
   {
   if(t<0||t>1)
   this.taxRate=0.1;
   else 
   this.taxRate=t;
   }
   public double getTaxRate(){return this.taxRate;}
   public double cost()
   {
   return getPrice()+(getPrice()*this.taxRate);
   } 
}