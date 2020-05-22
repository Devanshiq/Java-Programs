package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
/**
 * 
 *
 */
public class FrequencyOfMatrix {
	// TO FIND FREQUENCY OF AN ODD AND EVEN INTEGER IN A MATRIX

	public static void main(String ar[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// initializing the array
		FrequencyOfMatrix f = new FrequencyOfMatrix();
		f.freq(a);

	}
	
	
	/**
	 * @param m
	 * 
	 */
	public void freq(int[][] m) {
		int r, c, evecount = 0, oddcount = 0;
		r = m.length;
		c = m[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (m[i][j] % 2 == 0)// checking for divisibility by 2
				{
					evecount++;
				} else
					oddcount++;
			}
		}

		System.out.println("The frequency of odd integer " + oddcount);
		System.out.println("The frequency of even integer " + evecount);
	}

}