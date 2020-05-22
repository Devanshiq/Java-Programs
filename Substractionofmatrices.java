package com.dla;
/**
 * @author Devlabs Alliance
 *
 */


public class Substractionofmatrices {
	   
	public static void main(String ar[])
		{
			int [][] matrices1= {{5,4,3},{3,4,7},{5,9,0}};
			int [][] matrices2= {{3,5,6},{4,5,2},{4,0,5}};
			 Substractionofmatrices m=new  Substractionofmatrices();
			 m.subs(matrices1, matrices2);
	}

	//TO SUBSTRACT TWO MATRICES
	/**
	 * @param n
	 * @return
	 */
	public int cube(int n)
	{
		return (n*n*n);
	}

	
		
		public void subs(int[][]mat1,int [][]mat2)
		{int rows,cols;
		rows=mat1.length;
		cols=mat1[0].length;
		
		System.out.println("\tThe elements of matrix1 are ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("\t "+mat1[i][j]);
				
			}
			System.out.println(" ");
		}
		
		System.out.println("\tThe elements of matrix2 are ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("\t "+mat2[i][j]);
			}
			System.out.println(" ");
		}
		
		int subst[][]=new int[rows][cols];
		//rows=mat1.length;
		//cols=mat1[0].length;
			
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					subst[i][j]=mat1[i][j]-mat2[i][j];
				}
			}
			
      /*
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.println("The elements of matrix1 are "+mat1[i][j]);
					
				}
				System.out.println(" ");
			}
			

			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.println("The elements of matrix2 are "+mat2[i][j]);
				}
				System.out.println(" ");
			}
			*/
			System.out.println("The elements of difference matrix  are ");
	       for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print(subst[i][j]+"  ");
				}
				
				System.out.println();
			}
		}
	
 
}