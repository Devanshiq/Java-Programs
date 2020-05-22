package com.dla;

//Reverse a string using recursion
/**
 * @author Devlabs Alliance
 *
 */
public class ReverseString {
	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println(ReverseString.reverse(s));  
	}
	//method for reversing a string
	/**
	 * @param str
	 * @return
	 */
	public static String reverse(String str)
	{
		if(str==null||str.length()<=1)
		{
			return str;
		}
		return(reverse(str.substring(1))+str.charAt(0));
	}
	
}
