package SortingTechniques;

public class Sorting1 {

	public static void main (String[] arg) {
		int arr[] = {64,25,12,22,11};
		 
		bubbleSort(arr);
		printArray(arr);
		
	}
	
	     static void bubbleSort (int []arr) {
	    	 int n = arr.length;
	    	  for (int pass=0; pass<n-1; pass++) {
	    		  
	    		  System.out.println("\n\n"+(pass+1)+"\n\n");
	    		  
	    	  for(int j=0;j<n-1-pass;j++) {
	    		  
	    		  System.out.println("");
	    		  
	    		  
	    		  if (arr[j]>arr[j+1]) {
	    			  
	    			 int temp = arr[j];
	    			 arr[j] = arr[j+1];
	    			 arr[j+1] = temp;
	    			 
	    			 System.out.println("Swapped!");
	    			 printArray(arr);
	    		  }
	    		  
	    	  }
	    	  }
	     }
		
		 static void printArray(int []arr) {
			 
			 for(int i=0;i<arr.length;i++) {
				 
				 System.out.println(arr[i]);
				 
			 }
		 }
	
}
