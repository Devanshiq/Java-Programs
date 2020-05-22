package com.dla;

/**
 * @author DevLabs Alliance
 *
 */
//java program to display the cube of a number upto a given integer
public class CubeOfNumber {
	public static void main(String ar[]) {

		CubeOfNumber.cube(8);
	}

	/**
	 * @param num
	 */
	public static void cube(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println("The cube of a given number " + i + "is " + i * i * i);
		}

	}

}
