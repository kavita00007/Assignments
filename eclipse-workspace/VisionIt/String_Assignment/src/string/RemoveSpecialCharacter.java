package string;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		 String s = "#%$#%$*!! Hello There *&*&%$%$^ good";
		 
		// String s1 = s.replaceAll("#%&$*!^", " ");  
		 s = s.replaceAll("[^a-zA-Z0-9]", " ");  

		 System.out.println("String after removing special characetrs is :- " + s.trim());
	}

}
