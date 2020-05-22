package com.dla;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern {
	public static void main(String[] args)
	{
		Pattern.pattern(10);
	}

	public static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
