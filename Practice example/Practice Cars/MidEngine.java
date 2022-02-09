public class MidEngine extends Sport
{
   private double horsePower;
   
   public MidEngine()
   {
   super();
   }
   
   public MidEngine(int y,String m,String mod, int d, double hp)
   {
   super(y,m,mod,d);
   setHorse(hp);
   }
   
   public void setHorse(double hp)
   {
   horsePower=hp;
   }
   public double getHorse(){return horsePower;}
   
   public String toString()
   {
   return String.format("%d  %s %s(Doors= %d : HP= %.2f)",getYear(),getMake(),getModel(),getDoor(),getHorse());
   }
}