package practiceprograms;

public class Test1 {

	public static void main(String[] args) {
         
		A a=new B();
		a.test1();
		a.test2();
		A.test3();
	}

}

abstract class A
{
	abstract void test1();
	abstract void test2();
	
	static void test3() 
	{
		System.out.println("Test3 implemented");
	}
	
}

class B extends A
{

	@Override
	void test1() {
      System.out.println("test1 implementation");		
	}

	@Override
	void test2() {
	      System.out.println("test2 implementation");		
		
	}
	
}