package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		String path = "src/collections/database.properties";
		// 상대경로로 경로값 받아오기
		path = PropertiesExample.class.getResource("database.properties").getPath();
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(path));
			String driver = properties.getProperty("driver");
			String user = properties.getProperty("user");
			String pass = properties.getProperty("pass");
			String url = properties.getProperty("url");
			System.out.println("driver: " + driver);
			System.out.println("user: " + user);
			System.out.println("pass: " + pass);
			System.out.println("url: " + url);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
