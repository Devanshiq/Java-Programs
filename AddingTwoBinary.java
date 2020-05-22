package javapractice;

import java.util.Scanner;

public class AddingTwoBinary {
	public static void binary(int n1,int n2)
	{int last1,last2,sum=0,carry=0;
	int arr[]= new int [10];
	
	    for(int j=arr.length-1;j >= 0;)
			{
				
			
			last1=n1%10;
			last2=n2%10;
			while(last1<=1&&last2<=1)
			{
				sum=last1+last2+carry;
				if(sum==0)
				{
					arr[j]=0;
					carry=0;
				}
				if(sum==1)
				{
					arr[j]=1;
					carry=0;
				}
				if(sum==2)
				{
					arr[j]=0;
					carry=1;
				}
				if(sum==3)
				{
					arr[j]=1;
					carry=1;
				}
				break;
				
			}
			
			
		}
		
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
			}
		}
		
		
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int n1=s.nextInt();
		System.out.println("Enter the second  number ");
		int n2=s.nextInt();
		s.close();
		binary( n1, n2);
	}

}
