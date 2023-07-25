package string;

public class StringEx1 {

	public static void main(String[] args) {

		String name = "apple";

		String name1 = "apple";

		String name2 = "apple";

		System.out.println(name2 == name1);//true

		System.out.println(name2.equals(name1));//true

		System.out.println(name2.compareTo(name1));//0

		System.out.println(name2.equalsIgnoreCase(name1));//true

		String name3 = new String("apple");

		String name4 = new String("apple");

		String name5 = new String("apple");

		System.out.println(name5 == name4);//false

		System.out.println(name5.equals(name4));//true

		System.out.println(name5.compareTo(name4));//0

		System.out.println(name5.equalsIgnoreCase(name4));//true
		
		StringBuffer name6=new StringBuffer("apple");
		
		StringBuffer name7=new StringBuffer("apple");
		
		System.out.println(name7 == name6);//false

		System.out.println(name7.equals(name6));//true

//		System.out.println(name5.compareTo(name4));//0
//
//		System.out.println(name5.equalsIgnoreCase(name4));//true
		
		
	}

}
