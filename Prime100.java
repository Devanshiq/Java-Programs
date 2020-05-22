package javapractice;
import java.util.*;

//to print first 100 prime numbers
/**
 * @author Devlabs Alliance
 *
 */
public class Prime100 {
public static void main(String[] args) {
	boolean flag=true;
	String primeno="";
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number for input");
	int n=s.nextInt();
	s.close();
	for(int i=2;i<=n;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=false;
			   break;
			}
			else
				flag=true;
						
		}
		
		if(flag==true)
		{
			
		primeno=primeno+i+" ";
			
		}

		
	}
	System.out.println("The prime numbers are "+primeno);
}
}
