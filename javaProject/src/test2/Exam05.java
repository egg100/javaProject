package test2;

import java.util.List;

import hr.EmpDAO;
import hr.Employee;

public class Exam05 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> emp = dao.getEmpList();
		Double avg = emp.stream()
			.peek(e -> System.out.println(e.getJobId()))
			.mapToInt(e -> e.getSalary())
			.average().getAsDouble();
		System.out.println("전체사원의 평균급여: " + avg);
	}
}
