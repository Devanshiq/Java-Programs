package javapractice;

//Checking palindrome string using recursion
/**
 * @author Devlabs Alliance
 *
 */
public class CheckPalindrome {
	
	public static void main(String[] args)
	{
		String s="nagesh";
		Boolean h=Palin(s);
		System.out.print(h);
		
	}
	/**
	 * @param str
	 * @return
	 */
	public static Boolean Palin(String str)
	{// String first =str.substring(0,1);
	//String last=str.substring(str.length()-1,str.length());
		char first=str.charAt(0);        // String first is giving error. Why we can't use datatype String here????
		char last=str.charAt(str.length()-1);
		if(first!=last)  //here it is not comparing the content but the reference
	//if(!first.equals(last))
			//!first.equals(last)
			//return ("String is not a palindrome ");
	         return false;
		if(str.length()<=1)
			return true;
		else
	return		(Palin(str.substring(1,str.length()-1)));
	
	}
	

}
