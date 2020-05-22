package javapractice;
import java.util.*;

//to  find quotient and remainder of the dividend
/**
 * @author Devlabs Alliance
 *
 */
public class DivideANumber {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the dividend ");
	int n=s.nextInt();
	System.out.println("Enter the divisor ");
	int n1 = s.nextInt();
	int r=n%n1;
	int q=n/n1;
	System.out.println(r);
	System.out.println(q);
	s.close();
	
}
}
