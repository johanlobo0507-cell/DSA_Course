package DSA_BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Binary search
		
		
			int []arr = {19,20,34,56,78,90,101};
			int target = 90;
			Boolean found = false;
			
			int low = 0, high = arr.length-1;
			int mid = (low+high)/2;
			
			do {
				if (arr[mid] == target) {
					found = true;
					System.out.println("The number is found at "+mid+"th element of array.");
					break;
				}
			    else if (arr[mid] > target) {
					high = mid-1;
				}
				else if (arr[mid] < target) {
					low = mid+1;
				}
				mid = (low+high)/2;
			}
			while (!found);
	}
}
