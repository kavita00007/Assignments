package classobject;

import java.util.Scanner;

public class Car {
	
	String CarColour;
	String CarModelName;
	int CarPrice;
	String CarBrandName;
	
    public static void main(String[] args)
	
    {    
    	
    	System.out.println("Select a brand from following");
    	System.out.println("Honda");
    	System.out.println("Volkswagen");
        System.out.println("MG Hector");
        System.out.println("Tata");
        
        System.out.println("Enter Brand Name");
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        switch(str) 
        { 
            case "Honda":      honda();
                               break; 
            case "Volkswagen": volkswagen();
                               break; 
            case "MGHector":  mghector();
                               break;
            case "Tata":       tata();
            	               break;
            default: 
                        System.out.println("Enter valid brand name"); 
        } 
	}

	public static void tata() {
		
		System.out.println("CarModel : Tata Nexon");
		System.out.println("Car Brand : Tata");
		System.out.println("Car Coulr : Green");
		System.out.println("Car Price : 15 Lacs");
		return;
		
	}

	public static void mghector() {
		System.out.println("CarModel : MG Hector");
		System.out.println("Car Brand : MG Hector");
		System.out.println("Car Coulr : Black");
		System.out.println("Car Price : 14 Lacs");	
		return;
	}

	public static void volkswagen() {
		System.out.println("CarModel : Vento");
		System.out.println("Car Brand : Volkswagen");
		System.out.println("Car Coulr : Red");
		System.out.println("Car Price : 12 Lacs");	
		return;
	}

	public static void honda() {
		System.out.println("CarModel : Accord");
		System.out.println("Car Brand : Honda");
		System.out.println("Car Coulr : Grey");
		System.out.println("Car Price : 43 Lacs");	
		return;
	}

}
