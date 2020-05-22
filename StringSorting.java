package com.dla;
//hsving doubt
import java.util.Arrays;
import java.util.Scanner;

//converting string to stringarray

public class StringSorting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array of strings");
		String str =s.nextLine();
		String []dla=str.split(",");
		String arr=Arrays.toString(dla);
		System.out.println(arr);
		s.close();
	}

}
