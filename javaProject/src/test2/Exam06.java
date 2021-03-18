package test2;

import java.util.List;

import hr.EmpDAO;
import hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> emp = dao.getEmpList();
		Double avg = emp.stream()
			.filter(e -> e.getJobId().equals("IT_PROG"))
			.mapToInt(e -> e.getSalary())
			.average().orElse(0.0);
		System.out.println("개발자인 사원의 평균급여: " + avg);
	}
}
