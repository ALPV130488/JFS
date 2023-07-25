package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\filehandling1.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(100);
		
		bw.newLine();
		
		char[] ch= {'a','b','c'};
		
		bw.newLine();
		
		bw.write(ch);
		
		bw.newLine();
		
		bw.write("welcome");
		
		bw.flush();
		
		bw.close();
		
		fw.close();
		
		System.out.println("file is writtened succesfully");
	
	
	
	
	}

}
