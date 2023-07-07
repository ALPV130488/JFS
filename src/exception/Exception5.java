package exception;

import java.util.Scanner;

public class Exception5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number division :");
		int a = scanner.nextInt();
		System.out.println("Enter second number division :");
		int b = scanner.nextInt();
		try {
			System.out.println("division two numbers : " + (a / b));
		} catch (Exception e) {
//			System.out.println("dont enter zero as denominator");
//			System.out.println(e);//exception name;error type
//			e.printStackTrace();//to know error line number
			System.out.println(e.getMessage());
		}

		System.out.println("remaining  100 lines code ");

		scanner.close();

	}

}
