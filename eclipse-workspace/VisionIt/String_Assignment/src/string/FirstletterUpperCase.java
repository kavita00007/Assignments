package string;

import java.util.Scanner;

public class FirstletterUpperCase {

	public static void main(String[] args) {
		
		String str5= "tom is becoming a programmer";
		String str6="";
		Scanner str7 = new Scanner(str5);
	      while(str7.hasNext()) 
	      {
	         String word = str7.next();
	         str6 += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
	      }
	      System.out.println(str6);
	   


	}

}
