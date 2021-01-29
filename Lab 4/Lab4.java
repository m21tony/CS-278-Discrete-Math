import java.util.*;
public class Lab4 {
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		int S, size , desiredSum;
		String subSets = "";
		
		//prompt the user for the size of the array (Assume it's < 10)
		System.out.println("Please enter the size of S: ");
		   S = scan.nextInt();
		
		//assign the size of the array
		int Set[] = new int [S];
		
		//prompt the user to enter different elements in the array
		System.out.println("Please enter S: ");
		for (int x = 0; x < Set.length; x++) {
		   		Set[x] = scan2.nextInt();
		}//end of for loop
		
		//prompt the user for a desired sum (N)
		System.out.println("Please enter the number N: ");
		   desiredSum  = scan.nextInt();
		   
		//generate subsets of S using a mask 
		subSets = subSets(Set, S, desiredSum);
		
		//print the subSets
		System.out.println(subSets);
	}//end of main method
	
	public static String subSets(int array[], int size, int desiredsum) {
		//variables
		String ans = "";
		int total = 0;
		int counter = 0;
		boolean flag;
		
		//Assume that there are no cases where the sum of the element is the 
		//desired sum
		flag = false;
		
		//loop and create the subSets of the Set S
		for (int i = 0; i < Math.pow(2, size); i++) {
			for (int j = 0; j < Math.pow(2, size); j++) {
				if ((i & (1<<j)) > 0) {
					
					//String concatenation
					ans += array[j] + " ";
					total += array[j];
				}//end of if statement
			}//end of j for loop 
			
			//if the sum is the desired sum print the cases when TRUE
			if (total == desiredsum) {
				counter++;
				System.out.println("Subsets with a sum of " + desiredsum + ": ");
				System.out.println("{ " + ans + "}");
				flag = true;
			}//end of if for printing results
			
			//reset the answer and total
			ans = "";
			total = 0;
			
		}//end of i for loop
		//if there are no cases where the sum of the elements is the
		//desired sum, let the user know
		if (flag == false) {
			System.out.println("does not exist");
		}
		//let the user know how many subsets add up to the desired sum
		System.out.println("There are " + counter + " with the sum " + desiredsum);
		//return the answer
		return ans;
	}//end of subSet Method
}//end of class