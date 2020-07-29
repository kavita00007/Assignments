package practiceprograms;

public class Super {

	public static void main(String[] args) {
     
		System.out.println("Main start");
		c1 c3=new c1();
		System.out.println("Main ends");
	}

}

class A1
{
   A1()
   {
	   System.out.println("Default constructor of A1");
   }
   
   A1(int i)
   {
	  System.out.println("Parameterized constructor"); 
   }
}

class B1 extends A1
{
	B1()
	{ 
		super(2);
		System.out.println("Default contsructor of B1");
	}
}

class c1 extends B1
{
	c1()
	{
		//super();
		System.out.println("Default constructor of c1");
	}
}