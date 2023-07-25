package jpademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="emp")
public class Employee1 {
	
	@Id
	
	@Column(name="empId" ,length=10)	
	private int empno;
	@Column(name="empName" ,length=10)
	private String empname;
	@Column(name="empSal" ,length=10)
	private int empsal;
	@Column(name="empAdd" ,length=10)
	private String empadd;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public Employee1(int empno, String empname, int empsal, String empadd) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	
	
	
	
	
	
	

}
