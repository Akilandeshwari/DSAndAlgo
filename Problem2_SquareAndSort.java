package learnArrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Problem2_SquareAndSort {

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
	

	@Test // Positive
	public void example1() {
		int[] num = {-4,-1,0,3,10};
		int[] result = squareAndSort(num);
		assertEquals(true, Arrays.equals(result, new int[] {0,1,9,16,100}));
	}
	
	@Test // Edge
	public void example2() {
		int[] num = {2, 2, 3 , 3 , 5};
		int[] result = squareAndSort(num);
		assertEquals(true, Arrays.equals(result, new int[] {4,4,9,9,25}));
	}
	@Test // Negative
	public void example3() {
		int[] num = {};
		int[] result = squareAndSort(num);
		assertEquals(true, Arrays.equals(result, new int[] {}));
	}
	
	/*
	 * Pseudocode 
	 * 
	 * Iterate through the input array , (one at a time) -- for loop
	 * square the value of given index (value * value)
	 * replace the value by squared value / store them in another array
	 * Finally sort the array -- Arrays.sort
	 * Return the array
	 * 
	 * 
	 */
	
	private int[] squareAndSort(int[] num) {
		for (int i = 0; i < num.length; i++) 
			num[i] = num[i] * num[i];
	
		Arrays.sort(num);
		return num;
	}

	/**
	 * 	Creating additional array is a space issue!
	 * Note : Try to minimize the number of variables, objects you use!
	 * 
	 */
	
	private int[] squareAndSort1(int[] num) {
		int[] num1 = new int[num.length];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = num[i] * num[i];
			
			Arrays.sort(num1);
		}
		return num1;
	}
}