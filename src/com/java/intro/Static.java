package com.java.intro;

public class Static {
	
	static int staticcounter;//static var
	
	int instancecounter;//instance var
	
	void counter() {
		
	staticcounter++;
	
	instancecounter++;
			
	}
	
	void displayMsg() {
		
		System.out.println("staticcounter:-"+staticcounter);
		System.out.println("instancecounter:-"+instancecounter);
	}
	
	public static void main(String[] args) {//ctrl+space
		
		
		Static obj1=new Static();
		
		Static obj2=new Static();
		
		Static obj3=new Static();
		
		obj1.counter();
		
		obj2.counter();
		
	//	obj3.counter();
		
		obj2.displayMsg();
		
		
		
	}
	
	

}
