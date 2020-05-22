package com.dla;
/**
 * @author Devlabs Alliance
 *
 */
//TO FIND SUM OF EACH ROW AND EACH COLUMN
public class SumInAMatrix {
	 
    public static void main(String ar[])
   	{
    	SumInAMatrix s=new SumInAMatrix();
    	
    int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
    
   	s.sum(b);
   	}
	 
   
    public void sum(int[][]mat)
    {int r,c,sumr,csum;
    r=mat.length;
    c=mat[0].length;
    for(int i=0;i<r;i++)
    {sumr=0;
   	 for(int j=0;j<c;j++)
   	 {
   		sumr=sumr+mat[i][j];
   		 
   	 }
   	 System.out.println("sum of row no:"+(i+1) +"is"+sumr);
    }
    for(int i=0;i<c;i++)
    {csum=0;
   	 for(int j=0;j<r;j++)
   	 {
   		 
   		csum=csum+mat[j][i];    
   		 
   	 }
   	 System.out.println("sum of column no:"+(i+1) +"is"+csum);
    }
   
    }
   
    
}
