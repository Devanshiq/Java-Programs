package javapractice;
import java.util.*;

//to add two complex numbers
/**
 * @author Devlabs Alliance
 *
 */
public class ComplexAddition {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the real part of a number1 ");
		int r1=s.nextInt();
		System.out.println("Enter the complex part of a number1 ");
		int c1=s.nextInt();
		System.out.println("Enter the real part of a number2 ");
		int r2=s.nextInt();
		System.out.println("Enter the complex  part of a number2 ");
		int c2=s.nextInt();
		add(r1,c1,r2,c2);
		s.close();
	}
	/**
	 * @param r1
	 * @param c1
	 * @param r2
	 * @param c2
	 */
	public static void add(int r1,int c1,int r2,int c2)
	{ 
		System.out.println(" the real part of a final number1 is ");
	int r=r1+r2;
	System.out.println(r);
	System.out.println(" the complex part of a final number1 is ");
		int c=c1+c2;
		System.out.println(c);
	}


}
