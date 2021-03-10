package api;

import java.util.Map;
import java.util.Set;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("Path");
		System.out.println("JAVA_HOME: " + javaHome);
		Map<String, String> map = System.getenv();
		Set<String>set = map.keySet();
		for(String str : set) {
//			System.out.println(str + "," + map.get(str));
		} 
	}
}
