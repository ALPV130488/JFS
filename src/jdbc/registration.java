package jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class registration {

	private JFrame frame;
	private JTextField Txtfirstname;
	private JTextField Txtlastname;
	private JTextField Txtusername;
	private JTextField Txtcontact;
	private JTextField Txtadd;
	private JTextField Txtpin;
	private JTextField textpass;
	private JTextField textcnfrmpass;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public registration() throws SQLException {
		initialize();
		connect();
	}
	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	private JTextField textgender;
	
	public void connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?serverTimezone=UTC","root","saranya@2001");
		}
		catch(ClassNotFoundException ex)
		{
			
		}
		catch(SQLException e2) {
			
		}
	}
	
	public void table_load()
	{
		try {
			stmt=conn.prepareStatement("select * from forum");
			rs=stmt.executeQuery();
		} 	
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1027, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE SHOPPING REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(121, 10, 892, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 79, 464, 342);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 23, 115, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(29, 57, 115, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Username  :");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(29, 91, 115, 24);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contact      :");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(29, 227, 115, 24);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Address     :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(29, 261, 115, 24);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Pincode     :");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2.setBounds(29, 295, 115, 24);
		panel.add(lblNewLabel_1_1_1_1_2);
		
		Txtfirstname = new JTextField();
		Txtfirstname.setBounds(119, 27, 269, 19);
		panel.add(Txtfirstname);
		Txtfirstname.setColumns(10);
		
		Txtlastname = new JTextField();
		Txtlastname.setColumns(10);
		Txtlastname.setBounds(119, 61, 269, 19);
		panel.add(Txtlastname);
		
		Txtusername = new JTextField();
		Txtusername.setColumns(10);
		Txtusername.setBounds(119, 95, 269, 19);
		panel.add(Txtusername);
		
		Txtcontact = new JTextField();
		Txtcontact.setColumns(10);
		Txtcontact.setBounds(119, 231, 269, 19);
		panel.add(Txtcontact);
		
		Txtadd = new JTextField();
		Txtadd.setColumns(10);
		Txtadd.setBounds(119, 266, 269, 19);
		panel.add(Txtadd);
		
		Txtpin = new JTextField();
		Txtpin.setColumns(10);
		Txtpin.setBounds(119, 299, 269, 19);
		panel.add(Txtpin);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Password   :");
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_2.setBounds(29, 125, 115, 24);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Confrim Pass :");
		lblNewLabel_1_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_3.setBounds(10, 159, 115, 24);
		panel.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Gender      :");
		lblNewLabel_1_1_1_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_4.setBounds(29, 193, 115, 24);
		panel.add(lblNewLabel_1_1_1_4);
		
		textpass = new JTextField();
		textpass.setColumns(10);
		textpass.setBounds(119, 129, 269, 19);
		panel.add(textpass);
		
		textcnfrmpass = new JTextField();
		textcnfrmpass.setColumns(10);
		textcnfrmpass.setBounds(119, 163, 269, 19);
		panel.add(textcnfrmpass);
		
		textgender = new JTextField();
		textgender.setColumns(10);
		textgender.setBounds(119, 198, 269, 19);
		panel.add(textgender);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(61, 450, 119, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Firstname,Lastname,Username,Pass,Cnfrmpass,Gender,Add,Contact,Pin;
				
				
				Firstname = Txtfirstname.getText();
				Lastname = Txtlastname.getText();
				Username = Txtusername.getText();
				Pass = textpass.getText();
				Cnfrmpass=textcnfrmpass.getText();
				Gender=textgender.getText();
				Contact = Txtcontact.getText();
				Add = Txtadd.getText();
				Pin=Txtpin.getText();
				
				try {
					PreparedStatement stmt =conn.prepareStatement
("insert into forum(Txtfirstname,Txtlastname,Txtusername,textpass,textcnfrmpass,textgender,Txtcontact,Txtadd,Txtpin) value(?,?,?,?,?,?,?,?)");
							
					stmt.setString(1,Firstname);
					stmt.setString(2,Lastname);
					stmt.setString(3,Username);
					stmt.setString(4,Pass);
					stmt.setString(5,Cnfrmpass);
					stmt.setString(6,Gender);
					stmt.setString(7,Contact);
					stmt.setString(8,Add );
					stmt.setString(9,Pin);
					
					stmt.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Record Added...!!!!");
					
					Txtfirstname.setText("");
					Txtlastname.setText("");
					Txtusername.setText("");
					textpass.setText("");
					textcnfrmpass.setText("");
					textgender.setText("");
					Txtcontact.setText("");
					Txtadd.setText("");
					Txtpin.setText("");	
					
				}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(353, 450, 119, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(513, 89, 470, 383);
		frame.getContentPane().add(table);
	}
}
