public class Test
{

   public static void main(String args[])
   {
   int i;
   Food list[]=new Food[6];
   list[0]=new Taxable("Chicken",20,0.2);
   list[1]=new Taxable("Wings",25.5,0.1);
   list[2]=new Taxable("Fish",30.6,0.2);
   list[3]=new NonTaxable("Egg",2.5,"dairy");
   list[4]=new NonTaxable("Yogurt",5.6,"dairy");
   list[5]=new NonTaxable("Peproni",50.6,"meat");
   
   System.out.printf("%7s %7s\n","Name","Cost");
   System.out.println("   ----    ----");
   for(i=0;i<list.length;i++)
   System.out.printf("%7s %7.2f\n",list[i].getName(),list[i].cost());
   
   System.out.printf("\n\n%s is most expensive food",expensive(list).getName());
   }
   
   public static Food expensive(Food list[])
   {
   double m;
   int i,a;
   a=0;
   m=list[0].cost();
   
   for(i=0;i<list.length;i++)
      if(list[i].cost()>m)
      a=i;
      
   return list[a];
   }
   
}