package com.dla;
import java.util.*;

/**
 * @author DevLabs Alliance
 *
 */
//java program to find the sum and average of numbers 
public class SumAndAverage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the elements for summation");
		for(int i=0;i<n;i++) {
			int num=s.nextInt();
			
			sum=sum+num;
		}
		int avg=sum/n;
		s.close();
	System.out.println("The sum and average of the numbers are"+sum+"  "+avg);
	}

}

