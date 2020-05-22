package file_handling;
import java.io.*;
//java program to write in a file using FileOutputStream
public class FileOutput {
public static void main(String[] args) throws IOException {
	File f1= new File("newfile2.txt");
	f1.createNewFile();
	FileOutputStream fout = new FileOutputStream("newfile2.txt");
	
//	
//	int a=2;
//	fout.write( (int)a);    //code not working
//	fout.close();
	
	String s=" are you okay";
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		fout.write(ch[i]);
	}
	fout.close();
}
}
