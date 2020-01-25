package emp;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee1 {
	int empId;
	String empName;
	String empEmail;
	char empGender;
	float empSalary;
	Employee1(){
		
	}
	Employee1(int empId,String empName,String empEmail,char empGender,float empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpEmail() {
		return empName;
	}
	public char getEmpGender() {
		return empGender;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void getEmployeeDetails() {
		
		System.out.println(getEmpId()+"  "+getEmpName()+"  "+getEmpEmail()+"  "+getEmpGender()+"  "+getEmpSalary());
	}
}
