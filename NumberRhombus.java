package com.dla;

import java.util.*;

/**
 * @author DevLabs Alliance
 *
 */
public class NumberRhombus {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		rhombus(n);

	}

	/**
	 * @param n
	 */
	private static void rhombus(int n) {
		// TODO Auto-generated method stub
		int cols = 1, initialno = 0, space = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			if (i < n / 2 + 1) {
				initialno = i;
				space--;
			} else {
				initialno = n + 1 - i;
				space++;
			}
			for (int j = 1; j <= cols; j++) {
				int midcol = cols / 2 + 1;
				System.out.print(initialno);
				if (j < midcol) {
					initialno--;
				} else
					initialno++;
			}
			System.out.println();
			if ((i < n / 2 + 1)) {
				cols = cols + 2;
			} else
				cols = cols - 2;
		}

	}
}
