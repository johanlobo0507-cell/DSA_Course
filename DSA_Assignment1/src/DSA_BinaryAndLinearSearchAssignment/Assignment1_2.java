package DSA_BinaryAndLinearSearchAssignment;

public class Assignment1_2 {

	public static void main(String[] arg) {
		
		/*

		Q4. Write the Code (Binary Search)

		Array = {7, 18, 29, 35, 44, 61, 92}
		Target = 61

		Print each step with Left, Right, Mid, Value
		Print total steps taken
		Print Found at index

*/
		
		int []num = {7, 18, 29, 35, 44, 61, 92};
		int target = 61;
		
		int low = 0, high = num.length-1;
		Boolean found = false;
		int steps = 0;
		
		while(!found) {
			int mid = (low+high)/2;
			steps++;
			System.out.println("Step: "+steps);
			
			
			System.out.println("Low = "+low+" High = "+high+" Middle = "+mid+" Value = "+num[mid]);
			if (num[mid] == target) {
				System.out.println("Number found at index "+mid);
				break;
			}
			else if (low==high) {
				System.out.println("Number not found in array.");
				break;
			}
			else if (num[mid] < target) {
				low = mid+1;
			}
			else if (num[mid] > target) {
				high = mid-1;
			}
		}
		
		System.out.println("Total steps: "+steps);
		
		
		/*
		Q5. Thinking Question

		Array = {7, 18, 29, 35, 44, 61, 92}
		Search for 29

		a) How many steps in Linear Search?
		Ans- 3 Steps.
		
		b) How many steps in Binary Search?
		Ans- 3 Steps.
		
		c) Which is faster and why? (Write 2-3 lines)
		Ans- In some cases Linear might be faster or equal to Binary search such as the one above, but overall or when the 
		number of elements are very large the Binary search is way faster and reliable than Linear search.
		Time complexity Binary: o(log(n))
		Time complexity Linear: o(n)
		 
		*/
		
		
		
	}
}
