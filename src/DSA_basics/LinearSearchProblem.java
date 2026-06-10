package DSA_basics;

public class LinearSearchProblem {

	public static void main(String[] args) {
		
		/*
		Array = {5, 12, 19, 28, 33, 47, 56}
 
Q1. Search for 33 — At which index is it found?

 Q2. Search for 100 — What will be printed?

 Q3. Search for 56 — How many steps does it take?
		*/
		
		
		
		
		int[] eg = {5,12,19,28,33,47,56};
		int target = 33;
		Boolean found = false;
		int i;
		
		for (i=0;i<eg.length;i++) {
			if (eg[i] == target) {
				found = true;
				break;
			}
			
		}
		
		if (!found) {
			System.out.println("Number not found.");
		}
		else {
			System.out.println("The target is at index "+i+"th eleement.");
		}
		
		System.out.println("The number of steps: "+i);
	}
	}

