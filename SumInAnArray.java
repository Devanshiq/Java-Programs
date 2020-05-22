package javapractice;
import java.util.*;
public class SumInAnArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int[]arr=new int[n];
		int sum=0;
		System.out.println("Enter the  elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		s.close();
		System.out.println("Sum of array elements is "+sum);
	}

}
