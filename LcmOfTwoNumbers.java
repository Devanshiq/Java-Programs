package com.dla;
import java.util.Scanner;
	/**
	 * @author DevLabs Alliance
	 *
	 */
	public class LcmOfTwoNumbers{
		public static void main(String args[]) {
			int a,b,l;
			System.out.println("Enter the number which lcm has to be found");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			sc.close();
			for(l=1;l<=a*b;l++)
				if(l%a==0&&l%b==0)
					break;
			System.out.println("The lcm of the two numbers is"+l);
		}

}
