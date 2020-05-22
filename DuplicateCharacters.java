package com.dla;

import java.util.Scanner;

/**
 * @author DevLabs Alliance
 *
 */
// java program to find duplicate characters in a string
public class DuplicateCharacters {

	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		duplicate(str);
		s.close();
	}

	static int count = 0;

	/**
	 * @param str
	 */
	public static void duplicate(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("The duplicate characters in a string is " + ch[i]);
			}
		}

	}

}
