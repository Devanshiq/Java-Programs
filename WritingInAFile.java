package file_handling;
import java.io.*;
//using FileInputStream
//f1.canWrite();
//f1.exists()
//f1.getName()
//object represents meta data of file


public class WritingInAFile  {
 public static void main(String[] args) throws IOException{
	File f1 = new File("nwfile.txt");
	System.out.println("is file  exists "+ f1.exists());
	f1.createNewFile();
	System.out.println("is file  exists "+ f1.exists());

	f1.delete();
	System.out.println("is file  exists "+ f1.exists());
	
	System.out.println(" file size "+ f1.length());
	System.out.println("is file  exists "+ f1.canWrite());
	System.out.println("is file  exists "+ f1.getName());
	
 }
}
