package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Hwang", "Park");
		
//		Collector<Object, ?, List<Object>> col = Collectors.toList();
		Collector<String, ?, List<String>> col = Collectors.toList();
		List<String> newList = list.stream() // Stream<String>
			.filter(s -> s.startsWith("H")) // Stream<String>
			.collect(col);
//			.collect(Collectors.toList());
		
		for(String str : newList) {
			System.out.println(str);
		}
		
		System.out.println("===========================================");
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList(); // List<Employee>
		Set<Employee> emps = dao.getEmps(); // Set<Employee>
		List<Employee> empList = emps.stream() //직무가 IT_PROG 사람들을 가져와서 List<Employee>에 담아보기.
			.filter(new Predicate<Employee>() {
				@Override
				public boolean test(Employee t) {
					return t.getJobId().equals("IT_PROG");
				}
			}) // Stream<Employee>
			.collect(Collectors.toList());
		
		empList.stream().forEach(s -> System.out.println(s));
	}
}
