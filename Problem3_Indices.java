package learnArrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Problem3_Indices {
	/*
	 * 1) Did I understand the problem ? Yes or No!
	 * 		-> If No, Ask the person to provide more detail with example(s)
	 * 		-> If yes, go to next step!
	 * 
	 *  what is the input(s)?
	 * 	What is the expected output?
	 * 	Do I have all informations to go to next step!
	 * 
	 * 2) Test Data Set
	 * 
	 * 		Minimum of 3 data set! Positive, Edge , Negative
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * 		Yes - great , is there an alternate?
	 * 		No - Can I break down the problem into sub problems?
	 * 
	 * 4) Ask for hint (IF you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * 		Yes - what are those?
	 * 		No - That is still fine , proceed to solve what you know
	 * 
	 * 6) If you know alternate solutions -> find out O Notations (Performance)
	 * 
	 * 	Then , explain either both or the best (depends on the time)
	 * 
	 * 		Approach 1 : Start with worst -> Improve (optimize) -> End up with best
	 * 		Approach 2 : Write down the options and benefits and code the best
	 * 
	 * 7) Start always with pseudo code
	 * 
	 * 8) Implement them in the code
	 * 
	 * 9) Test against different data set
	 * 
	 * 10) If it fails, debug them to solve it
	 * 
	 * 
	 */
	

	@Test //Positive
	public void example1() {
		int[] num = {2,-7,10,3};
		int target = 3;
		int[] match = matchingindices(num, target);
		assertEquals(true, Arrays.equals(match, new int[] {1,2}));
	}
	
	@Test //Edge
	public void example2() {
		int[] num = {3 ,3,3 ,5,1,4,3};
		int target = 9;
		int[] match = matchingindices(num, target);
		assertEquals(true, Arrays.equals(match, new int[] {3,5}));
	}
	@Test //Negative
	public void example3() {
		int[] num = {1,3,5,7,8};
		int target = 3;
		int[] match = matchingindices(num, target);
		assertEquals(true, Arrays.equals(match, new int[] {0,0}));
	}
	
	/* pseudocode
	 *  	
	 * Traverse from left to right ( one number at a time)
	 * pick the value of number and subtract that from target
	 * 		Traverse from next number to right
	 * 		If difference value found by traverse path ,
	 * 		get the index and stop the loop
	 * 		
	 * 	Else continue until the end
	 * 
	 * Iterate the rest of the value until you find matches
	 * If you find matches , we need the index (2 indices)
	 * 
	 * return indices
	 */
	
	private int[] matchingindices(int[] num, int target) {
		int[] indices =new int[2];
		for (int i = 0; i < num.length; i++) {
			int diff= target - num[i];
			for (int j = i+1; j < num.length; j++) {
				if(num[j]==diff) {
					indices[0]=i;
					indices[1]=j;
					break;
				}
			}
				
		}
		return indices;
	}
	
	}

