package DSA_basics;

public class LinearSearch {

	public static void main(String[] args) {
		//Linear Search
		
				int []numbers  = {23,34,45,56,67,78,90};
				int target = 56;
				Boolean found = false; 
				int i;
				
				for (i=0; i<numbers.length; i++) {
					if (numbers[i] == target) {
						found = true;
						break;
					}
					
				}
				if (!found) {
					System.out.println("Number not found.");
				}
				else {
					System.out.println("The target is "+ i+1 +"th element of the Array");
				}
				
	}
}
