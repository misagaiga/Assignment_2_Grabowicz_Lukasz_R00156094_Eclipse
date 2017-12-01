
/**
 * Class: ChangeMaking
 * This class implements a greedy algorithm for solving the change making problem.
 */

public class ChangeMaking {
	/**
	 * Method: testChangeMaking
	 * 
	 * Tests and compares the algorithm for making change.
	 */
	public static void testChangeMaking()
	{
	
			int[] denoms = new int[4];

			// possible changes of coins 
			denoms[0]=20; // coin of value 20
			denoms[1]=10; // coin of value 10
			denoms[2]=5;  // coin of value 5
			denoms[3]=1;  // coin of value 1
	
			int val1 = 0; // maximum amount of money
			int val2 = 35; // maximum amount of money
			int val3 = 53; // maximum amount of money
			
		    System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val1));
			System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val2));
			System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val3));

	
	}

	/**
	 * Method: makeChangeGreedy
	 * 
	 * Implements the greedy algorithm for solving
	 * the change making problem.
	 * 
	 * @param denoms array containing the different denominations
	 * @param val the target sum
	 * @return the number of coins needed
	 */
	public static int makeChangeGreedy(int[] denoms, int val)
	{	
		int minNumberOfCoins =0;
		// Traverse through denoms array, to compute maximum number of coins of a denomination
		// to satisfy remaining value and counting minimum number of coins
		
		int numberOfCoinsOfAValue =0;
		for(int i=0;i<denoms.length; i++) {
			if(denoms[i]<=val) {
				numberOfCoinsOfAValue = val/denoms[i];
				System.out.println(numberOfCoinsOfAValue + " x "+ denoms[i]);
				val-=numberOfCoinsOfAValue*denoms[i];
				minNumberOfCoins +=numberOfCoinsOfAValue;
			}
		}
		return minNumberOfCoins;
	}

	/**
	 * Main.
	 */
	public static void main(String[] args)
	{
		testChangeMaking();
	}
}
