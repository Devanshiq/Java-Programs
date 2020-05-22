package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */
public class CheckNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input ");
		int n = s.nextInt();
		if (n == 0)
			System.out.println("It is a zero no");
		else
			System.out.println(n > 0 ? "Its a positive no" : "It is a negative number ");
		s.close();

	}

}
