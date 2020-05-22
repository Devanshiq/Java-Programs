package javapractice;
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class DisplayOdd {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number upto which  odd numbers are displayed");
		int n=s.nextInt();
		odd(n);
		System.out.println("Enter the number upto which  even numbers are displayed");
		int n1=s.nextInt();
		even(n1);
		s.close();
 	}

	public static void odd(int n) {
		System.out.println("The odd numbers are");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}
	}
	public static void even(int n) {
		System.out.println("The odd numbers are");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
