package com.dla;
import java.util.*;
/**
 * @author DevLabs Alliance
 *
 */
public class SecondLargest {
	public static void main(String[] args) {
		//taking input from the user
		System.out.println("Enter the number of elements you want to enter");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("The given array is ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		s.close();
		secondlarge(arr, n);
	}
     /**
	 * @param arr
	 * @param n
	 */
	private static void secondlarge(int[] arr, int n) {
		// TODO Auto-generated method stub
		int dla;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					dla = arr[i];
					arr[i] = arr[j];
					arr[j] = dla;
				}
			}
		}
		System.out.println();
		System.out.println("The array  after arranging is ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The second largest element is  " + arr[1]);
}
}
