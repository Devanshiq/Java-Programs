package com.dla

/*
 *  12345
 *  1234
 *  123
 *  12
 *  1
 *  1
 *  12
 *  123
 *  1234
 *  12345

 */
import java.util.*

/** 
 * @author Devlabs Alliance
 */
class Pattern3 {
	def static void main(String[] args) {
		var Scanner s = new Scanner(System::in)
		System::out.println("Enter the number of rows ")
		var int n = s.nextInt()
		pattern(n)
		s.close()
	}

	/** 
	 * @param n
	 */
	def static void pattern(int n) {
		for (var int i = n; i >= 1; i--) {
			for (var int j = 1; j <= i; j++) {
				System::out.print('''«j» '''.toString)
			}
			System::out.println()
		}
		for (var int i = 1; i <= n; i++) {
			for (var int j = 1; j <= i; j++) {
				System::out.print('''«j» '''.toString)
			}
			System::out.println()
		}
	}
}
