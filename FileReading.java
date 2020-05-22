package file_handling;
import java.io.*;
//java program to read from a file using BufferedReader
//FileReader is the child class of Reader class

public class FileReading {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        FileReader f=new FileReader("newfile2.txt");
        BufferedReader buff = new BufferedReader(f);
//        int str=0;
//        while(buff!=null)
//        {
//        	str= buff.read();
//        }
//        System.out.println((char)str);
       
        int ch;
        while((ch=buff.read())!=-1)
        {
        	System.out.print((char)ch);
        }
        
        
        
        buff.close();
		
	}

}
