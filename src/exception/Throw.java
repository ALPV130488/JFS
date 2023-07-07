package exception;

public class Throw {
	
	
	
	static void age(int age)
	{
		if (age<18)
		throw new ArithmeticException("age is not valid");
	}
	
	public static void main(String[] args) {
		
		Throw.age(12);
		
	}

}
