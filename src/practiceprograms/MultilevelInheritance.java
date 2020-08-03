package practiceprograms;

public class MultilevelInheritance {

	public static void main(String[] args) {
       
		sample3 s1=new sample3();
		s1.test3();
		
	}

}

class sample1
{
	sample1()
	{
		System.out.println("Constructor sample1");
	}
}

class sample2 extends sample1
{
	sample2()
	{
		System.out.println("Constructor sample2");
	}
	
	
}

class sample3 extends sample2
{
    void test3()
    {
    	System.out.println("Test3 method");
    }
}