package hr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		Map<String, String> map = dao.getJobList();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("jobId: " + key + "\t  jobTitle: " + map.get(key));
		}
		
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iter = set.iterator();
//		while(iter.hasNext()) {
//			Entry<String, String> ent = iter.next();
//			System.out.println("jobId: " + ent.getKey() + "\t  jobTitle: " + ent.getValue());
//		}
		
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
//		Set<Employee> empList = dao.getEmps();
//		System.out.println("salary가 5000 이상인 사원정보>>");
//		for(Employee emp : empList) {
//			if(emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
		
//		EmpDAO dao2 = new EmpDAO();
//		Department[] deptList = dao2.deptList();
//		System.out.println("manager가 있는 부서정보>>");
//		for(Department dept : deptList) {
//			if(dept != null && dept.getManagerId() != 0) {
//				System.out.println(dept.toString());
//			}
//		}
	}
}
