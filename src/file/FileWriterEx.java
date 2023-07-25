package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
	
	
	FileWriter fw= new FileWriter ("C:\\Users\\PRADEEP GOUD\\Desktop\\filehandling1.txt");
		
	fw.write(97);
	
	fw.write(1234);
	
	
	fw.write("good \n morning");
	
	char[] ch = {'a','b','c'};
	
	fw.write(ch);
	
	fw.write("\n");
	
	System.out.println("file is created and written into it succesfully");
	
	
	fw.flush();//push the remaining data
	
	fw.close();
	
	}
}
