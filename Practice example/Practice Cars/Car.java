public abstract class Car
{
     private int year;
     private String make;
     private String model;
    
    public Car()
    {
    }
    
    public Car(int y,String m,String mod)
    {
    setYear(y);
    setMake(m);
    setModel(mod);
    }
    
    public void setYear(int y)
    {
    year=y;
    }
    public void setMake(String m)
    {
    make=m;
    }
    public void setModel(String m)
    {
    model=m;
    }
    public int getYear(){return year;}
    public String getMake(){return make;}
    public String getModel(){return model;}
    
    public abstract int getDoor();
    public abstract double getHorse();
    public abstract String toString();
    
    
}
