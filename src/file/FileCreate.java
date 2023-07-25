package file;

import java.io.*;

public class FileCreate {
	
	public static void main(String[] args) throws IOException {
		
		File f =new File("C:\\Users\\PRADEEP GOUD\\Desktop\\"
				+ "filehandling.txt");//to provide the path  
		
		System.out.println(f.exists());//false
		
		System.out.println(f.createNewFile());//true
		
		System.out.println(f.exists());//true
		
		System.out.println(f.isDirectory());//false
		
		System.out.println(f.isFile());//true
		
		
		
		
		
		
	}
	

}
