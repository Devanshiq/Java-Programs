package com.dla;

import java.util.Scanner;

/**
 * @author Devalbs Alliance
 *
 */
public class CheckIdentity {
	public static void main(String[] args) {
  		

		System.out.println("Enter the matrix ");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the  no of rows in a matrix");
		int rows=s.nextInt();
		System.out.println("Enter the  no of columns in a matrix");
		int cols=s.nextInt();
		
/*
			if(rows!=cols) {
				System.out.println(" The matrix is not a square matrix ");
			//break;
			}
*/		
		
		int mat[][]=new int[rows][cols];
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
		identity(mat,rows,cols);			
		
		
		
		
	}

	 static boolean  res=true;
	/**
	 * @param matrix
	 * @param r
	 * @param c
	 */
	public static void identity(int [][]matrix,int r,int c)
	{int i,j;
	if(r!=c)
		System.out.println("the matrix is not a square matrix ");
		for( i=0;i<r;i++)
		{
			/*
			if(r!=c) {
				System.out.println(" The matrix is not a square matrix ");
			break;
			}
			*/
			for( j=0;j<c;j++)
			{
				/*
				if(r!=c) {
					System.out.println(" The matrix is not a square matrix ");
				break;
				}
				*/
			//else
				{
			
				if(i==j&&matrix[i][j]!=1) {
					res=false;
				break;
			}
				 if(i!=j&&matrix[i][j]!=0)
				{
					res=false;
					break;
				}
			}
		}
	
				
				}
		if(res==false)
		{
			System.out.println(" the matrix is not an identity matrix");
		}
		if (res==true)
		{
			System.out.println("The matrix is an identity matrix");
		}
		
		}
	
	
}
