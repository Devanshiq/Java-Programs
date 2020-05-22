package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class CheckSparse {
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
		sparse(mat,rows,cols);		
	}

	/**
	 * @param mat
	 * @param rows
	 * @param cols
	 */
	private static void sparse(int[][] mat, int rows, int cols) {
		// TODO Auto-generated method stub
		int count=0;
		int order=rows*cols;
		/*
		if(rows!=cols)
		{
			System.out.println("The matrix should be a square matrix");
		}
		*/
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(mat[i][j]==0)
					count++;
			}
		}
		if(count>order/2)
		{
			System.out.println("The matrix is a sparse matrix");
		}
		else
			System.out.println(" the matrix is not a sparse matrix");
		
		
	}

}
