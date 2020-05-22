package file_handling;
import java.io.*;
//java program to write in a file using Buffered Writer
//FileWrite is the child class of Writer class
public class FileWriting {
	public static void main(String[] args) throws IOException{
		BufferedWriter buff = new BufferedWriter(new FileWriter("newfile2.txt"));
		String str="Are you afraid";
		buff.write(str);
		buff.close();
	}

}
