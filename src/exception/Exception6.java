package exception;//our class should extends exception
//parameterized constructor
class AgeNotValidException extends Exception
{	private int age;//global instance var
	public AgeNotValidException(int age) //paramatrized constructor
	{
		this.age=age;//to access the current class parameters.
	}
//	public String toString() {//it will display obj address
//		return "you are not eligable for vote  :"+age;
//	}
}
public class Exception6 
{
   static void validation(int age)  throws AgeNotValidException 
       {
     if(age<18)//real time exception
        throw new AgeNotValidException(age);//---------------->create an obj//creates the obj for exception cls
     else
      System.out.println("you are eligable to vote");
   }  
   public static void main(String args[])
      {
						try {
							Exception6.validation(9);
						} catch (AgeNotValidException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println(e);
							
					
							
						}	
						finally {
							System.out.println("executes every time");
						}
      System.out.println("rest of the code...");
  }
}