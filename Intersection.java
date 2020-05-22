package javapractice;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class Intersection {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]=new int[5];
		int arr1[]=new int[5];
		System.out.println("Enter the elements for first array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("The first array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the elements for second array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("The second array is ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		s.close();
		intersection(arr,arr1);
		
	}

	/**
	 * @param a
	 * @param a1
	 */
	private static void intersection(int[]a,int []a1) {
		// TODO Auto-generated method stub
		int array[]=new int[20];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a[i]==a1[j])
				{
					array[k]=a[i];
					k++;
					
				}
				else
					continue;
			}
		}
		System.out.println();
		System.out.println("Intersection of two arrays is");
		for(int i=0;i<k;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

}
