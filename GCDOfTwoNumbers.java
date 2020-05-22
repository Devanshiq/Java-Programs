package javapractice;
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
//Greatest common divisor 
	//for eg 55,22    here the gcd is 11
public class GCDOfTwoNumbers {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=s.nextInt();
	System.out.println("Enter the second number ");
	int n2=s.nextInt();
	gcd(n1,n2);
	s.close();
	}
	
	public static void gcd(int n1,int n2)
	{
		int greatestdiv=1;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				 greatestdiv=i;
			}
			
		}
		//the method println(int) in the type PrintStream is not applicable for The arguments (String ,int,int)
		//System.out.println("Gcd of %d and %d is : %d ",n1,n2, greatestdiv);
		System.out.printf("Gcd of %d and %d is : %d ",n1,n2, greatestdiv);
	}

	
}
