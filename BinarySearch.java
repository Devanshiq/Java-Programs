package javapractice;


/**
 * @author Devlabs Alliance
 *
 */
public class BinarySearch {
	public static void main(String[] args)
	{
		
		int a[]= {1,43,65,78,90,93,97};
		System.out.println(binary(7,0,6,a));
	}
	/**
	 * @param key
	 * @param low
	 * @param high
	 * @param arr
	 * @return
	 */
	public static int binary(int key,int low,int high,int arr[])   //for binary search the array should be in sorted order
	{    if(low>high)		
		return -1;

		int mid=(high+low)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]<key)   ///key is in right half
		{
			return(binary(key,mid+1,high,arr));
		}
		else if (arr[mid]>key)  //key is in left half
		{
			return(binary(key,low,mid-1,arr));
		}
		else
			return -1;
//		
	}

}
