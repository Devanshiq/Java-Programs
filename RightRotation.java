package com.dla;
import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */


	//java program to right rotate an array

    // 89 5 45 67 3 56 7
    // 56 7 89 5 45 67 3     (we have rotated the above array by 2 positions)
  

public class RightRotation {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter ");
		int n= s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the no of positions by which you have to rotate the array ");
		int n1=s.nextInt();
		
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		right(arr,n1);
		s.close();
	}

	public  static  void right(int []array,int n)
	{
	for(int i=0;i<n;i++)
	{
		int last=array[array.length-1];
		for(int j=array.length-1;j>0;j--)
		{
			array[j]=array[j-1];
			
		}
		array[0]=last;
	}
	System.out.println("after rotation the elements are ");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
	{
		
	}
		
	}

}
