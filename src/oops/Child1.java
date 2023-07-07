package oops;

interface Parent1 // 100%
{

	int add(int a, int b);
}

public class Child1 implements Parent1 {

	public static void main(String[] args) {

		Child1 obj = new Child1();
	//	obj.add(2, 3);
		
		System.out.println(obj.add(2, 3));

	}

	@Override
	public int add(int a, int b) {

		return a + b;
	}
}
