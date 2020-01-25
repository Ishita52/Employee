package emp;
import java.util.*;
public class M1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EmployeeDB obj = new EmployeeDB();
		System.out.println("Press 1 to add Employee Details");
		
		int emp = sc.nextInt();
		
		while(emp != -1) {
			switch(emp) {
				case 1:  
					System.out.println("Enter empId");
					int empId = sc.nextInt();
					System.out.println("Enter empName");
					String empName = sc.next();
					System.out.println("Enter empEmail");
					String empEmail = sc.next();
					System.out.println("Enter Gender M (Male) F (Female)");
					char empGender = sc.next().charAt(0);
					System.out.println("Enter Salary");
					float empSalary = sc.nextFloat();
					Employee1 data = new Employee1();
					data = new Employee1(empId,empName,empEmail,empGender,empSalary);
					obj.addEmployee(data);
					break;
				case 2:
					System.out.println("Enter empId you want to delete");
					empId = sc.nextInt();
					System.out.println(obj.deleteEmployee(empId));
					break;
				case 3:
					System.out.println("Enter empId whom you want to see PaySlip");
					empId = sc.nextInt();
					System.out.println(obj.showPaySlip(empId));
					break;
				case 4:
					System.out.println("Show all Employees data");
					obj.listAll();
					break;
				case 5:
					System.out.println("Enter empId to search employee");
					empId = sc.nextInt();
					System.out.println(obj.search(empId));
					break;
			}
			System.out.println("Add 1/ Delete 2/ Showpay 3/ listshow 4/ search 5");
			emp = sc.nextInt();
		}
		sc.close();
	}
}