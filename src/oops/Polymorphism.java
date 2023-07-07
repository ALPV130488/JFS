package oops;

public class Polymorphism {
	
	void add(int a,int b) {
		
		System.out.println("sum of two intergers:-"+(a+b));
	}
	
	void add(int a,int b,int c) {
		
		System.out.println("sum of three intergers:-"+(a+b+c));
	}

	void add(int a,float b) {
		
		System.out.println("sum of one int and one float:-"+(a+b));
	}
	
	void add(float a,float b) {
		
		System.out.println("sum of two float values:-"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Polymorphism obj=new Polymorphism();
		
		obj.add(2,3.4546f);
		
		
	
	}
	
}
