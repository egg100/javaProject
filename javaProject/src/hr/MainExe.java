package hr;

import java.util.List;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
		Set<Employee> empList = dao.getEmps();
		System.out.println("salary가 5000 이상인 사원정보>>");
		for(Employee emp : empList) {
			if(emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
		
		EmpDAO dao2 = new EmpDAO();
		Department[] deptList = dao2.deptList();
		System.out.println("manager가 있는 부서정보>>");
		for(Department dept : deptList) {
			if(dept != null && dept.getManagerId() != 0) {
				System.out.println(dept.toString());
			}
		}
	}
}
