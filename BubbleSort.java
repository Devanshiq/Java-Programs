package javapractice;
//having doubt
// to perform  bubble sort on strings 
// to sort strings in alphabetical order
import java.util.*;
public class BubbleSort {
	static char temp;
	public static void sort(String str)
	{  char []c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				
			
					
				if(c[i]>c[j])
				{ temp=c[j];
					c[j]=c[i];
				c[i]=temp;
				}
			}
		}
		System.out.println("The sorted string is ");
		for(int i=0;i<c.length;i++)   //we can't write here as for(int i:c)
		//for(int i=0:c)
		{
			System.out.println(c[i]);
		}
	}
   public static void main(String[] args) {
	System.out.println("Enter the input as a string");
	   Scanner s = new Scanner(System.in);
	    String str=s.nextLine();
	    s.close();
			sort(str);
		
			
}
}
