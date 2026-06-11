package TimeComplexity;

public class TimeAndSpaceComplexity {

	public static void main(String[] arg) {
		
		/*
		Use the same StudentMarkSystem code
		 
		Q1. Search for "Pooja" using 

		    Linear Search

		    - How many steps? Ans- 6

		    - Which index? Ans- 5
		 
		Q2. Search for "Karan" 

		    - Found or Not Found? Ans- Not found

		    - How many steps? Ans- 10
		 
		Q3. Search for "Amit"

		    - How many steps? Ans-1

		    - Best case or Worst case? Ans- Best case
		 
*/
		 
		        String[] students = {
		            "Amit", "Priya", "Rahul", "Sneha", "Raj",
		            "Pooja", "Vikas", "Neha", "Arjun", "Divya"
		        };
		 
		        int[] marks = {45, 78, 62, 89, 34,
		                       91, 55, 73, 88, 67};
		 
		        // Print all students
		        System.out.println("=== STUDENT MARK SYSTEM ===");
		        System.out.println("---------------------------");
		        for(int i = 0; i < students.length; i++) {
		            System.out.println((i+1) + ". " +
		                              students[i] + " = " + marks[i]);
		        }
		        
		        //To find top student
		        highestmarks(students,marks);
		 
		        // LINEAR SEARCH - Student name dhundho
		        System.out.println("\n=== LINEAR SEARCH ===");
		        searchStudent(students, "Pooja");
		        searchStudent(students, "Karan");
		        searchStudent(students, "Amit");
		        
		        
		    }
		 
		    // LINEAR SEARCH METHOD
		    static void searchStudent(String[] students,
		                              String name) {
		        boolean found = false;
		        int steps = 0;
		 
		        for(int i = 0; i < students.length; i++) {
		            steps++;
		            System.out.println("Checking: " + students[i]);
		 
		            if(students[i].equals(name)) {
		                System.out.println("✅ Found: " + name +
		                                 " at index " + i +
		                                 " | Steps = " + steps);
		                found = true;
		                break;
		            }
		        }
		 
		        if(!found) {
		            System.out.println("❌ " + name +
		                             " Not Found!" +
		                             " | Steps = " + steps);
		        }
		    }
		    
		    //function to find top student
		     static void highestmarks (String[] students,int[] marks) {
	        	int m = 0;
	        	for (int i=1;i<marks.length;i++) {
	        		if (marks[m] < marks[i]) {
	        			m=i;
	        		}
	        	}	
				System.out.println("Top Student: "+students[m]+ marks[m]); 
				
				int count = 0;
				
				for (int j = 0;j<marks.length;j++) {
					if(marks[j] > 60) {
						count++;
					}
				}
				
				System.out.println("Number of students scoring above 60: "+ count);
	        	
	        }
		     
		     
		}
		 
		 
	
