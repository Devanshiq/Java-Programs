package javapractice;
import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */
//Breaking integer into digits

public class BreakInteger {
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the input number");
			int n=s.nextInt();
			breakint(n);
			s.close();
		}
	static int count=0;
	/**
	 * @param n
	 */
	public static void breakint(int n)
	{  //counting digits in an integer
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while(n>0)
		{
		int r=n%10;
		System.out.println("The digit at "+ count+" is"+ r);
		n=n/10;
		count--;
	}}

}
