package com.dla;
 
import java.util.*;
/**
 * @author Devlabs Alliance
 *
 */
public class GreatestNumber {
	// to find greatest number using ternary operator
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);	
System.out.println("Enter the first number ");

int n1 = s.nextInt();
System.out.println("Enter the second  number ");

int n2 = s.nextInt();

System.out.println("Enter the third number ");

int n3 = s.nextInt();
int  dla=n1>n2?n1:n2;
int result= dla>n3?dla:n3;

System.out.println("The greatest number of all the three numbers "+result);
s.close();

}
}
