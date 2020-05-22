package javapractice;


import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */
public class Conversion {
	
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input ");
		String str=s.nextLine();
		for(int i=1;i<str.length();i++)
		{
			char c = str.charAt(i);
			System.out.println("Character at "+i+"Position :"+c);
		}
		//conversion of string to character
		         //    (This is character array and not character)char ch[]=str.toCharArray();
		//conversion of character to string
		//using toString()method and valueof()method of String class
		char ch='a';
		//String s1=ch.toString();// can't convoke toString() on the primitive type char 
		String s3=Character.toString(ch); // the method toString()is not applicable for the arguments of type character array
		String s2 = String.valueOf(ch);
		System.out.println(s3);
		System.out.println(s2);
		s.close();
	}
}
	


