package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f= new File("C:\\Users\\PRADEEP GOUD\\Desktop\\filehandling.txt");
		
		PrintWriter pw= new PrintWriter(f);
		
		pw.write(1234 );
		
		//pw.write(false);
		
		pw.print(false);
		
		
		pw.print(1234 );
		
		
		pw.print("super:-To access the parent class props into the child.\r\n" + 
				"\r\n" + 
				"(1)used to acces the variable of the parent cls\r\n" + 
				"(2)used to acces the methods of the parent cls\r\n" + 
				"(3)used to call the parametraizes constructor of the parent cls.\r\n" + 
				"");
		
		pw.print('b');
		
		pw.flush();
		
		pw.close();
		
		System.out.println("file is writtened succesfully");
		
		
		
	}

}
