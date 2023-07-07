package oops;

class Parent {
	void displayMsg() {
		System.out.println("Iam from Parent");

	}

}

public class Child extends Parent {
	void sayHi() {
		
		System.out.println("Iam from Child");
		
	}
	
	public static void main(String[] args) {
		
		Child obj =new Child();
		
		obj.displayMsg();
		
		obj.sayHi();
		
		
		
	}

}
