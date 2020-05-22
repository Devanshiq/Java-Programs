package com.dla;


/**
 * @author Devlabs Alliance
 *
 */
public class LinearSearch {
	
public static void main(String[] args)
{
	int array[]= {1,2,5,-6,8};// initializing the array
	System.out.println(lin(9,array));
	
}
	/**
	 * @param key
	 * @param arr
	 * @return
	 */
	public static int lin(int key,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)//comparing the key
			{
				return i;
			}
			
		}
		return -1;
	}
	

}
