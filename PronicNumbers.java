package com.dla;

/**
 * @author DevLabs Alliance
 *
 */

//Java program to print all pronic numbers between 1 to 100

//Pronic number can be defined as the number which is a product of two consecutive numbers
//for example 72=8*9    20=5*4

public class PronicNumbers {
	public static void main(String[] args) {

		System.out.println("The pronic numbers between 1 to 100 are  ");
		pronic();

	}

	private static void pronic() {
		// TODO Auto-generated method stub
		int flag = 1;
		int i, j;
		for (j = 1; j <= 100; j++) {
			for (i = 1; i <= 100; i++) {
				if (i * (i + 1) == j) {
					flag = 1;

					break;
				} else
					flag = 0;

			}

			if (flag == 1) {
				System.out.print(j + " ");

			}
		}
	}

}
