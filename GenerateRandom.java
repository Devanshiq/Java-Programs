package com.dla;
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class GenerateRandom {
	public static void main(String[] args) {
		//here Random is a class and nextInt() is a method of class Random 
		Random r= new Random();
		System.out.println("Enter the number of random numbers you want to print");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println("The random numbers are ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(r.nextInt(100)); //print n numbers upto 100
		}
		
	}

}
