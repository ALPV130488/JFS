package exception;
public class Exception3 {
	public static void main(String args[]) {//40     24 1
		try {
			//file
			int a[] = new int[5];// 0,1,2,3,4
			a[7] = 30/0;//---->6
			String s="hello";
			int x=Integer.parseInt(s);
			System.out.println(x);
			System.out.println(s.length());
			System.out.println("no error  " + a[3]);
		}
		
		
		catch (ArithmeticException e) {
			System.out.println("dont enter zero denominator");}
		catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("index maximum size crossed");}
		catch (NumberFormatException e) {
		System.out.println("unable to convert string to number");}	
		catch(Exception e)
		{System.out.println("not handled"+e);}
		finally {//it will print in any case
			System.out.println("executes every time for closing connections");
			}
		System.out.println("remaining code  executed...");
		//
	}}