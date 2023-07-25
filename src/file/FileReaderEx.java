package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\filehandling.txt");
		
		int i = fr.read();
		
		while(i!=-1)//runs till end of the line
		{
			System.out.println((char)i);
			
			i=fr.read();
		}
	}

}
//-1===>null