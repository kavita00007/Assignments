package practiceprograms;


public class ABC
{
    public ABC(int i)
    {
                                                     //classs xyz will imlicitely call default constructor itself n after that default constructor of ABC by 
    	                                             //however abc has parameterized constructorso either we have to add default constructor to ABC or super(int i) to XYZ 
    }
    
    public ABC()       //solution1
    {
    	
    }
}
 
class XYZ extends ABC
{
   public XYZ()
   {
	super(10);      //solution2
   }
}
