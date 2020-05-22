package javapractice;

import java.util.Scanner;


/**
 * @author Devlabs Alliance
 *
 */
//for prime number
public class PrimeFirst {
 public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter the input number ");
	 int n=s.nextInt();
	 s.close();
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("It is not a prime number ");
			break;
		}
			else
				System.out.println("Its a prime number ");
		
	}
	
}	

}
