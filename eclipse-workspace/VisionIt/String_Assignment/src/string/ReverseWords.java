package string;

public class ReverseWords {

	public static void main(String[] args) {

		String str3 = "One two there four five six";
		String[] words = str3.split(" "); 
		
        StringBuilder str4 = new StringBuilder();
		
		for (int i = words.length - 1; i >= 0; i--) {
            str4.append(words[i]).append(" ");
        }
        System.out.println("New string of reverse words = " + str4);
        return;
	}

}
