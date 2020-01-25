package emp;

import java.util.ArrayList;

//import Employee.java;
class EmployeeDB extends Employee1{
	ArrayList<Employee1> list = new ArrayList<>();
	boolean  addEmployee(Employee1 e) {
		list.add(e);
		return true;
	}
	boolean deleteEmployee(int empId) {
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i).getEmpId();
			if(n == empId) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("No data Found for Employee Id = " + empId);
		return false;
	}
	String showPaySlip(int empId) {
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i).getEmpId();
			if(n == empId) {
				return "Pay Slip = " + list.get(i).getEmpSalary();
			}
		}
		return "No data Found";
	}
	boolean listAll() {
		if(list.size() == 0)
			return false;
		System.out.println("EmpId  "+"Name   "+"Email  "+"Gender  "+"Salary  ");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).getEmployeeDetails();
		}
		return true;
	}
	boolean search(int empId) {
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i).getEmpId();
			if(n == empId) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("No data Found for Employee Id = " + empId);
		return false;
	}
}
