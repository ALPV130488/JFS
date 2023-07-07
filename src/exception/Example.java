package exception;

import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the numerator");
		
		int firstnum=scan.nextInt();
		
		System.out.println("Enter the denominator");
		
		int secondnum =scan.nextInt();
		
		try {
		
		int result=(firstnum/secondnum);
		
		System.out.println(result);
		
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Dont enter 0 as the denominator");
			
		}
		
		finally 
		{
			System.out.println("error is cleared!!!");
		}
		
		
		System.out.println("The next 10000 lines of code!!!!!!");
		
//		Example obj=new Example();
		
		
	}

}
