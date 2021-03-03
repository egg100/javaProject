package objects2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("매개값["+i+"]: " + args[i]);
		}
		Calculator.getRect(4.5, 2);
//		Calculator.getArea(3.5); 스테틱이 아니라서 인스턴스 생성전에 사용불가
		Calculator cal = new Calculator();
		double result = cal.getArea(3.5);
		
//		MethodExample me = new MethodExample();
//		me.sum(10, 20);
		sum(10, 20);

		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student();
		s1.run();
		s1.study();
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
