package com.dla;

import java.util.Scanner;
	//Descending order
	/**
	 * @author Devlabs Alliance
	 *
	 */
	public class DescendingBubbleSort  {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number of integers you want to sort");
			int n=s.nextInt();
			int []arr= new int [n];
		  System.out.println("Enter the elements ");
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=s.nextInt();
		  }
		  s.close();
		  bubble(arr,n);
		  
		}
		static int temp,i;
		/**
		 * @param arr
		 * @param n
		 */
		public static void bubble( int [] arr,int n)
		{int temp,i;
			for( i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(arr[j]<arr[j+1])
					{  temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
			System.out.println("The sorted array is ");
			for( i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}

	
	}



