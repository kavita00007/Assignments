package array_assignment;

//program to reverse integer array

public class ReverseArray {

	public static void main(String[] args) {

        int array[]= new int[5];
		array[0]=11;
		array[1]=22;
		array[2]=33;
		array[3]=44;
		array[4]=55;
		
		System.out.println("Original Array");

		
		for(int i=0;i<array.length;i++) {
		
		System.out.println(array[i]);
		
		}
		
		System.out.println("\n");
		
		System.out.println("Array elements in reverse order");
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
		
	}
	

}
