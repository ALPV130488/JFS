package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\Exception Handling.txt");
		
		BufferedReader br = new BufferedReader(f);
		
		String line =br.readLine();
		
		while(line!=null)
		{
			
			System.out.println(line);
			
			line=br.readLine();
		}
		
		f.close();
		
		
	}

}
