package com.dla;

/**
 * @author DevLabs Alliance
 *
 */
public class LeapYear {
	public static void main(String args[]) {
		LeapYear.leapyr(2006);
		LeapYear.leapyr(2016);
	}

	/**
	 * @param n
	 */
	public static void leapyr(int n) {
		if (n % 4 == 0) {
			System.out.println("The year is a leap year");
		} else if (n % 100 == 0) {
			System.out.println("The year is not a leap year");

		} else if (n % 400 == 0) {
			System.out.println("The year is a leap year");

		} else {
			System.out.println("The year is  not a leap year");
		}
	}

}
