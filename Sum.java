package com.dla;

import java.util.Scanner;
/**
 * @author Devlabs Alliance
 *
 */

//to find the sum of each row and column in a matrix 
public class Sum {
	public static void main(String[] args) {
		
		
		//System.out.println("Enter the matrix ");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the  no of rows in a matrix");
		int rows=s.nextInt();
		System.out.println("Enter the  no of columns in a matrix");
		int cols=s.nextInt();

		int mat[][]=new int[rows][cols];
		System.out.println("Enter the elements of the matrix ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		System.out.println(" the original matrix is ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
		s.close();
		add(mat,rows,cols);
	}

	/**
	 * @param matrix
	 * @param rows
	 * @param cols
	 */
	private static void add(int[][] matrix,int rows, int cols) {
		int sum=0;
		// TODO Auto-generated method stub
	System.out.println("Sum of rows in a matrix ");
	for(int i=0;i<rows;i++)
	{ sum=0;
		for(int j=0;j<cols;j++)
		{
			sum=sum+matrix[i][j];
		}
		System.out.println("The sum of the element of the "+(i+1)+"row is "+sum);
		
	}
	System.out.println("Sum of cols in a matrix ");
	for(int i=0;i<cols;i++)
	{ sum=0;
		for(int j=0;j<rows;j++)
		{
			sum=sum+matrix[j][i];
		}
		System.out.println("The sum of the element of the "+(i+1)+"column is "+sum);
		
	}
	}

}
