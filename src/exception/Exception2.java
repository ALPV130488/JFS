package exception;
class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 =10;
			int b=2;
			int c=a1/b;
			System.out.println(c);
		}catch (ArithmeticException ae) {
			System.out.println("dont enter zero as denominater");
		}
		try
		{
		int a[]=new int[5];//0,1,2,3,4    int a=123;    int a[]={1,2,3,4,5,6,5,7,.....};
		a[2]=1;																	
		a[4]=6;
		System.out.println(a[4]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("array maximum size is 4");
		}
		System.out.println("remaining lines of code");
	}
}