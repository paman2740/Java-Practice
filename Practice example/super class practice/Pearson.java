//import java.util.Date;

public class Pearson
{
   private String fName;
   private String lName;
   private Date date=new Date();
    
    public Pearson()
    {
        
    }
    public Pearson(String first,String second,Date d)
    {
    setFirst(first);
    setSecond(second);
    setDOB(d);
    }
    //set methods
    public void setFirst(String first){fName=first;}
    public void setSecond(String second){lName=second;}
    public void setDOB(Date d){date=d;}
    //get methods
    public String getFirst(){return fName;}
    public String getLast(){return lName;}
    public Date getDOB(){return date;}
    
    public String toString()
    {
    return String.format("%s %s [%02d/%02d/%04d]",lName,fName,date.getMonth(),date.getDay(),date.getYear());
    } 
    
    


}