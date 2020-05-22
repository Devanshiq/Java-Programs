package com.dla;

/**
 * @author DevLabs Alliance
 *
 */
//java program to count total no of vowels and consonant in string

public class CharactersInAString {

	public static void main(String[] args) {
		int vcount = 0, ccount = 0;
		String str = "This is the length of string character";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vcount++;
			} else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				ccount++;
			}
		}
		System.out.println("No of vowels " + vcount);
		System.out.println("No of consonants " + ccount);

	}
}
