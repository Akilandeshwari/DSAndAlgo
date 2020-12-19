package learnArrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Problem1_OccurenceCount {

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
	

	@Test // positive
	public void example1() {
		int[] num = {1,2,3,4,4,3,3,3,10};
		int k=3;
		int occCount = getOccCount(num,k);
		Assert.assertEquals(4, occCount);
	}
	
	@Test // Edge
	public void example2() {
		int[] num = {1,2,1,2,1,2,2,1};
		int k=3;
		int occCount = getOccCount(num,k);
		Assert.assertEquals(0, occCount);
	}
	
	@Test //Negative
	public void example3() {
		int[] num = {};
		int k=3;
		int occCount = getOccCount(num,k);
		Assert.assertEquals(0, occCount);
	}
	/*
	 * Pseudocode 
	 * 
	 * Iterate the array from left to right (one at a time)
	 * take the specific number from the array index
	 * compare the expected value
	 * if matches -> add a count
	 * else -> no action
	 * 
	 * return the count
	 * 
	 */
	
	
	private int getOccCount(int[] num , int k) {
	int count=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] ==k) count ++;
	}
		return count;
}
}