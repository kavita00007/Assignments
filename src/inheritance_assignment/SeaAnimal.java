package inheritance_assignment;

public class SeaAnimal {
	

     public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Program");
       fish f=new Shark();
       f.Greetings();
       System.out.println("Program ends");
	}

}

class fish
{
	fish()
	{
		System.out.println("Fish constructor");
	}
	void Greetings() {
		System.out.println("This is base class of all fish");
	}
}

class Shark extends fish
{
	Shark(){
		super();
		System.out.println("Shark constructor");
	}
	
	void Greetings() {
		
		System.out.println("This is subclass of fish class category");
	}
	
	void Bite(){
		System.out.println("I can bite");
	}
}