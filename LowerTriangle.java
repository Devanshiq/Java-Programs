package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class LowerTriangle {
	public static void main(String[] args) {
		
	
	System.out.println("Enter the matrix ");
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
	lowertri(mat,rows,cols);		
	}

	/**
	 * @param mat
	 * @param rows
	 * @param cols
	 */
	private static void lowertri(int[][] mat, int rows, int cols) {
		// TODO Auto-generated method stub
		System.out.println(" The lower triangular matrix is ");
		for(int i=0;i<rows;i++)
		{
			if(rows!=cols)
			{
				System.out.println("not possible as  matrix should be a square matrix ");
				break;
			}
			for(int j=0;j<cols;j++)
			{
				if(i>=j)
					System.out.print(mat[i][j]+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
		
	}
}
