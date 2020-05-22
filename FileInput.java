package file_handling;
import java.io.*;
//java program to read from a file using FileInputStream
//here it is only recognizing the file created with the help of newfilecreated() method 
 public class FileInput {
        public static void main(String[] args) throws IOException {
        	FileInputStream fin = new FileInputStream("newfile2.txt");
        	int i;
//        	while(fin.read()!=-1) {
//        	int i=fin.read();
//			System.out.println((char)i);
			do {
				i=fin.read();
				if(i!=-1)
				{
					System.out.print((char)i);
				}
			}while(i!=-1);
        	
			
        	
        	fin.close();
		
			}
        }
 
