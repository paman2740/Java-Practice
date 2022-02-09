public class Sport extends Car
{
  
   private int door;
   private double horsePower;
   
   public Sport()
   {
   super();
   }
   
   public Sport(int y, String m,String mod,int d,double hp)
   {
   super(y,m,mod);
   setDoor(d);
   setHorse(hp);
   }
   
   public void setDoor(int d)
   {
   door=d;
   }
   public void setHorse(double hp)
   {
   horsePower=hp;
   }
   public int getDoor(){return door;}
   public double getHorse(){return horsePower;}
   
   public String toString()
   {
   return String.format("%d  %s %s(Doors= %d : HP= %.2f) and its a Sports car.",getYear(),getMake(),getModel(),getDoor(),getHorse());
   }
   
    
   
}
