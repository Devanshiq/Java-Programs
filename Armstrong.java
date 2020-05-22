package com.dla;


/**
 * @author Devlabs Alliance
 *
 */
public class Armstrong {

	 //ARMSTRONG NO
	//153=  1*1*1+5*5*5+3*3*3=153
	
	 public static void main(String ar[])
	   	{  Armstrong s=new  Armstrong();
	    s.armstrong(123);
	    s.armstrong(153);
	}
    public void armstrong(int n)
    {
   	 int temp,r,sum=0;
   	 temp=n;
   	 while(n>0)
   	 {
   		 r=n%10;
   		 sum=(sum)+(r*r*r);
   		 n=n/10;
   		 
   		 
   	 }
   	 System.out.println("");
   	 //comparing the number
   	 if(sum==temp)
    		System.out.println("No is armstrong ");//
    		else
    			System.out.println("No is not armstrong ");
   	 }
   }
