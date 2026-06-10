package DSA_BinarySearch;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		//dry run question:
				/*
				 Array = {2, 8, 15, 23, 37, 49, 62}
				 

				 Target = 23
				 
				Step 1: Left=0 Right=6 Mid=3 Value=23

				 Step 2: Left=? Right=? Mid=? Value=? (not required)
				 
				Found at index = 3

				 Total steps = 1
				 
				 */
				
				
				
				/*
				 * // Search for 37 in this array

		 // Print found or not found

		 // Print index if found

		 // Print total steps taken
		 
		int[] array = {3, 11, 23, 37, 52, 68, 79};

		 int target = 37;
				 */
				 
				
				int []arr = {3, 11, 23, 37, 52, 68, 79};
				int target = 11,low = 0,high = arr.length - 1;
				Boolean found = false;
				int count = 0;
				
				
				while(!found) {
					int mid = (low+high)/2;
					count++;
					
					if (arr[mid] == target) {
						System.out.println("Target found at index "+mid+" Steps: "+count);
						found = true;
						break;
					}
					else if(arr[mid] < target) {
						high = mid-1;
					}
					else if (arr[mid] > target) {
						low = mid+1;
					}
					else  {
						System.out.println("Number not found in Array.");
					}
				}
	}
}
