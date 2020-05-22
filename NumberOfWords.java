package com.dla;

//java program to find the number of words in a given text file
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * @author Devlabs Alliance
 *
 */
public class NumberOfWords {
public static void main(String[] args) throws Exception {
	String d;
	int count=0;
	FileReader f = new FileReader("newfile1.txt");
	BufferedReader br=new BufferedReader(f);
	while((d=br.readLine())!=null)
	{
		String array[]=d.split(" ");
		count=count+array.length;
	}
	System.out.println(" no of words present in a given file is "+count);
br.close();
}
}
