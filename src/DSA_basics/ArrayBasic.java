package DSA_basics;

public class ArrayBasic {
	
	public static void main (String[] args) {
		
		
		
		
		//Basic for-loop to find highest
		
		
		//declaring array
		int []marks = {10,20,30,40,50};
		
		//a temporary variable to compare array elements
		int highest = marks[0];
		
		//for loop to get max in an array
		for (int i = 0; i<marks.length;i++) {
			if (marks[i] > highest) {
				highest = marks[i];
			}
		}
		
		System.out.println(highest);
		
		
		//To use for-loop to find elements greater or less than target
		
		
		int count = 0;
		
		for (int j =0;j<marks.length;j++) {
			if (marks[j] > 25) {
				count++;
			}
		}
		
		System.out.println("Students with marks greater than 25: "+ count);
		

 } 
}
