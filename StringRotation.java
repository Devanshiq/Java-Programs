package com.dla;
//java program to check if one string is a rotation of another string 
//contains method 
import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */

public class StringRotation {
	public static void main(String[] args) {
		System.out.println("Enter the original string ");
		Scanner s = new Scanner(System.in);
	String str=s.nextLine();
	System.out.println("Enter the new string to check");
	String str1=s.nextLine();
	s.close();
	rotation(str,str1);
	}

	private static void rotation(String str,String dla) {
		// TODO Auto-generated method stub
		if(str.length()!=dla.length()) {
			System.out.println(" the new string is not a rotated string as their length is not equal");
		}
		else {
		str=str.concat(str);
		
		if(str.contains(dla))   
		{
			System.out.println(" The new string is a rotated string");
		}
		else
			System.out.println(" The new string is not a rotated string");
		
	}
	}
}
