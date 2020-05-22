package javapractice;


/**
 * @author Devlabs Alliance
 *
 */
public class OccurencesOfCharacter {
	public static void main(String[] args)
	{
		String str="Hello there";
		OccurencesOfCharacter.occur(str);// calling the static method
		
	}

	/**
	 * @param str
	 */
	public static void occur(String str)
	{//char[]=new int char[];
		int count=0;
		char[] c=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{    count=0;
	
	
		for(int j=0;j<str.length();j++) {
			if(j<i&&c[i]==c[j])
			{
				break;
			}
			if(c[i]==c[j])
				count++;
			if(j==str.length()-1)
				System.out.println("The no of times "+str.charAt(i)+"has appeared is "+count);//
		}
		//if(i<j) {
		//if j is traversed upto the last without any break then the below statement will be  printed
		//if(j==str.length()-1)
		//System.out.println("The no of times "+str.charAt(i)+"has appeared is "+count);
	//}
		
	}
	
	}
	
}
