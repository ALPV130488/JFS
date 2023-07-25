package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Loginpage {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//(1)Loading the driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java123","java123");
		
		System.out.println("*******WEBSITE LOGIN*********");
		System.out.println("1.Registration");
		System.out.println("2.Login");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		switch(option)
		{
		case 1:
			//(3)Create the Statement
			System.out.println("Registration form.......");
			
			System.out.println("Enter Name:-");
			String name= scan.next();
			System.out.println("Enter Username:-");
			String username =scan.next();
			System.out.println("Enter password:-");
			String password = scan.next();
			PreparedStatement stmt =conn.prepareStatement("INSERT INTO GMAIL (NAME, USERNAME, PASSWORD) VALUES (?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, username);
			stmt.setString(3, password);
			int result =stmt.executeUpdate();
			if(result >0)
			{
				System.out.println("Registration Completed!!!");
			}
			
			break;
			//(4)Execute the Query
		case 2:System.out.println("Login......");
		System.out.println("Enter username:-");
		username = scan.next();
		System.out.println("Enter password:;");
		password= scan.next();
		stmt =conn.prepareStatement("SELECT * FROM GMAIL");
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Login Done......");
		}
		else
		{
			System.out.println("Invalid Credentials....");
			
		}
			
			
			break;
			
		default:
			
			//(5)Close connections.
			
			conn.close();
			
			break;
		
		
		}
	}

}
