package DSA_BinaryAndLinearSearchAssignment;

public class Assignment1_1 {

	public static void main(String[] arg) {
		
		/*
		DSA Homework Day 1 -Day 2
		Linear Search & Binary Search

		Q1. Trace Without Code (Linear Search)

		Array = {4, 9, 15, 23, 38, 52, 67}

		a) Search for 38 - At which index is it found? How many steps?
		Ans- Found at index 4. It takes 3 steps.
		
		b) Search for 70 - Found or Not Found?
		Ans- Not found.
		
		c) Search for 4 - How many steps does it take?
		Ans- 3 steps.
		
		

		Q2. Trace Without Code (Binary Search)

		Array = {4, 9, 15, 23, 38, 52, 67}

		a) Search for 52 - Show all steps
		Left=? Right=? Mid=? Value=?
		
		Step 1:
		target = 52, low = 0, high = 6, mid = 3, value = 23
		since 23<52, (new)low = mid+1  
		
		Step 2:
		low = 4, high = 6, mid = 5, value = 52
		since 52=52, found = true.
		
		Total steps = 2,At index 5.
		

		b) Search for 10 - Found or Not Found?
		Show all steps
		
		Step 1:
		target = 10,low = 0, high = 6, mid = 3, value = 23
		since 23>10, high = mid-1
		
		Step 2: 
		low = 0, high = 2, mid = 1, value = 9
		since 9<10, high = mid-1
		
		Step 3:
		low =0, high =0, mid = 0, value = 4
		Since low == high and the mid term is not equal to target 
		the number is not found in the array
		
		Total steps: 3, State: not found.
		
		*/
		
		
		/*

		Q3. Write the Code (Linear Search)

		Array = {18, 35, 7, 92, 44, 61, 29}
		Target = 44

		Print each step
		Print Found or Not Found
		Print index if found
		
		*/
		
		int []num = {18, 35, 7, 92, 44, 61, 29};
		int target = 44;
		Boolean found = false;
		
		for (int i =0; i<num.length; i++) {
			System.out.println("Step: "+(i+1));
			if (num[i] == target) {
				found = true;
				System.out.println(num[i] +" equal to "+ target);
				System.out.println("Number found at index "+i);
				break;
			}
			System.out.println(num[i] +" is not equal to "+ target +" taking next number.");
			
		}
		
			if (!found) {
				System.out.println("Number not found.");
			}

	}
}
